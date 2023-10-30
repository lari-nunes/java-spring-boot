# Projeto TodoList
TodoList simples feito com Java e Spring Boot. Ele permite que os usuários criem, editem e atualizam tarefas.

[![My Skills](https://skillicons.dev/icons?i=java,spring)](https://skillicons.dev)

  
## Índice

- [Instalação](#instalação)
- [Tecnologias](#tecnologias)
- [Acessar projeto](#acessar-projeto)
- [API Endpoints](#api-endpoints)
- [Deploy](#deploy)
  
## Instalação

1. Clona o repositório:

```bash
git clone https://github.com/lari-nunes/todoList-java-spring.git
```

2. Entre na pasta do projeto:
```bash
cd todoList-java-spring
```
3. Instale dependências com Maven

## Tecnologias
- Java 17
- Spring Boot 3.0.11
- JPA
- H2 Database
- Insomnia (testar endpoints)

## Acessar projeto

O projeto está acessível no endereço http://localhost:8080/.

## API Endpoints
A API fornece os seguintes endpoints:

```markdown
GET /tasks/ - Acessar tarefas criadas

POST /tasks/ - Criar uma nova tarefa

PUT /tasks/{id} - Atualizar uma tarefa

```

## Deploy

```markdown
GET https://todolist-spring-boot-383h.onrender.com/tasks/ - Acessar tarefas criadas

POST https://todolist-spring-boot-383h.onrender.com/tasks/ - Criar uma nova tarefa

PUT https://todolist-spring-boot-383h.onrender.com/tasks/{id} - Atualizar uma tarefa

```

