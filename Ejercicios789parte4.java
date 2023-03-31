package EjerciciosCursoJava.Ejercicios789;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;


public class Ejercicios789parte4 {
    /*Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     */
    public static void copia(InputStream fileIn, PrintStream fileOut) throws IOException {
        try {
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            fileOut.write(datos);
            fileOut.close();

        } catch(IOException e){
            System.out.println("Se ha producido una excepcion tipo: " + e.getClass());
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException{
        PrintStream infoArchivo = new PrintStream("origen.txt");
        infoArchivo.println("La información contenida en este archivo se copiará en el archivo llamado final");
        InputStream origen = new FileInputStream("origen.txt");

        PrintStream archivoDestino = new PrintStream("final.txt");

        copia(origen, archivoDestino);





    }
}
