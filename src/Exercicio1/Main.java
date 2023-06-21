package Exercicio1;

public class Main {
    public static void main(String[] args) {

        Renault duster = new Renault("Renault",2023,67345.98,"Branco",4,50);
        Fiat uno = new Fiat("Fiat",2023,66345.98,"Prata",2,30);
        Hyundai hb20 = new Hyundai("Hyundai",2023,66345.98,"Prata",2,30);
        System.out.println("\n -------------------- Carro da Renault -------------------- \n");

        duster.iniciaPartida();

        duster.acelerar();
        duster.acelerar();
        duster.acelerar();
        duster.acelerar();
        duster.frear();
        duster.frear();
        duster.desligaCarro();

        System.out.println("\n-------------------- Carro da Fiat -------------------- \n");

        uno.iniciaPartida();

        uno.acelerar();
        uno.acelerar();
        uno.frear();
        uno.frear();
        uno.desligaCarro();

        System.out.println("\n-------------------- Carro da Hyundai -------------------- \n");

        hb20.iniciaPartida();

        hb20.acelerar();
        hb20.acelerar();
        hb20.frear();
        hb20.frear();
        hb20.desligaCarro();

        }
    }
