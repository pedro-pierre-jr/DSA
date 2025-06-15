import java.util.Random;
public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Random r = new Random();
        do { 
            if(r.nextBoolean()){
                p.push(r.nextInt(10));
            }
            else{
                try {
                    System.out.println(p.pop() + " foi desempilhado");
                } catch (RuntimeException rt) {
                    System.out.println(rt.getMessage());
                }
            }
            System.out.println(p);
        } while (!p.pilhaVazia());
    }
}
