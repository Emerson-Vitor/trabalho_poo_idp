[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]


# Documentação de Uso - Aplicativo de Verificação de Sites

## Introdução

O aplicativo de verificação de sites em Java é projetado para verificar o status de uma lista de sites fornecidos em um arquivo de texto. Ele utiliza threads para realizar verificações simultâneas e registra os resultados em um arquivo JSON.
# Tecnologias Utilizadas

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

* [![Next][Next.js]][Next-url]
* [![React][React.js]][React-url]
* [![Vue][Vue.js]][Vue-url]
* [![Angular][Angular.io]][Angular-url]
* [![Svelte][Svelte.dev]][Svelte-url]
* [![Laravel][Laravel.com]][Laravel-url]
* [![Bootstrap][Bootstrap.com]][Bootstrap-url]
* [![JQuery][JQuery.com]][JQuery-url]

## Pré-requisitos

- [Java 17](https://www.oracle.com/java/technologies/javase-downloads.html) instalado no seu sistema.

## Instalação

1. Faça o download do arquivo JAR do aplicativo.

2. Abra o terminal.

3. Navegue até o diretório onde o arquivo JAR está localizado.

4. Execute o seguinte comando:

   ```bash
   java -jar out/artifacts/trabalho_poo_idp_jar/trabalho_poo_idp.jar caminho/do/seu/arquivo.txt caminho/do/seu/arquivo_de_log.json
   ```

   Certifique-se de substituir "trabalho_poo_idp.jar" pelo nome real do seu arquivo JAR e ajuste os caminhos dos arquivos de acordo.

## Argumentos

O aplicativo requer dois argumentos na linha de comando:

1. **Caminho do Arquivo de Texto:**
    - Especifique o caminho do arquivo de texto que contém as URLs dos sites a serem verificados.

2. **Caminho do Arquivo de Log JSON:**
    - Especifique o caminho do arquivo JSON onde os resultados da verificação serão registrados.

   Exemplo:

   ```bash
   java -jar out/artifacts/trabalho_poo_idp_jar/trabalho_poo_idp.jar caminho/do/seu/arquivo.txt caminho/do/seu/arquivo_de_log.json
   ```

## Personalização

- **Implementação de SiteChecker:**
    - Personalize a lógica de verificação de sites implementando a interface `SiteChecker`. Modifique as classes `WorkingSite` e `FaultySite` conforme necessário.

- **Lógica de Verificação:**
    - A lógica de verificação de sites usando threads está no método `startSiteVerification` na classe principal. Adapte conforme suas necessidades específicas.

- **Caminho do Arquivo de Log:**
    - O caminho do arquivo de log é passado como segundo argumento na linha de comando. Personalize conforme necessário.

## Exemplo de Uso

```bash
java -jar out/artifacts/trabalho_poo_idp_jar/trabalho_poo_idp.jar caminho/do/seu/arquivo.txt caminho/do/seu/arquivo_de_log.json
```

Isso iniciará a verificação dos sites listados no arquivo de texto e registrará os resultados no arquivo JSON especificado.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para criar issues, pull requests ou sugerir melhorias.