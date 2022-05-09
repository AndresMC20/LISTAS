package Circular_doblemente_enlazada;

public class Nodo {

    Nodo anterior;
    Object dato;
    Nodo siguiente;

    public Nodo (){

    }

    public Nodo getAnterior(){
        return anterior;
    }

    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }

    public Object getDato(){
        return dato;
    }

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }

    
}
