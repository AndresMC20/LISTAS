package Circular_doblemente_enlazada;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista.estaVacia());

        for(int i = 1; i <= 5; i++){
            lista.insertarFinal(i);
        }


        lista.mostrar();


        lista.eliminarFinal();
        lista.eliminarFinal();
        lista.mostrar();


        lista.mostrarAdelante(4);
        

        lista.mostrarAtras(4);

    }
}
