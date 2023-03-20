# Party Game: Batalhas Pokémon

Party game que usa as iniciais do nome das pessoas para definir tipos como nos jogos Pokémon, que então batalham entre si num estilo parecido com pedra-papel-tesoura.


## Primeiro Campeonato Generation Turma 61
Dinâmica de abertura criada por Danilo ([LinkedIn](https://www.linkedin.com/in/danilo-moraes-364a07207/)) e Rony ([LinkedIn](https://www.linkedin.com/in/rony-dos-santos-teles-29649a172/)) para o dia 20/03/23, da turma 61 do Bootcamp de Java Fullstack da Generation Brasil.
O campeão foi **Rafael Duarte**, com seus "Pokémon" *Giovana*, *Kelvin* e *Fernando*.
![Primeiro campeonato Pokémon](https://github.com/ronyrst/party-batalhas-pokemon/blob/main/Torneio%20Pok%C3%A9mon.png)


## Como Jogar
1. Rode o `Randomico.java` para receber uma lista de tipos nova e aleatória para cada letra. Como no exemplo:
```
  "planta","agua","planta","planta","fogo",
  "planta","agua","fogo","planta","planta",
  "fogo","agua","planta","planta","planta",
  "agua","fogo","fogo","planta","agua",
  "fogo","fogo","fogo","fogo","fogo",
  "agua"
```
No caso, o primeiro "planta" corresponderá à letra A; o segundo, "agua", à letra B e assim por diante.
A letra Z recebe, neste caso, o tipo "agua", último a aparecer na lista.

2. Substitua as linhas 191 a 196 em `Batalhas.java` e rode o código.
3. Daí em diante é só seguir o que se pede: Nomes dos treinadores que disputarão, número de batalhas que deseja disputar e o nome dos "Pokémon" que competirão.
Ao fim, o programa mostra o vencedor. Caso termine em empate, inicia-se uma disputa semelhante a pênaltis, na qual quem vencer primeiro recebe a vitória.

### Esquema das lutas:
A estrutura é semelhante a pedra-papel-tesoura:
- Fogo vence Planta
- Planta vence Água
- Àgua vence Fogo
