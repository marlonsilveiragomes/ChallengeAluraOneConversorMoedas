Conversor de Moedas
Este projeto foi desenvolvido em Java como parte das aulas do programa Alura One - Oracle: BackEnd Java. Ele permite realizar conversões entre diferentes moedas com base nas taxas de câmbio mais recentes fornecidas pela API ExchangeRateAPI.

Funcionalidades

Conversão de moedas suportadas:

Real (BRL) ↔ Dólar (USD)

Euro (EUR) ↔ Dólar (USD)

Real (BRL) ↔ Euro (EUR)

Peso Argentino (ARS) ↔ Real (BRL)

Iene Japonês (JPY) ↔ Real (BRL)

Dados atualizados com a ExchangeRateAPI.

Interface interativa de linha de comando para facilitar a entrada de dados.
Tecnologias Utilizadas

Linguagem: Java

Versão do JDK: 17

IDE: IntelliJ IDEA

Biblioteca: Gson para manipulação de JSON

API: ExchangeRateAPI para taxas de câmbio.



Como Configurar o Projeto: Pré-requisitos

JDK 17 instalado.
IntelliJ IDEA ou outra IDE compatível.
Conexão com a Internet para consumir a API.
Configuração do Projeto
Clone o Repositório

bash
Copiar código
git clone git@github.com:marlonsilveiragomes/ChallengeAluraOneConversorMoedas.git
Adicione a Biblioteca Gson ao Projeto
Baixe o arquivo .jar do Gson em Maven Repository - Gson e adicione ao classpath do projeto na IDE.

Configure sua API Key da ExchangeRateAPI

Obtenha sua chave gratuita em ExchangeRateAPI.
Substitua o valor da constante API_KEY no arquivo ServicoConversor pela sua chave:
java
Copiar código
private static final String API_KEY = "SUA_CHAVE_API";
Como Executar

Execute o método main na classe ConversorMoedas.
Escolha uma das opções do menu para conversão.
Informe o valor a ser convertido e visualize o resultado.
Exemplo de Uso
Entrada no terminal:
markdown
Copiar código
Selecione a opção de conversão:
1. Real para Dollar
2. Dollar para Real
3. Euro para Dollar
4. Real para Euro
5. Peso Argentino para Real
6. Real para Peso Argentino
7. Iene Japonês para Real
0. Encerrar


   1
   Informe o valor para conversão: 100
   Saída esperada:
   yaml
   Copiar código
   Taxa de câmbio de BRL para USD: 0.2025
   Valor convertido: 20.25 USD
   Conversão Feita!
   Aprendizados
   Este projeto permitiu:

O aprendizado e uso de requisições HTTP em Java.
Manipulação de JSON com a biblioteca Gson.
Integração de uma aplicação Java com uma API REST.
Desenvolvimento prático com boas práticas de programação orientada a objetos (OOP).
Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

Desenvolvido por:
Marlon Silveira Gomes
GitHub | LinkedIn