//Crie um cabeçalho dinâmico utilizando fluxo com laços

public class CabecalhoDinamico {
    public static void main(String[] args) {
        int tamanho = 40;
        Cabecalho cabecalho = new Cabecalho(tamanho);
        cabecalho.imprimir();
        System.out.println("Bem vindo ao Comex");
        cabecalho.imprimir();
    }
}

class Cabecalho {
    private int tamanho;

    public Cabecalho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
