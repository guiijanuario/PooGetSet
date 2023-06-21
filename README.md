# Exercícios sobre Get e Set


## <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> O que é get e set em java?

Os métodos get e set são usados em Java para proteger seus dados, especialmente na criação de classes. Para cada instância de variável, um método getter retorna seu valor, enquanto um método setter o define ou atualiza. O método get é usado para obter informações e sempre retorna um valor. O método set é usado para definir valores e geralmente não retorna valores.
### Get:
O método get é usado para obter informações e sempre retorna um valor. Ele é usado para acessar o valor de uma variável privada de uma classe.

Por exemplo, se você tiver uma variável chamada “nome” em uma classe chamada “Pessoa”, você pode criar um método get para retornar o valor dessa variável:

```
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }
}

```
Esse método retorna o valor da variável “nome” quando é chamado. Espero que isso ajude! Se você tiver alguma dúvida, por favor me avise.
### Set:
O método set é usado para definir valores e geralmente não retorna valores. Ele é usado para atualizar o valor de uma variável privada de uma classe.

Por exemplo, se você tiver uma variável chamada “nome” em uma classe chamada “Pessoa”, você pode criar um método set para atualizar o valor dessa variável:

```
public class Pessoa {
    private String nome;

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
}
```
Esse método atualiza o valor da variável “nome” quando é chamado. Espero que isso ajude! Se você tiver alguma dúvida, por favor me avise.

### O que é uma variável privada:

Uma variável privada é uma variável que pode ser acessada somente por métodos da própria classe e é declarada usando-se a palavra-chave private. Uma variável que, além de poder ser acessada por métodos da própria classe, pode ser acessada por métodos de outras classes é chamada de variável pública. Variáveis privadas são usadas para proteger os dados de uma classe e para garantir que eles não sejam modificados acidentalmente por outras partes do programa.
<p>Por exemplo, se você tiver uma variável chamada “nome” em uma classe chamada “Pessoa”, você pode torná-la privada para proteger seus dados:

```
public class Pessoa {
    private String nome;
}

```

Dessa forma, a variável “nome” só pode ser acessada por métodos dentro da classe “Pessoa”. Espero que isso ajude! Se você tiver alguma dúvida, por favor me avise.
## 📄 Exercícios

1. [Exercício 1](https://github.com/guiijanuario/PooGetSet/tree/main/src/Exercicio1) - iCarros
2. [Exercício 2](https://github.com/guiijanuario/PooGetSet/tree/main/src/Exercicio2) - Biblioteca
3. [Exercício 3](https://github.com/guiijanuario/PooGetSet/tree/main/src/Exercicio3) - Cadastro de Funcionário



## ⏯️ Como executar?

- Você precisará ter o [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11) instalado no seu computador;
- Baixe o repositório do projeto;
- Abra o terminal e navegue até o diretório do programa que você deseja executar;
- Compile o arquivo executando o comando `javac` no arquivo [Exercícios Classe Abstratas e Interface](https://github.com/guiijanuario/ClassesAbstrataEInterface):
```
javac Main.java 
```
- Após compilar, execute o comando `java`, como mostra abaixo:
```
java Main.java 
```

## 👨‍💻 Autor

Nome: Guilherme Januário <br>Linkedin: https://www.linkedin.com/in/guilherme-janu%C3%A1rio/

---

<h4 align=center>Made with 💚 by <a href="https://github.com/guiijanuario">Guilherme Januário</a></h4>


