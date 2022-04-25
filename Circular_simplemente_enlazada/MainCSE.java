package Circular_simplemente_enlazada;

public class MainCSE {
    public static void main(String[] args) {
        
        ListasCSE listascse = new ListasCSE();
        System.out.println(listascse.esta_vacia());
        System.out.println(listascse.tamaño());

        for(int i = 1; i <= 12; i++){
            listascse.insertar_fin(i);
        }

        listascse.mostrar();
        System.out.println(listascse.tamaño());

        listascse.eliminar_fin();
        listascse.eliminar_fin();

        listascse.mostrar();

        listascse.mostrar_circular(2);

    }
}
