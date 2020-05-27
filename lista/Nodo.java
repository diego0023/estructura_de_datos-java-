package lista;

public class Nodo {
    private int valor;
    private Nodo siguiente;

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo(){
    this.valor=0;
    this.siguiente=null;
    
    }
}