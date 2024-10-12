# Sistema de Gerenciamento de Projetos e Tarefas

Este projeto é um sistema simples de gerenciamento de projetos e tarefas, desenvolvido em Java. Ele permite o cadastro de projetos, adição de tarefas aos projetos e a atribuição de membros responsáveis pelas tarefas. O sistema é baseado em quatro classes principais: `MainApp`, `Projeto`, `Tarefa` e `Membro`.

## Funcionalidades

- Cadastrar novos projetos.
- Adicionar tarefas a projetos existentes.
- Atribuir membros responsáveis às tarefas.
- Listar todos os projetos cadastrados.
- Visualizar detalhes de um projeto específico.

## Estrutura de Classes

### MainApp

Esta é a classe principal que contém o ponto de entrada do sistema e gerencia a interface de interação com o usuário. O menu de opções permite navegar pelas funcionalidades de cadastro de projetos, adição de tarefas e atribuição de membros.

**Métodos principais:**
- `cadastrarProjeto()`: Permite o cadastro de novos projetos.
- `adicionarTarefa()`: Adiciona uma tarefa a um projeto existente.
- `adicionarMembroATarefa()`: Atribui um membro a uma tarefa.
- `listarProjetos()`: Lista todos os projetos cadastrados.
- `mostrarProjetoEspecifico()`: Exibe os detalhes de um projeto específico.

### Projeto

A classe `Projeto` armazena as informações de um projeto e a lista de tarefas associadas a ele.

**Métodos principais:**
- `adicionarTarefa(String descricao, Membro membro, String status)`: Adiciona uma nova tarefa ao projeto.
- `listarTarefas()`: Lista todas as tarefas associadas ao projeto.

### Tarefa

A classe `Tarefa` representa uma tarefa dentro de um projeto. Cada tarefa possui um ID, descrição, status, e pode ter um membro responsável.

**Atributos principais:**
- `descricao`: Descrição da tarefa.
- `status`: Status atual da tarefa.
- `membroResponsavel`: Membro atribuído como responsável pela tarefa.

### Membro

A classe `Membro` armazena as informações de um membro da equipe, incluindo nome e cargo.

**Atributos principais:**
- `nome`: Nome do membro.
- `cargo`: Cargo ocupado pelo membro no projeto.

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Compile o projeto:
    ```bash
    javac Empresa/*.java
    ```

3. Execute a aplicação:
    ```bash
    java Empresa.MainApp
    ```

## Exemplo de Uso

Ao rodar o sistema, será exibido um menu com as seguintes opções:

----- MENU -----   
1 - Cadastrar Projeto   
2 - Adicionar Tarefa a um Projeto   
3 - Adicionar Membro a uma Tarefa   
4 - Listar Projetos   
5 - Mostrar Projeto específico (ID)   
6 - Sair
