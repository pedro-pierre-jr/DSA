public class Fila<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    //Construtor padrão
    public boolean filaVazia(){
        return primeiro == null;
    }
    public void enfileira(T info){
        No<T> novo = new No<>(info);
        if(filaVazia()){
            primeiro = novo;
        }
        else{
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public T desenfileira(){
        if(filaVazia()) return null;
        T temp = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if(primeiro == null)
            ultimo = null;
        return temp;
    }
    @Override
    public String toString(){
        if(filaVazia()) return "Fila Vazia!\n";
        No<T> atual = primeiro;
        String s = "";
        while(atual != null){
            s += atual;
            atual = atual.getProximo();
        }
        return s + "\n";
    }
}