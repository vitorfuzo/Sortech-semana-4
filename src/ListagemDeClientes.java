//Crie uma listagem de clientes utilizando variáveis primitivas

public class ListagemDeClientes {
    public static void main(String[] args) {
        System.out.println("Listagem dos clientes");
        System.out.println("--------------------------------");

        Cliente fulano = new Cliente("Fulano", 1980);
        System.out.println(fulano.toString());

        System.out.println("--------------------------------");

        Cliente sicrano = new Cliente("Sicrano", 2000);
        System.out.println(sicrano.toString());
    }
}

class Cliente {
    private String nome;
    private int nascimento;

    public Cliente(String nome, int nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String toString() {
        return "Nome: " + nome + "\nData de nascimento: " + nascimento;
    }
}
