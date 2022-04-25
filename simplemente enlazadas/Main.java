public class Main {

    public static void main(String[] args) {
        
        ListaSE lista = new ListaSE();

        lista.insertarInicio(234);
        lista.insertarInicio(23);
        lista.insertarInicio(3334);
        lista.insertarInicio(456);
        lista.insertarInicio(745);

        System.out.println("TAMAÑO --> " + lista.tamaño());
        System.out.println("ULTIMO DATO " + lista.ultimoDato());

        lista.mostrar();

    }
    
}
