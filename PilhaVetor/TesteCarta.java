

public class TesteCarta {
    public static void main(String[] args) {
        Carta c1 = new Carta ("Ouros", "sete");
        System.out.println("Naipe de c1: " + c1.getNaipe());

        c1.SetValor("dois");

        Pilha p = new Pilha();
        System.out.println("Pilha instanciada:\n" + p);

        p.push(c1);
        System.out.println("Empilhamos c1:\n" + p);

        p.push(new Carta("copas","rainha"));
        System.out.println("Empilhamos a Rainha:\n" + p);

        System.out.println(p.pop() + " --> Foi Desempilhado");
        System.out.println(p);

        System.out.println(p.pop() + " --> Foi Desempilhado");
        System.out.println(p);

        Carta desempilhada = p.pop();

        if(desempilhada != null){
            System.out.println(p.pop() + " --> Foi Desempilhado");
            System.out.println(p);
        }
        else{
        System.out.println("Acabou o jogo :(");
        }
    }
    
}
