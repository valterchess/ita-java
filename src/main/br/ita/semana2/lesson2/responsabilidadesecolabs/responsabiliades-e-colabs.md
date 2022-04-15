# Responsabilidades da classe biblioteca:
  - sabe nome
  - sabe catálogo de livros
  - sabe lista de usuários
  - adiciona novo usuário
  - Adiciona novo livro ao catálogo
  - empresta livro
  - devolve livro
  - adiciona novo usuário
  - exibe livros disponíveis para empréstimo
  - exibe livros indisponíveis para empréstimo
  -
# Responsabilidades da classe Livro:

   - sabe título
   - sabe autor
   - sabe nº único do livro (id)
   - sabe disponibilidade de empréstimo
   - sabe usuário, se emprestado

# passo 6: descrever a lógica de cada responsabilidade
## emprestar livro:
- tem um livro para empréstimo
- marcar livro como emprestado -> nova responsabilidade (classe livro)
- Anexa usuário como 'emprestador' do livro -> nova responsabilidade (classe livro)
- Anexa Livro a lista de livros do usuário -> nova responsabilidade (classe usuário)

### Classe biblioteca depende da class livro e depende da classe usuário
