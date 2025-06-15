public class Pilha {
    Carta[] baralho;
    int topo;
    public Pilha (){
        baralho = new Carta[52];
        topo = 0;
    }
    public boolean isEmpty(){
        return topo == 0;
    }
    public boolean isFull(){
        return topo == baralho.length;
    }
    public boolean push(Carta c){
        if(this.isFull()){
            return false;
        }
        baralho[topo++] = c;
        return true;
    }
    public Carta pop(){
        if(isEmpty()){
            return null;
        }
        return baralho[--topo];
    }
    @Override
    public String toString(){
        if(isEmpty()){
            return "Mao Vazia";
        }
        String s = "------------------------------------------------\n";
        for(int i = topo - 1; i >= 0; i--){
            s += baralho[i] + "\n";
        }
        return s += "------------------------------------------------\n";   
    }
    //Método espia: devolve a carta que está no topo (sem remover);
    //Método tamanho da pilha: devolve um inteiro

    public Carta peekCarta(){
        if(isEmpty()){
            return null;
        }
        return baralho[topo-1];
    }
    public int tamanhoPilha(){
        if(isEmpty()){
            return 0;
        }
        return topo;
    }

    public int search(Carta c){
        for(int i = topo - 1, pos = 1; i >= 0; i--, pos++){
            if(c.equals(baralho[i])){
                return pos;
            }
        }
        return -1;
    }
}
