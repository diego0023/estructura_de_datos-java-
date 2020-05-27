package lista;

public class Lista {
    private Nodo frente;
    private Nodo fin;
    private int tamanio;
    //constructor
    public Lista(){
    this.frente=null;
    this.fin=null;
    this.tamanio=0;
    }
    //metodo que indica si la lista esta vacia
    private boolean estaVacia(){
        return (frente==null && fin==null) || this.tamanio==0;
     }
    //metodo para buscar en la lista un nodo con cierto valor
    private Nodo obtenerPorValor(int valor, Nodo aux ){
        if (aux==null) {
            System.out.println("no existe este elemento");
            return aux;
        }
        else{
            if(valor==aux.getValor()){
                return aux;
            }
         return obtenerPorValor(valor, aux.getSiguiente());
        }
    }
    //obtiene un nodo por su pocicin
    private Nodo porPosicion(int pos, Nodo aux, int cont){
        if (aux==null) {
            return aux;
        }
        else{
            if (cont==pos) {
               
                return aux;
            }
            else{
                aux.getSiguiente().getValor();
            return porPosicion(pos,aux.getSiguiente(),cont+1);
            }
        }
    
    };
    //obtiene la posicion de un nodo
    private int obtenerPosicion(Nodo ref, Nodo aux, int cont){
        if (aux==null) {
            return-1;
        }
        else{
            if (aux==ref) {
                return cont;
            }
            else{
            
            return obtenerPosicion(ref,aux.getSiguiente(),cont+1);
            }
        }
    }
    //motodo para que el usuario pueda buscar algun valor
    public Nodo buscar(int valor){ return obtenerPorValor( valor, this.frente); }
    //metodos axuliares para insertar
    private void InsertarVacia(int valor){
        Nodo aux=new Nodo();
        aux.setValor(valor);
        this.fin=aux;
        this.frente=aux;
        this.tamanio++;
    }
    private void InsertarInicio(int valor){
    Nodo aux=new Nodo();
    aux.setValor(valor);
    aux.setSiguiente(frente);
    this.frente=aux;
    this.tamanio++;
    
    }
    private void InsertarFinal(int valor){
    Nodo nuevo=new Nodo();
    nuevo.setValor(valor);
    Nodo aux;
    aux=this.fin;
    aux.setSiguiente(nuevo);
    this.fin=nuevo;
    this.tamanio++;
    }
    private void InsertarAntes(int valor, int ref){
    Nodo nuevo=new Nodo();
    nuevo.setValor(valor);
    nuevo.setSiguiente(obtenerPorValor(ref,this.frente));
        if (obtenerPorValor(ref,this.frente).getValor()==this.frente.getValor()) {
            this.frente=nuevo;
        }else{
        Nodo aux=new Nodo();
        aux= porPosicion(obtenerPosicion(obtenerPorValor(ref,this.frente),this.frente,0)-1,this.frente,0);
        aux.setSiguiente(nuevo);
        
        }
    
    }
    //metodo incertar recursivo
    private void InsertarRec(int valor, Nodo aux){
        if (estaVacia()) {
            this.InsertarVacia(valor);
        }
        else{
            if (valor>aux.getValor()) {
                if (aux==this.frente) {
                    this.InsertarInicio(valor);
                }
                else{
                    this.InsertarAntes(valor, aux.getValor());
            
                }
            
            }else if(aux.getSiguiente()==null){
                 this.InsertarFinal(valor);
            }else{
            
            InsertarRec(valor, aux.getSiguiente());
            }
        }
    }
    //metodo por el cual el usuario ingresa el valor que quiere insertar
    public void Insertar(int valor){ InsertarRec(valor,this.frente);}
    
    private String Recorrer(Nodo aux){
        if (aux==null) {
            return "";
        }
        else{
        return Integer.toString(aux.getValor()) + " " +Recorrer(aux.getSiguiente());
        }
    }
    
    public String Imprimir(){ return Recorrer(this.frente); }
    
    public Nodo Eliminar(){
    Nodo aux;
    aux=this.frente;
    this.frente=aux.getSiguiente();
    aux.setSiguiente(null);
    tamanio--;
    return aux;
    }

}