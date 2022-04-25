package Circular_simplemente_enlazada;

public class NodoCSE {
    Object dato;
    NodoCSE siguiente;

    public NodoCSE(){

    }
    public Object getDato(){
        return dato;
    }
    
    public void setDato(Object dato){
        this.dato = dato;
    }

    public NodoCSE getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(NodoCSE siguiente){
        this.siguiente = siguiente;
    }

}
