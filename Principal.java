package heranca;

public class Principal {
    public static void main (String [] args){
        Pessoa pessoa = new Pessoa ("Maria Gabriela dos Santos", "(15) 3210-3210");
        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("teledone: " + pessoa.getTelefone());

        PessoaFisica pessoaFisica = new PessoaFisica("Maria Gabriela dos Santos", "(15) 3210-3210","123.456.789.00","300.456.989-1");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("teledone: " + pessoaFisica.getTelefone());
        System.out.println("cpf: " + pessoaFisica.getCpf());
        System.out.println("Rg: " + pessoaFisica.getRg());

        PessoaJuridica pessoaJuridica= new PessoaJuridica("Empresa XYZ", "(15) 3210-3210", "12.345.678/9001-23");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("teledone: " + pessoaJuridica.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());

    }
}
