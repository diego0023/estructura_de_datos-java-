package cola;

public class Cola {
    int max;
    int tamanio;
    Nodo frente;
    Nodo fin;

    Cola(){
        this.tamanio=0;
        this.max=-1;
        this.frente=null;
        this.fin=null;

    }
    
    Cola(int max){
        this.tamanio=0;
        this.max=max;
        this.frente=null;
        this.fin=null;
    }

    public Boolean estaLLena(){
        if(this.max==-1 || this.max > this.tamanio){
            return false;
        }else{
            return true;
        }
    }

    public Boolean estaVacia(){
        if (this.frente==null && this.fin==null) {
            return true;

        } else {
            return false;
        }
    }

    public void Insertar(String valor){
        if (estaLLena()) {
            System.out.println("DESBORDAMINETO");
        } else {
            Nodo nuevo=new Nodo();
            nuevo.setValor(valor);
            if (estaVacia()) {
                this.frente=nuevo;
                this.fin=nuevo;
                this.tamanio++;
            } else {
                Nodo aux;
                aux=this.fin;
                aux.setSiguiente(nuevo);
                this.fin=nuevo;
                this.tamanio++;
            }

        }

    }

    public Nodo Eliminar(){
        Nodo aux= new Nodo();
        if (estaVacia()) {
            System.out.println("SUBDESBORDAMIENTO");
            return aux;
        } else {
            aux=this.frente;
            if (frente==fin) {
                this.fin=null;
                this.frente=null;
                aux.setSiguiente(null);
                this.tamanio--;
            } else {
                this.frente=aux.getSiguiente();
                aux.setSiguiente(null);
                this.tamanio--;
            }
            return aux;
        }

    }

    public String Imprimir(){
        String cadena=" ";
        Nodo aux=this.frente;
        if(aux==null){
            return cadena;
        }else{
            while (aux!=null) {
                cadena=cadena + aux.getValor();
                aux=aux.getSiguiente();
            }
            return cadena;
        }
    }

}