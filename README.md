# Construindo um Projeto Ágil no GitHub: Sistema de Cadastro/Login (Java)

##  1. Objetivo e Contexto do Projeto

Este repositório simula o desenvolvimento e a gestão de um projeto de software, aplicando os conceitos de Engenharia de Software e a metodologia ágil, conforme proposto pelo desafio da disciplina.

O sistema implementa um **Sistema Básico de Cadastro e Login de Usuários em Java**, utilizando a arquitetura Model-View-Controller (MVC) para organização do código e **Serialização/Desserialização** para persistência dos dados em arquivos (simulando um CRUD simples).

##  2. Metodologia de Gestão (Kanban)

Adotamos a metodologia ágil com o framework **Kanban** para gerenciar o fluxo de trabalho. A ferramenta **GitHub Projects** foi utilizada para criar e manter o quadro de tarefas, que reflete o estado do desenvolvimento. O quadro segue as colunas padrão: **A Fazer**, **Em Andamento** e **Concluído**.

### 2.1. Simulação de Mudança de Escopo

Durante o desenvolvimento, simulamos uma alteração de requisito (Mudança de Escopo) solicitada pelo cliente. A nova funcionalidade adicionada foi:

* **Feature:** Implementação da funcionalidade **UPDATE**, permitindo ao usuário alterar seu e-mail.
* **Gestão:** Esta funcionalidade foi incorporada como um card de alta prioridade na coluna **A Fazer** do Kanban, demonstrando a adaptabilidade do time à mudança.


##  3. Escopo e Status das Entregas

| Área de Foco | Requisitos Chave | Status |
| :--- | :--- | :--- |
| **Código Base** | Cadastro (CREATE) e Login (READ) de Usuários com Serialização. | ✅ Concluído |
| **Planejamento** | Quadro Kanban no GitHub Projects (Mínimo de 10 cards) e `README.md`. | ➡️ Em Andamento |
| **Qualidade** | Implementação de Testes Automatizados (JUnit). | ⏳ A Fazer |
| **Integração Contínua** | Configuração do Pipeline de CI/CD via GitHub Actions. | ⏳ A Fazer |
| **Documentação** | Elaboração dos diagramas UML (Classes e Casos de Uso) e Documento Teórico. | ⏳ A Fazer |

### Tecnologias Utilizadas

* **Linguagem:** Java
* **Arquitetura:** MVC
* **Persistência:** Serialização (I/O de arquivos)
* **Gestão:** GitHub Projects (Kanban)
* **Qualidade:** JUnit 
* **CI/CD:** GitHub Actions

##  4. Como Executar o Projeto

1.  **Clone o Repositório:**
    ```bash
    git clone [INSERIR LINK DO SEU REPOSITÓRIO]
    ```
2.  **Estrutura:** Garanta que a estrutura de diretórios (`/src`, `/tests`, `/database`) esteja correta.
3.  **Execução:** O projeto é executado a partir do método `main` da classe `App.java`.
