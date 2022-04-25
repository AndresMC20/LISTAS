package doblemente_enlazada;

public class NodoDE {
    Object dato;
    NodoDE siguiente;
    NodoDE anterior;

    public NodoDE(Object dato, NodoDE siguiente, NodoDE anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Object getDato(){
        return this.dato; 
    }

    public void setDato(Object dato){
        this.dato = dato;
    }

    public NodoDE getSiguiente(){
        return this.siguiente;
    }

    public void setSiguiente(NodoDE siguiente){
        this.siguiente = siguiente;
    }

    public NodoDE getAnterior(){
        return this.anterior;
    }

    public void setAnterior(NodoDE anterior){
        this.anterior = anterior;
    }

    
}
