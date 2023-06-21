package Exercicio3;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Funcionario {

    private String nome;

    private Date dataAdmissao;
    private double salario;

    private int id;
    private static int idContador = 0;

    public Funcionario(String nome, Date dataAdmissao, double salario, int id) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.id = id;
    }

    public Funcionario(Date dataAdmissao, double salario) {
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Funcionario() {
        setIdContador(getIdContador() + 1);
        setId(getIdContador());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao,Date dataHojeConvertido) {
        if(dataHojeConvertido.before(dataAdmissao)){
            System.out.printf("A data de admissão não pode ser no futuro.\n");
            this.dataAdmissao = dataAdmissao;
        }else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 700.0){
            System.out.printf("O menor salário que pode ser cadastrado é de 700 reais.");
            this.salario = 700.0;
        }

        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdContador() {
        return idContador;
    }

    public static void setIdContador(int idContador) {
        Funcionario.idContador = idContador;
    }

    @Override
    public String toString() {
        return " ID: " + id + '\n' +
                "Nome Funcionário: " + nome + '\n' +
                "Data Admissão: " + dataAdmissao + '\n' +
                "Salário: " + salario;
    }

}
