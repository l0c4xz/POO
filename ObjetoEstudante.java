package Encapsulamento;

public class ObjetoEstudante {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Jabulani", 10, 10);

        estudante1.calcularMedia();
        estudante1.exibirInformacoes();
    }
}