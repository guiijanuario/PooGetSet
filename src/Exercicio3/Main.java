package Exercicio3;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fortamataData = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ Cadastro de funcionários - get e set ]");
        Funcionario funcionario1 = new Funcionario();

        System.out.println("Primeiramente por favor qual a data de hoje? Digite da seguinte forma (dd/MM/yyyy):");
        String dataHoje = sc.nextLine();
        Date dataHojeConvertido = fortamataData.parse(dataHoje);

        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = sc.nextLine();
        funcionario1.setNome(nomeFuncionario);

        System.out.println("Digite por favor da data de admissão:  Ex. (dd/MM/yyyy):");
        String dataAdmissao = sc.nextLine();
        Date dataAdmissaoFormatado = fortamataData.parse(dataAdmissao);
        funcionario1.setDataAdmissao(dataAdmissaoFormatado,dataHojeConvertido);


        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();
        funcionario1.setSalario(salario);

        System.out.println("\n[ ---- Testar se o ID deu certo ---- ]");
        System.out.println(funcionario1.toString());




    }
}
