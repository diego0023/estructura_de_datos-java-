package pila_doble;

public class Nodo {
    public String valor;
    private Nodo siguiente;
    private Nodo anterioir;
    
    public Nodo(){
    this.valor=" ";
    this.siguiente=null;
    this.anterioir=null;
    }

    public Nodo getAnterioir() {
        return anterioir;
    }

    public void setAnterioir(Nodo anterioir) {
        this.anterioir = anterioir;
    }


    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getValor(){
        return this.valor;
    }
    
    public void setValor(String valor){
        this.valor=valor;
    }
}