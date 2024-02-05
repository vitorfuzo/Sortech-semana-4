//Alterar a listagem dos clientes para utilizar o nome dos clientes em variáveis do tipo String

public class ListagemDeClientesString {
    public static void main(String[] args) {
        System.out.println("Listagem dos clientes");
        System.out.println("-".repeat(40));
        String fulano = "Fulano";
        System.out.println("Nome: " + fulano);
        int nascimentoFulano = 1980;
        System.out.println("Data de nascimento: " + nascimentoFulano);
        System.out.println("-".repeat(40));
        String sicrano = "Sicrano";
        System.out.println("Nome: " + sicrano);
        int nascimentoSicrano = 2000;
        System.out.println("Data de nascimento: " + nascimentoSicrano);
        System.out.println("-".repeat(40));
    }
}
