import java.util.Random;

public class TesteArvore {
    public static void main(String[] args) {
        Random r = new Random();
        ArvoreBinaria abb = new ArvoreBinaria();
        // try {
        //     System.out.println("Maior nº da arvore: " + abb.maior());
        // } catch (RuntimeException rt) {
        //     System.out.println(rt.getMessage());
        // }
        for(int i = 1; i <= 12; i++){
            int n = r.nextInt(25);
            System.out.print(n +" ");
            abb.insere(n);
        }
        System.out.println("\n" + abb);
        System.out.println("Altura: " + abb.altura());
        System.out.println("Quantidade de Nos: " + abb.contaNos());

        System.out.println(abb.busca(10) ? "10 esta na arvore" : "10 nao esta na arvore");
        try {
            System.out.println("Maior nº da arvore: " + abb.maior());
        } catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
    }
}
