package pila;

public class Pila {
    Nodo tope;
    int max;
    int tamanio;
    boolean vacia;

    Pila(){
        this.tamanio=0;
        this.max=-1;
        this.tope=null;
        this.vacia=true;
    }

    public boolean estaVacia(){
        if(tope==null){
            return vacia=true;
        }else{
            return vacia=false;
        }
    }

    public void Insertar(String dato){
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (estaVacia()) {
            this.tope=nuevo;
            this.tamanio++;
            this.vacia=false;
        }else{
            nuevo.setSiguiente(tope);
            this.tope=nuevo;
            this.tamanio++;
            this.vacia=false;
        }
    }

    public void Eliminar(){
        if(this.tamanio!=0){
            Nodo aux = this.tope;
            this.tamanio--;
            this.tope=aux.getSiguiente();
            aux=null;
        }
      

    }

    public String Imprimir(){
        Nodo aux=this.tope;
        Nodo aux2;
        if (this.tamanio== 0) {
            return " ";
        }else{
            System.out.println(aux.getDato());
            for(int i=1; i<=this.tamanio; i++){
                aux2=aux.getSiguiente();
                aux=aux2;
                System.out.println(aux2.getDato());
            }
            return " ";
        }
    }
}