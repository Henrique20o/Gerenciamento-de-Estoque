CREATE DATABASE MercadoDB;

USE MercadoDB;

CREATE TABLE Categorias (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Produtos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL UNIQUE,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id)
);

CREATE TABLE EntradaProdutos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_produto INT NOT NULL,
    quantidade INT NOT NULL,
    data DATETIME NOT NULL DEFAULT GETDATE(),
    FOREIGN KEY (id_produto) REFERENCES Produtos(id)
);

CREATE TABLE Vendas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    data DATETIME NOT NULL DEFAULT GETDATE(),
    valor_total DECIMAL(10,2) NOT NULL
);

CREATE TABLE ItensVenda (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_venda INT NOT NULL,
    id_produto INT NOT NULL,
    quantidade INT NOT NULL,
    valor_unitario DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (id_venda) REFERENCES Vendas(id),
    FOREIGN KEY (id_produto) REFERENCES Produtos(id)
);

