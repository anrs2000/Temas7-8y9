package EjerciciosCursoJava.Ejercicios789;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class EjercicioPropio {
    public static void main(String[] args) {
        //1. Creamos un ArrayList para guardar los nombres, y un LinkedList para guardar las profesiones
        ArrayList<String> nombres = new ArrayList<>();
        LinkedList<String> profesiones = new LinkedList<>();

        try {
            //2. Crear un PrintStream que incluya los nombres de los sujetos y otro que incluya las profesiones, en orden
            PrintStream archivoNombres = new PrintStream("nombres.txt");
            archivoNombres.println("Marta");
            archivoNombres.println("Roberto");
            archivoNombres.println("Lucia");
            archivoNombres.println("Jose");
            archivoNombres.println("Pedro");

            PrintStream archivoEdades = new PrintStream("profesiones.txt");
            archivoEdades.println("bombero");
            archivoEdades.println("policía");
            archivoEdades.println("investigador");
            archivoEdades.println("chef");
            archivoEdades.println("conductor");

            //3. Accedemos a los ficheros creados y añadimos la información al ArrayList y al LinkedList
            //Creamos un lector de Archivos
            FileReader fr = new FileReader("nombres.txt");
            //Pasamos la información del lector a un BufferedReader
            BufferedReader br = new BufferedReader(fr);
            //Leemos la información del Buffered mediante un readLine()
            String texto = br.readLine();
            //Añadimos la información al array nombre. Repetir hasta que se llegue al final del fichero
            while(texto != null) {
                nombres.add(texto);
                System.out.println(texto);
                //Leer la siguiente línea
                texto = br.readLine();
            }


            FileReader fr2 = new FileReader("profesiones.txt");
            BufferedReader br2 = new BufferedReader(fr2);
            String texto2 = br2.readLine();
            while(texto2 != null) {
                profesiones.add(texto2);
                System.out.println(texto2);
                texto2 = br2.readLine();
            }


            //Mostramos los datos contenidos en las listas
            System.out.print("Los nombres contenidos en el ArrayList son: ");
            System.out.println(nombres);

            System.out.print("Las profesiones contenidas en el LinkedList son: ");
            System.out.println(profesiones);


        }catch(Exception e) {
            System.out.println("Ha ocurrido un error");
        }

        //Añadir los datos del ArrayList y del LinkedList a un Mapa
        Map<String, String> mapa = new HashMap<>();
        for(int i = 0; i < nombres.size(); i++){
            mapa.put(nombres.get(i), profesiones.get(i));
        }

        System.out.println(mapa);


    }
}
