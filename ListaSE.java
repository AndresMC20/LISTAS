public class ListaSE {

    Nodo inicio;

    //metodo constructor
    public ListaSE(){
        this.inicio = null;
    }
    
    //vacia?
    public boolean esta_vacia(){
        return inicio == null;
    }

    //tamaño lista
    public int tamaño(){
        int contador = 0;
        Nodo aux = inicio;
        while (aux != null){

            contador ++;
            aux = aux.getSiguiente();

        }

        return contador;
    }

    //valor ultimo nodo
    public Object ultimoDato(){
        Nodo aux = inicio;

        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();

        }

        return aux.getSiguiente();
    }

}
