package cola;

public class Nodo {
    private String valor;
    Nodo siguiente;

    Nodo(){
        this.valor=" ";
        this.siguiente=null;
    }

    public String getValor(){
        return this.valor;
    }

    public void setValor(String dato){
        this.valor=dato;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
}