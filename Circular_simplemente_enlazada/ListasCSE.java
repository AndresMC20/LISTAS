package Circular_simplemente_enlazada;

public class ListasCSE {
    
    NodoCSE inicio;

    public ListasCSE(){
        inicio = null;
    }

    public boolean esta_vacia(){
        return inicio == null;
    }

    public int tamaño(){
        int contador = 0;
        if(!esta_vacia()){
            NodoCSE ultimo = inicio;
            while(ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();

                contador ++;
            }
            contador++;
        }
        return contador;
    }

    public void insertar_fin(Object dato){
        if(esta_vacia()){
            NodoCSE nuevo = new NodoCSE();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        
        }else{
            NodoCSE nuevo = new NodoCSE();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            NodoCSE ultimo = inicio;
            
            while(ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);

        }
    }

    public void eliminar_fin(){
        if(!esta_vacia()){
            NodoCSE penultimo = inicio;

            while(penultimo.getSiguiente().getSiguiente() != inicio){
                penultimo = penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }

    public void mostrar(){
        if(!esta_vacia()){
            NodoCSE ultimo = inicio;

            while(ultimo.getSiguiente() != inicio){
                System.out.print(ultimo.getDato() + " ");

                ultimo = ultimo.getSiguiente();
            }
            System.out.print(ultimo.getDato() + " ");
            System.out.println();
        }
    }

    public void mostrar_circular(int vueltas){
        if(!esta_vacia()){
            int contador = 0;

            NodoCSE temp = inicio;

            while(temp != null && contador < (tamaño() * vueltas)){
                System.out.print(temp.getDato() + " ");

                temp = temp.getSiguiente();

                contador ++;
            }
            
        }
    }

}
