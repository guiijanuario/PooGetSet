package Exercicio2;

public class Biblioteca {
    private String nomeLivro;
    private String genero;
    private String isbn;
    private String autor;



    public Biblioteca(String nomeLivro, String genero, String isbn, String autor) {
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Biblioteca() {

    }

    public Biblioteca(String isbn) {
        this.isbn = isbn;
    }

    public Biblioteca(String nomeLivro, String isbn) {
        this.nomeLivro = nomeLivro;
        this.isbn = isbn;
    }

    public Biblioteca(String nomeLivro, String genero, String isbn) {
        this.nomeLivro = nomeLivro;
        this.genero = genero;
        this.isbn = isbn;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nNome do livro:" + nomeLivro + '\n' +
                "Gênero: " + genero + '\n' +
                "isbn:" + isbn + '\n' +
                "Autor:" + autor + '\n';
    }

    public void registrarLivro(String isbn){
        setIsbn(isbn);
        Biblioteca livro4 = new Biblioteca(isbn);
        System.out.println("O livro foi registrado com o isbn de número: " + getIsbn());
    };

    public void registrarLivro(String isbn, String nomeLivro){
        setIsbn(isbn);
        setNomeLivro(nomeLivro);
        Biblioteca livro5 = new Biblioteca(isbn, nomeLivro);
        System.out.println("O livro foi registrado com o isbn de número: " + getIsbn() + " e com nome " + getNomeLivro());
    };

    public void registrarLivro(String isbn, String nomeLivro, String genero){
        setIsbn(isbn);
        setNomeLivro(nomeLivro);
        setGenero(genero);
        Biblioteca livro6 = new Biblioteca(isbn, nomeLivro, genero);
        System.out.println("O livro foi registrado com o isbn de número: " + getIsbn() + " e com nome " + getNomeLivro() + " com o gênero " + getGenero());
    };

}
