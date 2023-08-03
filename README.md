<h1>Shop - Backend</h1>

<p align="center">
  <a href="#pre-requisites">Pré-requisitos</a> •
  <a href="#how-to-use">Instalando o projeto</a> •
  <a href="#related">Frontend</a> •
  <a href="#license">Licença</a>
</p>

Essa aplicação foi desenvolvido durante o estudo utilizando **Java Spring e Spring MVC** para criação do servidor, **Spring Data JPA** para manipulação e persistência de dados, **Lombok** para geração de boilerplates e Postgres Driver para realizar a conexão com banco de dados Postgress.

<h2 id="pre-requisites">💻 Requisitos</h2> 

* Para rodar esse projeto você precisa ter o Java instalado na sua máquina.
* Ter um acesso ao um banco no caso utilizamos o postgres

```bash
-- Script auxiliares DDL e DML para rodar a aplicação.
-- Para a utilização no banco o UUID devemos instalar a extensão “uuid-ossp” através do comando abaixo:

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Criando entidade

CREATE TABLE item (
    id uuid DEFAULT uuid_generate_v4 (),
    title VARCHAR NOT NULL,
    image VARCHAR NOT NULL,
    price NUMERIC NOT NULL,
    PRIMARY KEY (id)
);

-- Seleção da tabela "ITEM"

select * from item;

-- Inserindo valor para realizar consulta via postman

insert into item (title,image,price)
values('Mouse','https://m.media-amazon.com/images/I/61ni3t1ryQL._AC_SX522_.jpg',10.0);

-- Deletando item na entidade por ID 

delete from item where id = 'ab4e61dd-6482-4fc5-825c-575bce728e78';
```


<h2 id="how-to-use"> 🚀 Instalando o projeto</h2>

Primeiro você deve clonar o repositório,

```bash
# Clone o repositório
$ git clone https://github.com/maikcosta/shop

# Crie o diretorio
$ mkdir shop

# Acesse-o
$ cd shop
```

Agora, dentro do IntelliJ, vamos instalar as depedências com o Maven>Lifecycle>package


E por fim, entre no arquivo da classe `ShopApllication` para executar o projeto, clicando sobre a classe com botão direito do mouse e ir em > Run 'ShopApplication.main()' ou Ctrl+Shift+F10



<h2 id="related">🫂 Integração com Frontend</h2>

Para realizar a integração com o Frontend, você pode clonar o projeto e rodar localmente.

👉 [Link do repositório](https://github.com/maikcosta/shop-frontend)

## 📱 Minhas Redes

Meu site: [Maik Costa](https://maikcosta.github.io/) &nbsp;&middot;&nbsp; 

Instagram: [@maikcosta](https://www.instagram.com/maikcosta/) &nbsp;&middot;&nbsp;

YouTube [@maikcosta](https://www.youtube.com/@maikcosta) &nbsp;&middot;&nbsp;


## 📝 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.
