package Polimorfismo;

interface Computador {
    void ligar();
    void reiniciar();
    void desligar();
    void carregandoSistema();
}

class Gamer implements Computador {
    public void ligar() { System.out.println("PC Gamer ligando..."); }
    public void reiniciar() { System.out.println("PC Gamer reiniciando..."); }
    public void desligar() { System.out.println("PC Gamer desligando..."); }
    public void carregandoSistema() { System.out.println("PC Gamer carregando sistema..."); }
}

class Home implements Computador {
    public void ligar() { System.out.println("PC Home ligando..."); }
    public void reiniciar() { System.out.println("PC Home reiniciando..."); }
    public void desligar() { System.out.println("PC Home desligando..."); }
    public void carregandoSistema() { System.out.println("PC Home carregando sistema..."); }
}

class PrincipalComputador {
    public static void main(String[] args) {
        Computador pc1 = new Gamer();
        pc1.ligar();
        pc1.carregandoSistema();

        Computador pc2 = new Home();
        pc2.ligar();
        pc2.desligar();
    }
}