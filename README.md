<h1 align="center">Sistema de Planejamento de Viagem</h1>

## Sobre o projeto

O projeto consiste em um sistema de planejamento de viagens, proporcionando aos usuários um resumo de suas jornadas. Ele resolve de maneira eficaz os desafios logísticos frequentes nas viagens, como a gestão de fusos horários divergentes entre países e estimativas de tempo de deslocamento.

Exemplo de utilização do sistema:

```
Planejar uma nova viagem ou encerrar o sistema?
    1) Sim
    2) Encerrar Sistema

Entre com a opção desejada: 1
Entre com o nome da cidade origem: Rio de Janeiro
Entre com o nome da cidade destino: Tokyo
Entre com a data e o horário da partida (formato: dd/mm/aaaa hh:mm:ss): 10/08/2023 12:00:00
Entre com a distância em km entre a cidade de origem e a de destino: 17.800


---------------------------- Resumo da Viagem ----------------------------
Partida: 10/08/2023 12:00:00
Origem: Rio de Janeiro

Chegada: 11/08/2023 19:00:00
Destino: Tokyo

Atenção: o desembarque em Tokyo será: 11/08/2023 19:00:00 no horário de Tokyo e 11/08/2023 13:00:00 no horário de Rio de Janeiro
--------------------------------------------------------------------------


Planejar uma nova viagem ou encerrar o sistema?
    1) Sim
    2) Encerrar Sistema

Entre com a opção desejada: 2
Encerrando o sistema...
Sistema Encerrado!
```

## Tecnologias utilizadas

- [Java](https://www.java.com/pt-BR/) - Linguagem de programação

## Funcionalidades

- Planejar uma nova viagem;
- Encerrar o sistema.

## Instalação

```bash
# Clonar Projeto
$ git clone git@github.com:lucas-da-silva/java-planejamento-de-viagem.git

# Entrar no diretório
$ cd java-planejamento-de-viagem

# Execute o arquivo Principal.java pela IDE
```

## Estrutura do projeto

```
$PROJECT_ROOT
|   # Arquivos de configuração do Maven
├── .mvn
|   # Código fonte da aplicação
└── src
```

## Autor

- [@lucas-da-silva](https://github.com/lucas-da-silva)
