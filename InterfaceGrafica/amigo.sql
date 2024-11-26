-- Criação do banco de dados
CREATE DATABASE bdAmigos_felps;

-- Seleciona o banco de dados para uso
USE bdAmigos_felps;

-- Criação da tabela "amigo"
CREATE TABLE `amigo` (
    `id_amigo` INT(11) AUTO_INCREMENT NOT NULL,  -- Corrigido AUTO_INCREMENT
    `nome` VARCHAR(40) DEFAULT NULL,
    `apelido` VARCHAR(40) DEFAULT NULL,
    `telefone` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY(`id_amigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Inserção de dados na tabela "amigo"
INSERT INTO `amigo` (`nome`, `apelido`, `telefone`) VALUES
    ('Anderson Augusto', 'And', '11988885275'),
    ('Gabriel Lima', 'Lima', '11969256946'),
    ('Gabriel Ortiz', 'Ortiz', '11987656789'),
    ('Felipe Daniel', 'Felps', '11906453626'),
    ('Joao Pedro', 'Joao', '11987456932'),
    ('Matheus Vinicius', 'Mavine', '11959613485');

-- Consulta para verificar os dados inseridos
SELECT * FROM amigo;


