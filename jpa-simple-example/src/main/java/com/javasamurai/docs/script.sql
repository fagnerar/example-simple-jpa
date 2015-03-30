drop database if exists jpa_simple_example_db;
create database jpa_simple_example_db;
use jpa_simple_example_db;

CREATE TABLE T_SAMURAI (
  `id_samurai` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `birthday` DATE NULL,
  `gender` VARCHAR(1) NULL,
  PRIMARY KEY (`id_samurai`));