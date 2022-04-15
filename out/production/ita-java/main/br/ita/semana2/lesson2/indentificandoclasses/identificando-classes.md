# Primeiro passo na construção de um projeto utilizando a modelagem CRC.

 - procurar substantivos o texto da requisição da aplicação (identificar os domínios)
 - Analisar potenciais objetos e classes
Exemplo -  biblioteca:
   - Sistema de automação da Biblioteca: A **_Biblioteca_** tem um **_nome_**, mantém um _**catálogo de livros**_, 
     onde cada livro tem um **_título_**, **_Autor_** e **_número único de catálogo_** (id). 
     Há **_usuários da biblioteca_** registrados, cada...

   - Biblioteca
   - nome
   - catálogo-de-livros
   - livro
   - autor
   - número-único-de-catálogo
   - usuários-biblioteca

# Segundo Passo: Refinar os recursos.
 - filtrar sinónimos que representam a mesma classe
 - Retirar nomes que representam atributos.
 - Identificar relação entre os substantivos. relacionamentos de herança
 - Descrever o que cada classe faz. (abstrair o domínio).

## Lista de substantivos biblioteca:
- Bibliotecária -> Ator que apenas interage com o sistema.

 ## - Biblioteca = SAB = Sistema -> classe |
  - nome -> atributo                   |
    - catálogo-de-livros -> atributo     |
      ## - livro -> classe -> (lista de atributos autor)
        - titulo -> atributo 
        ## - autor -> classe (filha de pessoa*) atributo livro
               - número-único-de-catálogo -> atributo
               - nome
               - lista-de-livros        
      - usuários-biblioteca -> classe (filha de pessoa*) (lista de atributos biblioteca)   
      - nome-único-usuário ->  atributo

## cartão crc exemplo:
    classe: Bibliioteca
    Descrição: representa o SAB
Responsabilidades | Colaborações

 
 
 
