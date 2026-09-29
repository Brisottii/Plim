-- PLIM FINTECH - Script de criação das tabelas (Oracle)
-- Baseado no modelo físico da Fase 3

CREATE TABLE usuario (
    id_usuario      NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome            VARCHAR2(100) NOT NULL,
    email           VARCHAR2(150) NOT NULL,
    telefone        VARCHAR2(20),
    data_cadastro   DATE DEFAULT SYSDATE,
    status          CHAR(1)
);

CREATE TABLE conta (
    id_conta            NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome_conta          VARCHAR2(80) NOT NULL,
    saldo_atual         NUMBER(12,2) DEFAULT 0,
    data_atualizacao    DATE DEFAULT SYSDATE,
    id_usuario          NUMBER NOT NULL,
    CONSTRAINT conta_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE categoria (
    id_categoria    NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome_categoria  VARCHAR2(80) NOT NULL,
    tipo_categoria  CHAR(1),
    cor             VARCHAR2(20),
    ativa           CHAR(1) DEFAULT 'S',
    id_usuario      NUMBER NOT NULL,
    CONSTRAINT categoria_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE transacao (
    id_transacao    NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    descricao       VARCHAR2(200),
    tipo_transacao  CHAR(1) NOT NULL,          -- 'R' = receita, 'D' = despesa
    valor           NUMBER(12,2) NOT NULL,
    data_transacao  DATE NOT NULL,
    data_cadastro   DATE DEFAULT SYSDATE,
    forma_pagamento VARCHAR2(30),
    status          VARCHAR2(20),
    observacao      VARCHAR2(200),
    id_usuario      NUMBER NOT NULL,
    id_conta        NUMBER NOT NULL,
    id_categoria    NUMBER,
    CONSTRAINT transacao_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    CONSTRAINT transacao_conta_fk FOREIGN KEY (id_conta) REFERENCES conta(id_conta),
    CONSTRAINT transacao_categoria_fk FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

CREATE TABLE investimento (
    id_investimento             NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome_investimento           VARCHAR2(100) NOT NULL,
    tipo_investimento           VARCHAR2(80),
    instituicao                 VARCHAR2(80),
    valor_inicial               NUMBER(12,2) NOT NULL,
    data_inicio                 DATE NOT NULL,
    rentabilidade_percentual    NUMBER(6,2),
    status                      VARCHAR2(20),
    id_usuario                  NUMBER NOT NULL,
    CONSTRAINT investimento_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE meta_financeira (
    id_meta         NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome_meta       VARCHAR2(100) NOT NULL,
    descricao       VARCHAR2(200),
    valor_objetivo  NUMBER(12,2) NOT NULL,
    data_inicio     DATE DEFAULT SYSDATE,
    data_limite     DATE,
    status          VARCHAR2(20),
    id_conta        NUMBER NOT NULL,
    id_usuario      NUMBER NOT NULL,
    CONSTRAINT meta_conta_fk FOREIGN KEY (id_conta) REFERENCES conta(id_conta),
    CONSTRAINT meta_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

CREATE TABLE movimentacao_meta (
    id_mov_meta         NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    tipo_movimentacao   CHAR(1),
    valor               NUMBER(12,2) NOT NULL,
    data_movimentacao   DATE DEFAULT SYSDATE,
    observacao          VARCHAR2(200),
    id_meta             NUMBER NOT NULL,
    id_conta            NUMBER NOT NULL,
    CONSTRAINT movmeta_meta_fk FOREIGN KEY (id_meta) REFERENCES meta_financeira(id_meta),
    CONSTRAINT movmeta_conta_fk FOREIGN KEY (id_conta) REFERENCES conta(id_conta)
);

CREATE TABLE movimentacao_investimento (
    id_mov_investimento NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    tipo_movimentacao   CHAR(1),
    valor               NUMBER(12,2) NOT NULL,
    data_movimentacao   DATE DEFAULT SYSDATE,
    observacao          VARCHAR2(200),
    id_investimento     NUMBER NOT NULL,
    id_conta            NUMBER NOT NULL,
    CONSTRAINT movinv_investimento_fk FOREIGN KEY (id_investimento) REFERENCES investimento(id_investimento),
    CONSTRAINT movinv_conta_fk FOREIGN KEY (id_conta) REFERENCES conta(id_conta)
);

CREATE TABLE relatorio (
    id_relatorio    NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    tipo_periodo    VARCHAR2(20),
    data_inicio     DATE,
    data_fim        DATE,
    total_receitas  NUMBER(12,2),
    total_despesas  NUMBER(12,2),
    saldo_periodo   NUMBER(12,2),
    data_geracao    DATE DEFAULT SYSDATE,
    id_usuario      NUMBER NOT NULL,
    CONSTRAINT relatorio_usuario_fk FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

