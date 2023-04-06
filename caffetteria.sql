DROP DATABASE IF EXISTS Caffetteria ;
 Create Database Caffetteria;
 USE Caffetteria;
 
 CREATE TABLE Caffe(
    caffeID INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(250) NOT NULL,
    Cognome VARCHAR(250) NOT NULL,
    codice VARCHAR(10) NOT NULL UNIQUE,
    quantita INTEGER,
    moltiplicatore INTEGER
);

INSERT INTO Caffe(nome, Cognome, codice, quantita, moltiplicatore) VALUES 
("Marco", "Pollon", "12", 1, 3);

 
SELECT * FROM Caffe;