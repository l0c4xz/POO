package Polimorfismo;

public class Produto {
    long id;
    String nome;
    double preco;
}

class Sorvete extends Produto {
    double tempAdequada;

    public void exibirInfo() {
        System.out.println("Sorvete: " + nome + ", Preço: " + preco + ", Temp. Ideal: " + tempAdequada + "°C");
    }
}

class Camisa extends Produto {
    String cor;
    String tecido;
    String tamanho;

    public void exibirInfo() {
        System.out.println("Camisa: " + nome + ", Cor: " + cor + ", Tecido: " + tecido + ", Tamanho: " + tamanho);
    }
}

class PrincipalProduto {
    public static void main(String[] args) {
        Sorvete s1 = new Sorvete();
        s1.nome = "Chocolate";
        s1.preco = 15.90;
        s1.tempAdequada = -10;
        s1.exibirInfo();

        Camisa c1 = new Camisa();
        c1.nome = "Camisa Polo";
        c1.preco = 49.90;
        c1.cor = "Azul";
        c1.tecido = "Algodão";
        c1.tamanho = "M";
        c1.exibirInfo();
    }
}