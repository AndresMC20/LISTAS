package doblemente_enlazada;

public class ListasDE {
    NodoDE inicio;

    public ListasDE(){
        inicio = null;
    }

    public boolean esta_vacia(){
        return inicio == null;
    }

    public void insertar(Object dato){
        if(esta_vacia()){
            NodoDE nuevo = new NodoDE(dato, null, null);
            inicio = nuevo;
        }else{
            NodoDE nuevo = new NodoDE(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void eliminar(){
        if(!esta_vacia()){
            if(inicio.getSiguiente()==null){
                inicio = inicio.getSiguiente();
            }else{
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
    }

    public void mostrar_adelante(){
        if(!esta_vacia()){
            NodoDE temp = inicio;
            while(temp != null){
                System.out.print(temp.getDato() + " "); 

                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }

    public void mostrar_atras(){
        if(!esta_vacia()){
            NodoDE ultimo = inicio;

            while(ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }

            NodoDE temp = ultimo;

            while(temp != null){
                System.out.print(temp.getDato() + " "); 

                temp = temp.getAnterior();
            }
            System.out.println();

        }
    }


}