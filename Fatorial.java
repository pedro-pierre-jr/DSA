
public class Fatorial {
    static long fatorial (int n){
        if(n<2){
            return 1;
        }
        return n*fatorial(n-1);
    }
    static int fibonacci(int n){
        if(n<3){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static double potenciacao (double base, int expoente){
        if(expoente == 0){
            return 1;
        }
        if(expoente < 0){
            base = 1/base;
            expoente = -expoente;
        }
        double pot = base;
        for(int i = 1; i < expoente; i++){
            pot *= base;
        }
        return pot;
    }
    static int potenciaRec1(int base, int i, int expoente){
        if(i == expoente){
            return base;
        }
        return base * potenciaRec1(base, i+1, expoente);
    }
    static int potenciaRec2(int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        return base * potenciaRec2(base, expoente - 1);
    }
    //construir um método recursivo para somar valores de 1 à n
    static int somaValorRec (int n){
        if(n <= 1){
            return n;
        }
        return n + somaValorRec(n-1);
    }
    //construir um método interativo para somar os dígitos de um número
    static int lacoSomaD(int n){
        int soma=0;
        while(n > 0){
            soma += n % 10;
            n = n / 10;
        }
        return soma;
    }
    //construir um método recursivo para somar os digitos de um numero
    static int somaRecD(int n){
        if(n == 0){
            return 0;
        }
        return n%10 +somaRecD(n/10);
    }
    //construir um método recursivo para somar todos os valores de um vetor
    static int somaVetorR(int[] v, int i){
        if(i == v.length-1){
            return v[v.length-1];
        }
        return v[i] + somaVetorR(v, i+1);
    }
    //construir função recursiva que receba um N int positivo impar e retorne o fatorial duplo desse numero (5!! = 1*3*5 = 15)
    static long fatorialDuplo (int n){
        if(n==1){
            return 1;
        }
        return n*fatorialDuplo(n-2);
    }
    public static void main(String[] args) {
        // for(int i=0; i<21; i++){
        //     System.out.println("Fatorial de " + i + " = " + fatorial(i));
        // }
        //System.out.println("Fatorial de 13 = " + fatorial(13));
        // for(int i=1; i<21; i++){
        //     System.out.println("Fibonacci de " + i + " = " + fibonacci(i));
        // }
        // System.out.println("3 a quarta " + potenciacao(3, 4));
        // System.out.println("3 a -4 " + potenciacao(3, -4));
        // System.out.println("3 a quarta " + potenciaRec1(3, 1, 4));
        // System.out.println("3 a quarta " + potenciaRec2(3, 4));
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Digite um valor: ");
        // int valor = sc.nextInt();
        // System.out.println("A soma todos os numeros ate " + valor + " e " + somaValorRec(valor));
        // System.out.println("A soma dos digitos do numero e " + lacoSomaD(valor));
        // int[] vetor = {1,2,7,5,8};
        // // System.out.println("A soma dos digitos do n e " + somaRecD(valor));
        // System.out.println("Soma dos valores do vetor " + somaVetorR(vetor, 0));
        System.out.println("O fatorial duplo de 5 e " + fatorialDuplo(5));
    }
}
