package EjerciciosCursoJava.Ejercicios789;
import java.util.ArrayList;

public class Ejercicios789parte2 {
    public Ejercicios789parte2() {
    }

    public static void main(String[] args) {
        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.*/
        ArrayList<Integer> numeros = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            numeros.add(i);
        }
        System.out.println(numeros);

        for(int i = 1; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        System.out.println(numeros);

    }

}
