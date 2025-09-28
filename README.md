# AT1 - Projeto Integrador - POO

Atividade da disciplina de Técnicas de Programação (FATEC Registro) no segundo semestre do curso de Desenvolvimento de Software Multiplataforma, focada na aplicação de Programação Orientada a Objetos e manipulação de dados via console em java.

## Integrantes

- Vitor Gabriel Mandira Soares
- Ana Flávia Cardozo Ribeiro
- Geovanna Pereira da Silva
- Miguel Santos Pereira
- Vinicius Freitas Leandro da Silva

## ⚠️ Atenção: Versão do Java

Este projeto foi desenvolvido e testado utilizando o **Java 24**.

Se você possui uma versão diferente do Java instalada em sua máquina, será necessário fazer uma pequena alteração no arquivo de configuração do projeto para garantir a compatibilidade.

Siga os passos abaixo:

1.  Abra o projeto em uma IDE que suporte a edição de arquivos XML (como NetBeans, IntelliJ, VS Code, etc.).
2.  Localize e abra o arquivo `pom.xml` na raiz do projeto.
3.  Procure pela seção `<properties>`. Você verá um código semelhante a este:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="[http://maven.apache.org/POM/4.0.0](http://maven.apache.org/POM/4.0.0)" xmlns:xsi="[http://www.w3.org/2001/XMLSchema-instance](http://www.w3.org/2001/XMLSchema-instance)" xsi:schemaLocation="[http://maven.apache.org/POM/4.0.0](http://maven.apache.org/POM/4.0.0) [http://maven.apache.org/xsd/maven-4.0.0.xsd](http://maven.apache.org/xsd/maven-4.0.0.xsd)">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.fatec</groupId>
    <artifactId>ProjetoIntegrador</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.release>24</maven.compiler.release>
        <exec.mainClass>com.fatec.projetointegrador.exibir</exec.mainClass>
    </properties>
</project>
```
4. Dentro da tag <properties>, localize a linha:
```xml
<maven.compiler.release>24</maven.compiler.release>
```

5. Altere o número 24 para a versão do Java que você utiliza (por exemplo, se você usa o Java 21, a linha deve ficar
```xml
<maven.compiler.release>21</maven.compiler.release>).
```
