import java.util.Date;
import java.util.Scanner;
public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        NossoVetor v;
        System.out.print("\nDigite o tamanho do vetor, 0 encerra: ");
        t = sc.nextInt();
        while (t > 0){
            long ini, fim;
            v = new NossoVetor(t);
            v.preencheVetor();
            //System.out.println("Vetor original\n" + v);
            ini = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("Bubble demorou " + (fim - ini) + " milissegundos");
            //System.out.println("Vetor ordenado pelo bubble\n" + v);
            
            ini = new Date().getTime();
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("Bubble ordenado demorou " + (fim - ini) + " milissegundos");
            
            v.preencheVetor();
            // System.out.println("\nVetor original\n" + v);
            ini = new Date().getTime();
            v.insertionSort();
            fim = new Date().getTime();
            // System.out.println("Vetor ordenado pelo insertion\n" + v);
            System.out.println("Isertion demorou " + (fim - ini) + " milissegundos");

            ini = new Date().getTime();
            v.insertionSort();
            fim = new Date().getTime();
            System.out.println("Insertion ordenado demorou " + (fim - ini) + " milissegundos");
            
            System.out.print("\nDigite o novo tamanho, 0 encerra: ");
            t = sc.nextInt();
        }
        sc.close();
    }
    
}
