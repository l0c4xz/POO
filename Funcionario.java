package Polimorfismo;

public class Funcionario {
    long id;
    String nome;
    String telefone;
    int matricula;
    String endereco;

    public double calculaSalario() {
        return 0.0;
    }
}

class Jornada extends Funcionario {
    double salarioHora;
    int horasTrabalhadas;

    @Override
    public double calculaSalario() {
        return salarioHora * horasTrabalhadas;
    }
}

class Horista extends Funcionario {
    double valorHora;
    int quantidadeHoras;

    @Override
    public double calculaSalario() {
        return valorHora * quantidadeHoras;
    }
}

class PessoaJuridica extends Funcionario {
    double valorBruto;
    double imposto;

    @Override
    public double calculaSalario() {
        return valorBruto - imposto;
    }
}

class PrincipalFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Jornada();
        ((Jornada) f1).salarioHora = 50;
        ((Jornada) f1).horasTrabalhadas = 160;

        Funcionario f2 = new Horista();
        ((Horista) f2).valorHora = 70;
        ((Horista) f2).quantidadeHoras = 100;

        Funcionario f3 = new PessoaJuridica();
        ((PessoaJuridica) f3).valorBruto = 10000;
        ((PessoaJuridica) f3).imposto = 2500;

        System.out.println("Salário Jornada: " + f1.calculaSalario());
        System.out.println("Salário Horista: " + f2.calculaSalario());
        System.out.println("Salário PJ: " + f3.calculaSalario());
    }
}