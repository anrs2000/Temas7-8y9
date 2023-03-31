package EjerciciosCursoJava.Ejercicios789;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;


public class Ejercicios789 {
    public static void main(String[] args) {

        //Escribe el código que devuelva una cadena al revés.
        String cadena = "Hola mundo";

        String inversa = "";
        for(int i = (cadena.length() -1); i >= 0; i--){
            inversa = inversa + cadena.charAt(i);
        }
        System.out.println(inversa);

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores
        String[] nombres = {"Pedro", "Juan", "Mario"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones
        int[][] enteros = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[1].length; j++) {
                System.out.print("Estamos en la fila " + i + " y columna " + j);
                System.out.println(" El valor de esta posicion es " + enteros[i][j]);
            }
        }

        //Crea un Vector del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> animales = new Vector();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Conejo");
        animales.add("Pato");
        animales.add("Ganso");

        while (animales.size() > 3) {
            animales.remove(1);
        }

        System.out.println(animales);

        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.add("Elemento3");
        lista.add("Elemento4");

        LinkedList<String> copiaLista = new LinkedList<>(lista);

        System.out.println("Los elementos del ArrayList son: ");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Los elementos del LinkedList son: ");
        for (String dato : copiaLista) {
            System.out.println(dato);
        }

    }
}
