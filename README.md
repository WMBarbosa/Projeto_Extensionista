# Plataforma de Capacitação e Conectividade para Pequenos Negócios

Este repositório contém o projeto **Plataforma de Capacitação e Conectividade para Pequenos Negócios**, que tem como objetivo promover a inclusão digital de pequenos negócios em comunidades carentes. A plataforma oferece capacitação, conectividade e ferramentas tecnológicas que facilitam o crescimento desses empreendimentos.

## 🚀 Objetivos do Projeto

- **Capacitação digital:** Oferecer treinamentos e cursos voltados para o uso de ferramentas digitais e gestão de negócios.
- **Conectividade:** Proporcionar acesso a recursos que promovam a inclusão digital e facilitem a gestão dos pequenos negócios.
- **Inclusão e acessibilidade:** Tornar a tecnologia mais acessível para microempreendedores e pequenos negócios que estão fora do ambiente digital, promovendo a inclusão social e econômica.

## 🛠️ Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Backend:**
  - [Java](https://www.oracle.com/java/) com [Spring Boot](https://spring.io/projects/spring-boot) para a criação do backend RESTful.
  - **JPA (Java Persistence API)** para a persistência dos dados.
  - **PostgreSQL** ou **MongoDB** como banco de dados (dependendo da configuração de produção).
  
- **Frontend:**
  - O frontend da aplicação está em desenvolvimento (detalhes futuros podem ser adicionados).

## ⚙️ Funcionalidades

- **CRUD de Usuários:** Cadastrar, editar, listar e deletar usuários e empreendedores.
- **Autenticação e Autorização:** Implementação de controle de acesso para diferentes tipos de usuários (administradores e usuários comuns).
- **Integração com Banco de Dados:** A plataforma permite a integração com PostgreSQL ou MongoDB, dependendo do ambiente.
- **API RESTful:** Endpoints estruturados para a comunicação entre o frontend e o backend.

## 📂 Estrutura do Projeto

```bash
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/wmbarbosa/projeto_extensionista/ # Código-fonte principal
│   │   ├── resources/ # Arquivos de configuração e propriedades
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       └── application-prod.properties
│   ├── test/ # Testes unitários e de integração
├── public/ # Futuro frontend
└── README.md
```

## 🧑‍💻 Instalação e Execução Local

### Pré-requisitos

Certifique-se de ter o seguinte instalado:

- **Java 11** ou superior
- **Maven** para gerenciar dependências
- **PostgreSQL** ou **MongoDB** (dependendo do ambiente)

### Passos para executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/WMBarbosa/Projeto_Extensionista.git
   cd Projeto_Extensionista
   ```

2. Configure o banco de dados no arquivo `application.properties` para conectar-se ao seu ambiente local.

3. Execute o projeto utilizando o Maven:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a API via `http://localhost:8080` (por padrão).

## 📝 Próximos Passos

- Desenvolver a interface gráfica para facilitar o uso da plataforma.
- Implementar uma camada de segurança robusta para proteger os dados dos usuários.
- Adicionar integração com serviços externos (como APIs de pagamento).

## 📧 Contato

Se tiver dúvidas ou sugestões, entre em contato:

- **Nome:** Wesley Mario dos Santos Barbosa
- **Email:** [wesleymario01@gmail.com](mailto:wesleymario01@gmail.com)
- **GitHub:** [WMBarbosa](https://github.com/WMBarbosa)
- **LinkedIn:** [Wesley Mario](https://www.linkedin.com/in/wesley-mario/)
