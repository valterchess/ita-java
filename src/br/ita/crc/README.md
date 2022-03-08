## Classe, responsabilidade e Colaboração:

### **Identificação de responsabilidades:**
#### Caracterizar e identificar responsabilidades de uma classe.

Identificar atributos e comportamentos(métodos) de uma classe
através do *Antropomorfismo*,
um conceito que permite aplicar características do ser humano
em seres inanimados ou irracionais.

Ou seja, questionar quais comportamentos e/ou características podem ser abstraídas do mundo real e aplicadas.

## Responsabilidade: 
### Constitui o que a classe:
<li>Sabe(tem)
<li>Faz
(Existem dois tipos de responsabilidades)

### O que um objeto *'sabe'*:
    Conhecimento que ele mantém;
    ou estado que detém;
    (variáveis de instância).

### O que um objeto faz:
    ação que ele realiza;
    Comportamento;
    (métodos).

    Classe
        |                _____________
        |Estado -------> (atributos) |  
        |                            |-> Responsabilidades
        |Comportamento -> (métodos)  |
        |                
        

## Lógica das responsabilidades:

Ao observarmos uma responsabilidade como método.
É importante saber quais ações aquela responsabilidade realiza,
ou seja, definir o algoritmo (sequência lógica finita) 
que está por trás desse futuro método.
E é possível fazer isso é analisar quais ações precisam ser feitas.

#### Por exemplo:

Responsabilidade:
    
    "Sabe o número da conta?"

        |Objeto conta tem 
        |atributo número da
        |conta
        |
        |Objeto devolve o 
        |valor do número da
        |conta