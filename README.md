[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]


# Documentação de Uso - Aplicativo de Verificação de Sites

## Introdução

O aplicativo de verificação de sites em Java é projetado para verificar o status de uma lista de sites fornecidos em um arquivo de texto. Ele utiliza threads para realizar verificações simultâneas e registra os resultados em um arquivo JSON.
# Tecnologias Utilizadas

* [![Java][Java]][Java-url]
* [![SpringBoot][SpringBoot]][SpringBoot-url]

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

[contributors-shield]: https://img.shields.io/github/contributors/Emerson-Vitor/trabalho_poo_idp.svg?style=for-the-badge
[contributors-url]: https://github.com/Emerson-Vitor/trabalho_poo_idp/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/Emerson-Vitor/trabalho_poo_idp.svg?style=for-the-badge
[forks-url]: https://github.com/Emerson-Vitor/trabalho_poo_idp/network/members
[stars-shield]: https://img.shields.io/github/stars/Emerson-Vitor/trabalho_poo_idp.svg?style=for-the-badge
[stars-url]: https://github.com/Emerson-Vitor/trabalho_poo_idp/stargazers
[issues-shield]: https://img.shields.io/github/issues/Emerson-Vitor/trabalho_poo_idp.svg?style=for-the-badge
[issues-url]: https://github.com/Emerson-Vitor/trabalho_poo_idp/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/emerson-vitor-pereira-da-silva-4ba9a8160


[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=black
[Java-url]: [https://nextjs.org/](https://www.java.com/pt-BR/)

[SpringBoot]: https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=Spring&logoColor=white
[SpringBoot-url]: https://spring.io

