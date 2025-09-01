package Encapsulamento;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Gabriela Fichel", "99672-0826", "518.579.868-81", "12.345.678-9");
        Endereco endereco = new Endereco(1, "Rua das Flores", 100, "Apto 103", "Centro", "São Paulo", "01000-000", "SP");
        Tema tema = new Tema(1, "Festa Junina", 500.00, "Vermelha");
        ItemTema item = new ItemTema(1, "Bandeirinhas", "Decoração colorida");

        cliente.exibirInformacoes();
        endereco.exibirInformacoes();
        tema.exibirInformacoes();
        item.exibirInformacoes();
    }
}