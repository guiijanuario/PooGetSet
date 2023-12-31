package Exercicio1;

abstract class Carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private int velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas, int velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int setVelocidade(int velocidade) {
        this.velocidade = velocidade;
        return velocidade;
    }

    abstract void iniciaPartida();
    abstract void desligaCarro();
    public int acelerar(){
        return 0;
    };
    public int frear(){
        return 0;
    };

}
