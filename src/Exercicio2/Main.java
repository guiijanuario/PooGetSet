package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ Cadastre por favor 3 livros ]");
        System.out.println("Digite o nome do primeiro livro: ");
        String nomeLivro1 = scanner.nextLine();
        System.out.println("Digite o gênero do primeiro livro: ");
        String generoLivro1 = scanner.nextLine();
        System.out.println("Digite o código isbn do primeiro livro: ");
        String isbnLivro1 = scanner.nextLine();
        System.out.println("Digite o autor do primeiro livro: ");
        String autorLivro1 = scanner.nextLine();

        Biblioteca livro1 = new Biblioteca(nomeLivro1,generoLivro1,isbnLivro1,autorLivro1);

        System.out.println("Digite o nome do segundo livro: ");
        String nomeLivro2 = scanner.nextLine();
        System.out.println("Digite o gênero do segundo livro: ");
        String generoLivro2 = scanner.nextLine();
        System.out.println("Digite o código isbn do segundo livro: ");
        String isbnLivro2 = scanner.nextLine();
        System.out.println("Digite o autor do segundo livro: ");
        String autorLivro2 = scanner.nextLine();

        Biblioteca livro2 = new Biblioteca(nomeLivro2,generoLivro2,isbnLivro2,autorLivro2);

        System.out.println("Digite o nome do terceiro livro: ");
        String nomeLivro3 = scanner.nextLine();
        System.out.println("Digite o gênero do terceiro livro: ");
        String generoLivro3 = scanner.nextLine();
        System.out.println("Digite o código isbn do terceiro livro: ");
        String isbnLivro3 = scanner.nextLine();
        System.out.println("Digite o autor do terceiro livro: ");
        String autorLivro3 = scanner.nextLine();

        Biblioteca livro3 = new Biblioteca(nomeLivro3,generoLivro3,isbnLivro3,autorLivro3);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);

        System.out.println("[ Cadastre o livro só com ISBN ]");
        System.out.println("Digite o código isbn do livro: ");
        String isbnIsolado = scanner.nextLine();
        Biblioteca livro4 = new Biblioteca();
        livro4.registrarLivro(isbnIsolado);
        System.out.println(livro4);


        System.out.println("[ Cadastre o livro só com ISBN e Nome do livro ]");
        System.out.println("Digite o código isbn do livro: ");
        String isbnIsolado2 = scanner.nextLine();
        System.out.println("Digite o nome do livro: ");
        String nomeIsolado2 = scanner.nextLine();

        Biblioteca livro5 = new Biblioteca();
        livro5.registrarLivro(isbnIsolado2,nomeIsolado2);
        System.out.println(livro5);

        System.out.println("[ Cadastre o livro só com ISBN e Nome do livro ]");
        System.out.println("Digite o código isbn do livro: ");
        String isbnIsolado3 = scanner.nextLine();
        System.out.println("Digite o nome do livro: ");
        String nomeIsolado3 = scanner.nextLine();
        System.out.println("Digite o gênero do livro: ");
        String generoIsolado3 = scanner.nextLine();

        Biblioteca livro6 = new Biblioteca();
        livro6.registrarLivro(isbnIsolado3,nomeIsolado3,generoIsolado3);
        System.out.println(livro6);

    }
}
