package EjerciciosCursoJava.Ejercicios789;
import java.util.Scanner;
import java.lang.ArithmeticException;

public abstract class Ejercicios789parte3 {
    /*Crea una función DividePorCero.
    Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
    Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
    Finalmente, mostraremos en cualquier caso: "Demo de código".*/

    public static void Dividir(int A, int B) throws ArithmeticException{
        try {
            int resultado = A / B;
            System.out.println("El resultado de la division es " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        Dividir(numeroA, numeroB);
    }

}
