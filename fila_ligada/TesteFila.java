public class TesteFila {
 public static void main(String[] args) {
    Fila<Pessoa> fila = new Fila<>();
    fila.enfileira(new Pessoa("Ana", 2000));
    fila.enfileira(new Pessoa("Caio", 2010));
    fila.enfileira(new Pessoa("Helio", 1999));
    fila.enfileira(new Pessoa("Leticia", 2005));

    System.out.println(fila);
    Pessoa p = fila.desenfileira();
    if(p != null){
        System.out.println(p.getNome() + " foi atendido(a)");
    }
    else{
        System.out.println("Falha no desenfileiramento");
    }
    System.out.println(fila);
    while((p=fila.desenfileira()) != null){
        System.out.println(p.getNome() + " foi atendido(a)");
    }
    System.out.println(fila);
 }   
}
