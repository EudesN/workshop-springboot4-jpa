# workshop-springboot4-jpa
Este projeto é uma API RESTful construída com Spring Boot 4 e Java 25. O objetivo é demonstrar a implementação de um modelo de domínio complexo com associações (um-para-muitos, muitos-para-muitos), persistência de dados com JPA/Hibernate e tratamento de exceções customizado. O Projeto desenvolvido durante estudos em Java, baseado em curso online.

## *Tecnologias Utilizadas*
* Java 25

* Spring Boot 4.0.1

* Spring Data JPA
 
* Banco de Dados H2 (Ambiente de teste)

* PostgreSQL (Driver pronto para produção)

* Maven

## *Modelo de Domínio*
A aplicação gerencia um sistema de vendas com as seguintes entidades:

* **User**: Clientes do sistema.

* **Order**: Pedidos realizados pelos usuários.

* **Product**: Produtos disponíveis para venda.

* **Category**: Categorias dos produtos (Associação Many-to-Many com Product).

* **OrderItem**: Itens específicos de cada pedido (Chave composta).

* **Payment**: Informações de pagamento do pedido.