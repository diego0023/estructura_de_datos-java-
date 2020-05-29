package arbol_binario;

public class Arbol {
    private Nodo raiz;

    public Arbol()
    {
        raiz = null;      
    }
      //Metodo para saber si el arbol esta completamente vacio
    public boolean vacioArbol(Nodo a)
    {
        return (a == null);          
    }
     //procedimiento para obtener la raiz
    public Nodo getRaiz() 
    {
        return raiz;
    }
    // Agregar Raiz a el Arbol
    public void setRaiz(Nodo raiz) 
    {
        this.raiz = raiz;
    } 
    //retorna el arbol izquierdo
    public Nodo getIzqArbol(Nodo a)
    {
        if(a.getIzq() == null)
        {
            return null;
        }
        else
        {
            return a.getIzq();
        }
    }
    //retorna el arbol derecho
     public Nodo getDerArbol(Nodo a)
    {
        if(a.getDer() == null)
        {
            return null;
        }
        else
        {
            return a.getDer();
        }
    } 
     //insertar
     public void insertar(int n){
         Nodo nuevo=new Nodo(n);
     this.adicionarNodo(this.raiz, nuevo);
     }
     
      //Agrega un nodo al arbol Ordenado
     public String adicionarNodo(Nodo a, Nodo n) 
    {
        if(vacioArbol(a))
        {
            raiz = n;
            return "Elemento insertado correctamente.";
        }
        else
        {
            if(a.getDato() != n.getDato())
            {
                if(n.getDato() < a.getDato())
                {
                    if (getIzqArbol(a) == null)
                    {
                        a.setIzq(n);
                        return "Elemento insertado correctamente.";
                    }
                    else
                    {
                        return adicionarNodo(getIzqArbol(a), n);
                    }
                }
                else if(n.getDato() > a.getDato())
                {
                    if (getDerArbol(a) == null)
                    {
                        a.setDer(n);
                        return "Elemento insertado correctamente.";
                    }
                    else
                    {
                        return adicionarNodo(getDerArbol(a), n);
                    }
                }
            }   
            else
            {
                return "No se puede agregar el Elemento.";              
            }          
        }
        return "";
    }
     //realiza el recorrido en preorden de un arbol
     public void preorden(Nodo a) 
    {
        if(!vacioArbol(a))
        {
            System.out.print(a.getDato()+ " ");
            preorden(getIzqArbol(a));
            preorden(getDerArbol(a));
        }
    }
     //realiza el recorrido en inorden de un arbol
       public void inorden(Nodo a) 
    {
        if(!vacioArbol(a))
        {
            inorden(getIzqArbol(a));
            System.out.print(a.getDato()+ " ");
            inorden(getDerArbol(a));
        }          
    }
       //realiza el recorrido en postorden de un arbol
     public void postorden(Nodo a)
    {
        if(!vacioArbol(a))
        {
            postorden(getIzqArbol(a));
            postorden(getDerArbol(a));
            System.out.print(a.getDato()+ " ");
        }
    }
     //retorna un nodo el cual contiene un dato que se busca, si no lo encuentra retorna null
     public Nodo buscarNodo(Nodo a, int dato)
    {
        if(a != null)
        {
           if(a.getDato() == dato)
           {
                return a;
           }

           else
           {
                if(dato > a.getDato())
                {
                    return buscarNodo(a.getDer(), dato);
                }
                else
                {
                    return buscarNodo(a.getIzq(), dato);
                }
            }
        }
        else
        {
            return null;
        }
        
    }
     // METODO ELIMINAR NODO DEL ARBOL
      public boolean soloRaiz(Nodo nodo){ 
        if(nodo.getDer()==null && nodo.getIzq()==null ){
            nodo=null;
            return true;
        }
        return false;
    }
    public Nodo EliminarNodo(Nodo nodo, int dato)
    {
        if(soloRaiz(nodo))
        {
            return null;
        }
     
        if (nodo == null){
            System.out.println("No se encuentra el nodo.");
        }
        else if (dato < nodo.getDato()){
            Nodo izq;
            izq = EliminarNodo(nodo.getIzq(), dato);
            nodo.setIzq(izq);
        }
        else if (dato > nodo.getDato()){
            Nodo der;
            der = EliminarNodo(nodo.getDer(), dato);
            nodo.setDer(der);
        }      
        else{
            Nodo eliminar;
            eliminar = nodo;
         
            if(eliminar.getIzq() == null)
            {
                nodo = eliminar.getDer();              
            }
            else if (eliminar.getDer() == null)
            {
                nodo = eliminar.getIzq();
            }
            else
            {
                eliminar = reemplazar(eliminar);
            }
            eliminar = null;
        }
        return nodo;
    }
 
    public Nodo reemplazar(Nodo nodo)
    {
        Nodo N1, N2;
        N2 = nodo;
        N1 = nodo.getIzq();
     
        while(N1.getDer() != null)
        {
            N2 = N1;
            N1 = N1.getDer();
        }
     
        nodo.setDato(N1.getDato());
     
        if(N2 == nodo)
        {
            N2.setIzq(N1.getIzq());
        }
        else
        {
            N2.setDer(N1.getIzq());
        }
     
        return N1;
    }
}