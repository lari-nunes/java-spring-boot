package br.com.larissanunes.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import at.favre.lib.crypto.bcrypt.BCrypt;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired 
    // vai instanciar, gerenciar todo ciclo de vida da classe IUserRepository.
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){

        var user = this.userRepository.findByUsername(userModel.getUsername());

        if(user != null){
            // mensagem de erro e status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe!");
        }

        var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
        // o Bcrypt será usado quando quero criptografar minha senha, tornando-a mais segura.
        // gera um hash da senha do usuário usando o algoritmo Bcrypt com um custo de 12. O custo é um número que controla a complexidade do hash. Um custo maior torna o hash mais difícil de quebrar.
        
        userModel.setPassword(passwordHashred);
        // atualiza o campo password do objeto UserModel com o hash da senha. Isso garante que a senha armazenada no banco de dados esteja criptografada.

    
        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userCreated);
    }
    
}
