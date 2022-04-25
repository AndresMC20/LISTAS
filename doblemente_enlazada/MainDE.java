package doblemente_enlazada;

public class MainDE {

    public static void main(String[] args) {
        ListasDE listasde = new ListasDE();

        System.out.println(listasde.esta_vacia());

        for(int i = 20; i > 0; i--){
            listasde.insertar(i);
        }

        System.out.println(listasde.esta_vacia());

        listasde.mostrar_adelante();

        listasde.eliminar();
        listasde.eliminar();
        listasde.eliminar();
        listasde.eliminar();

        listasde.mostrar_adelante();

        listasde.mostrar_atras();

    }
    
}
