//Alterar a listagem dos clientes para exibir a característica etária dos clientes

public class ListagemDeClientesFaixaEtaria {
    public static void main(String[] args) {
        System.out.println("Listagem dos clientes");
        int anoAtual = 2024;
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("-".repeat(40));
        String fulano = "Fulano";
        System.out.println("Nome: " + fulano);
        int nascimentoFulano = 1980;
        System.out.println("Data de nascimento: " + nascimentoFulano);
        int idadeFulano = anoAtual - nascimentoFulano;
        System.out.println("Idade: " + idadeFulano);
        if (idadeFulano <= 17) {
            System.out.println("Característica Etária: ADOLESCENTE");
        } else if (idadeFulano <= 29) {
            System.out.println("Característica Etária: JOVEM");
        } else if (idadeFulano <= 59) {
            System.out.println("Característica Etária: ADULTO");
        } else {
            System.out.println("Característica Etária: IDOSO");
        }
        System.out.println("-".repeat(40));
        String beltrano = "Beltrano";
        System.out.println("Nome: " + beltrano);
        int nascimentoBeltrano = 2000;
        System.out.println("Data de nascimento: " + nascimentoBeltrano);
        int idadeBeltrano = anoAtual - nascimentoBeltrano;
        System.out.println("Idade: " + idadeBeltrano);
        if (idadeBeltrano <= 17) {
            System.out.println("Característica Etária: ADOLESCENTE");
        } else if (idadeBeltrano <= 29) {
            System.out.println("Característica Etária: JOVEM");
        } else if (idadeBeltrano <= 59) {
            System.out.println("Característica Etária: ADULTO");
        } else {
            System.out.println("Característica Etária: IDOSO");
        }
        System.out.println("-".repeat(40));
    }
}
