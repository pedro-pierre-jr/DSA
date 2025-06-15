public class Pilha {
    private No topo;
    //construtor é o padrão: zera tudo
    public boolean pilhaVazia() {
        return topo == null;
    }
    public void push (int info) {
        No novo = new No(info);
        novo.setProximo(topo);
        topo = novo;
         
    }
    //para construir o toString varremos a lista do topo até o final
    @Override
    public String toString () {
        if (pilhaVazia()) return "lista vazia";
        String s = "";
        No runner = topo;
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo();
        }
        return s + "\\\\";
    }
    public int length () {
        if (pilhaVazia()) return 0;
        int cont = 0;
        No runner = topo;
        while (runner != null) {
            cont++;
            runner = runner.getProximo();
        }
        return cont;
    }
    public int pop () {
        if (pilhaVazia()) 
            throw new RuntimeException("falha na remocao de inicio");
        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }
}
