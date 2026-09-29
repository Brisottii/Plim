# Plim ✦

Projeto acadêmico FIAP (Turma 1TDSOD) — fintech de controle financeiro.
Tela desenvolvida: **Cartão/Perfil** (HTML + CSS + Tailwind CSS compilado localmente, sem CDN).

## Estrutura

```
plim/
├── index.html            tela Cartão/Perfil
├── src/input.css         Tailwind + estilos próprios do Plim
├── dist/output.css       CSS compilado (gerado pelo Tailwind)
├── tailwind.config.js
├── package.json
├── docs/                 PDFs das atividades e export do Figma
├── sql/create-tables.sql script Oracle (modelo físico da Fase 3)
├── java/plim-java/       versão 1 das classes (com Meta)
└── java/plim-heranca/    versão com herança (Transacao > Despesa/Receita)
```

## Como rodar

1. Instale o [Node.js](https://nodejs.org) (LTS).
2. Na pasta do projeto: `npm install`
3. Compile o CSS: `npm run build` (ou `npm run watch` enquanto edita)
4. Abra o `index.html` no navegador.

## Links

- GitHub: _(cole aqui o link do repositório)_
- Figma: _(cole aqui o link do arquivo)_
