package lista_doble;

public class Lista {
    private Nodo inicio;

    public boolean EstaVacia() {
        return inicio == null;
    }
    
    public void InsertarVacia(String valor){
    Nodo nuevo=new Nodo();
    nuevo.setValor(valor);
    this.inicio=nuevo;
    }
    public void InsertarInicio(String valor){
    Nodo nuevo=new Nodo();
    nuevo.setValor(valor);
    this.inicio.setAnterioir(nuevo);
    nuevo.setSiguiente(inicio);
    this.inicio=nuevo;
    }
    
    public void add(String valor){
        if (EstaVacia()) {
            InsertarVacia(valor);
        }else{
            InsertarInicio(valor);
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }   
}