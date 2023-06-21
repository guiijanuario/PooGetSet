package Exercicio1;

public class Hyundai extends Carro{

    public Hyundai(String marca, int ano, double valor, String cor, int portas, int velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }


    @Override
    void iniciaPartida() {
        System.out.println("Iniciando o motor... minha velocidade está em " + this.setVelocidade(5) );
    }

    @Override
    void desligaCarro() {
        System.out.println("Desligando o motor... minha velocidade está em " + this.getVelocidade() );
    }

    public int acelerar() {
        int velocidade = this.getVelocidade();
        int valorAcelerando = this.setVelocidade(velocidade + 15);
        System.out.println("Acelerando... minha velocidade está " + valorAcelerando + " km/h");
        return valorAcelerando;
    }

    public int frear() {
        int velocidade = this.getVelocidade();
        int valorComFreio = this.setVelocidade(velocidade - 2);
        if (valorComFreio <= 0) {
            System.out.println("Você não consegue mais reduzir a velocidade com o carro já parado :)");
            return valorComFreio;
        }
        System.out.println("Freando... minha velocidade está em " + valorComFreio + " km/h");
        return valorComFreio;
    }
}
