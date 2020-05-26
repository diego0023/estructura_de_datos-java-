package pila;

public class Nodo {
    private String dato;
    private Nodo siguiente;

    Nodo(){

        this.dato=" ";
        this.siguiente=null;
    }

    public String getDato(){
        return this.dato;
    }

    public void setDato(String dato){
        this.dato=dato;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }
}