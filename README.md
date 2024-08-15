Este projeto é uma simulação de um ambiente de cadastro de games dentro de um banco de dados de informação, como uma Wiki de games.

O banco de dados utilizado no MySQL Workbench foi este abaixo:

  create database dbcrud;
  use dbcrud;  
  create table game(
    id int auto_increment primary key,
    nome varchar(100), 
    sinopse varchar(1000), 
    datalancamento varchar(10), 
    preco double, 
    plataforma varchar(100), 
    quantidadesvendidas double, 
    categoria varchar(100), 
    desenvolvedora varchar(100), 
    notametacritic double
  ); 
  select * from game;
