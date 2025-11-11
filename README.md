# 🧩 Sistema de Cadastro/Login (Java)

## 1. Objetivo e Contexto do Projeto
Este repositório apresenta o desenvolvimento de um **Sistema de Cadastro e Login de Usuários em Java**, criado como parte de um desafio prático de **Engenharia de Software**.  
O projeto aplica princípios de **metodologias ágeis** e boas práticas de **arquitetura MVC (Model-View-Controller)**, simulando um ambiente real de desenvolvimento colaborativo.

O sistema permite **cadastrar novos usuários, autenticar logins e armazenar os dados via serialização em arquivos `.ser`**, simulando um CRUD simples sem banco de dados externo.

---

## 2. Metodologia de Gestão (Kanban)
A metodologia escolhida foi **Kanban**, utilizando o **GitHub Projects** para gerenciar as tarefas e acompanhar o progresso das entregas.

O quadro foi dividido em três colunas principais:
- **A Fazer**
- **Em Andamento**
- **Concluído**

Essa abordagem visual permitiu acompanhar o fluxo de trabalho e priorizar entregas de forma contínua e organizada.

### 2.1. Simulação de Mudança de Escopo

Durante o desenvolvimento, foi simulada uma alteração de requisito solicitada pelo cliente: a necessidade de evitar que novas instâncias de usuários sobrescrevessem arquivos .ser com nomes idênticos.

> *Nova funcionalidade:* Implementação de uma lógica de serialização que adiciona uma contagem incremental de arquivos .ser, gerando um identificador único para cada instância salva.

Essa melhoria garantiu que diferentes usuários com o mesmo nome fossem armazenados separadamente, preservando a integridade dos dados.  
A tarefa foi registrada no *Kanban* como um card de prioridade alta, representando a adaptação do time frente a uma mudança de escopo técnica.

---

## 3. Escopo e Status das Entregas

| Área de Foco | Requisitos Chave | Status |
|---------------|------------------|:------:|
| **Código Base** | Cadastro (CREATE) e Login (READ) de usuários com serialização | ✅ Concluído |
| **Planejamento** | Quadro Kanban no GitHub Projects (mínimo de 10 cards) e README.md | ✅ Concluído |
| **Qualidade** | Testes automatizados configurados via GitHub Actions | ✅ Concluído |
| **Integração Contínua** | Pipeline CI/CD via GitHub Actions (compilação e verificação de sintaxe) | ✅ Concluído |
| **Documentação** | Diagramas UML (Casos de Uso e Classes) e Documento Teórico | ✅ Concluído |

---

## 4. Tecnologias Utilizadas

| Categoria | Ferramenta / Tecnologia |
|------------|--------------------------|
| **Linguagem** | Java |
| **Arquitetura** | MVC (Model-View-Controller) |
| **Persistência** | Serialização (I/O de arquivos `.ser`) |
| **Gestão de Tarefas** | GitHub Projects (Kanban) |
| **Qualidade** | GitHub Actions (build e checagem de sintaxe) |
| **Modelagem** | UML (Casos de Uso e Diagrama de Classes) |

---

## 5. Como Executar o Projeto

### 🧱 Clonar o Repositório
```bash
git clone https://github.com/Kaio-Andrade/login-system-1.git
```

### 📁 Estrutura Esperada
```
/src
  ├── br/com/fecaf/
  │   ├── App.java
  │   ├── ControllerUsuario.java
  │   ├── HomeController.java
  │   ├── model/
  │   │   └── Usuario.java
  │   └── view/
  │       ├── Home.java
  │       ├── Login.java
  │       └── CadastrarUsuario.java
/database
/tests
```

### ▶️ Execução
Execute o projeto a partir do método `main` da classe:
```
br.com.fecaf.App
```

### 🧪 Testes Automatizados
O repositório contém um workflow GitHub Actions configurado para **compilar automaticamente o projeto** e verificar erros de sintaxe sempre que há um *push* ou *pull request* na branch `main`.

--

## 6. Diagramas UML

### 📘 Diagrama de Casos de Uso


### 📗 Diagrama de Classes




## 7. Créditos e Autoria
Desenvolvido por **Kaio**, estudante de Engenharia da Computação, como parte de um projeto acadêmico voltado à prática de **Engenharia de Software, Metodologias Ágeis e Modelagem UML**.

