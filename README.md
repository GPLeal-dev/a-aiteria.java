# Sistema de Açaiteria em Java

Aplicação de pedidos para uma açaiteria, desenvolvida para praticar Java, orientação a objetos, estruturas de decisão e construção de interfaces gráficas.

## O que o sistema faz

O programa permite:

- escolher entre açaí e cupuaçu;
- selecionar os tamanhos P, M ou G;
- calcular o preço de cada item;
- somar mais de um produto ao pedido;
- exibir o valor total;
- finalizar a compra.

Os valores cadastrados no projeto são:

| Produto | P | M | G |
|---|---:|---:|---:|
| Açaí | R$ 11,00 | R$ 16,00 | R$ 20,00 |
| Cupuaçu | R$ 9,00 | R$ 14,00 | R$ 18,00 |

## Como foi desenvolvido

O projeto foi construído em Java e separa as responsabilidades entre classes:

- `Acai`: define os preços do açaí por tamanho;
- `Cupacu`: define os preços do cupuaçu por tamanho;
- `cardapio`: implementa o atendimento pelo terminal;
- `Telaacaiteria`: cria a interface gráfica com Java Swing.

A lógica utiliza condicionais, repetição, leitura de dados e métodos específicos para consultar os preços.

## Tecnologias utilizadas

- Java
- Java Swing
- Programação orientada a objetos
- Eclipse IDE

## Como usar

### Pré-requisitos

- JDK instalado;
- Eclipse, IntelliJ IDEA ou outra IDE Java.

Baixe ou clone o repositório:

```bash
git clone https://github.com/GPLeal-dev/a-aiteria.java.git
```

O repositório também disponibiliza o arquivo `acaiteria.zip`. Extraia esse arquivo e importe o projeto na IDE. Em seguida, execute:

- `Telaacaiteria` para abrir a interface gráfica; ou
- `cardapio` para utilizar o menu pelo terminal.

Na interface, selecione o tamanho, escolha açaí ou cupuaçu, adicione os itens desejados e clique em **Finalizar compra**.

## Observação sobre os arquivos

Alguns arquivos com extensão `.java` presentes na raiz contêm bytecode compilado em vez do código-fonte em texto. Por isso, a forma mais indicada de abrir o projeto é extrair o arquivo `acaiteria.zip` e importá-lo em uma IDE Java.

## Autor

Desenvolvido por [Gabriel Leal](https://github.com/GPLeal-dev).
