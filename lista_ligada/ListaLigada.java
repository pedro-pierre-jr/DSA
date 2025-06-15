public class ListaLigada {
    private No topo;
    private No ultimo;
    //construtor é o padrão: zera tudo
    public boolean listaVazia() {
        return topo == null;
    }
    public void insereInicio (int info) {
        No novo = new No(info);
        if (listaVazia())
            ultimo = novo;
        else 
            novo.setProximo(topo);
        topo = novo;
    }
    //para construir o toString varremos a lista do topo até o final
    @Override
    public String toString () {
        if (listaVazia()) return "lista vazia";
        String s = "";
        No runner = topo;
        while (runner != null) {
            s += runner + " -> ";
            runner = runner.getProximo();
        }
        return s + "\\\\";
    }
    public int length () {
        if (listaVazia()) return 0;
        int cont = 0;
        No runner = topo;
        while (runner != null) {
            cont++;
            runner = runner.getProximo();
        }
        return cont;
    }
    public int removeInicio () {
        if (listaVazia()) 
            throw new RuntimeException("falha na remocao de inicio");
        int temp = topo.getInfo();
        topo = topo.getProximo();
        if (topo == null) //esvaziou a lista
            ultimo = null;
        return temp;
    }
    public void insereFim (int info) {
        No novo = new No(info);
        if (listaVazia()) 
            topo = novo;
        else 
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public int removeFim() {
        if (listaVazia())
            throw new RuntimeException("falha na remocao de fim");
        int temp = ultimo.getInfo();
        if (topo == ultimo) {//tem um elemento só
            topo = null;
            ultimo = null;
        }
        else {
            No runner = topo;
            while (runner.getProximo() != ultimo) {//procuramos o penúltimo
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return temp;
    }
}
