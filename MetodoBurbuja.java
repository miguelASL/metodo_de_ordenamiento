import javax.swing.*;
import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arreglo;
        int elementos, aux;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos " +
                "del array: "));
        arreglo = new int [elementos]; // Le asignamos un numero de elementos al array.
        for (int i = 0; i < elementos; i++){
            System.out.println((i +1) + " . Digite un numero: ");
            arreglo[i] = s.nextInt();
        }
        // *** METODO BURBUJA ***
        for (int i = 0; i < (elementos-1); i++){
            for (int j = 0; (j< elementos-1); j++){
                if (arreglo[j] > arreglo[j + 1]){ // Si el numeroActual > numeroSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        // Mostrando el arreglo ordenado de forma creciente.
        System.out.println("\nArreglo ordenado de forma creciente: ");
        for (int i = 0; i < elementos; i++){
            System.out.println(arreglo[i] + " - ");
        }
        System.out.println("");
    }
    // Mostrando el arreglo ordenado de forma decreciente.
/*        System.out.println("\nArreglo ordenado de forma creciente: ");
        for (int i =(elementos -1);i >= 0; i--){
        System.out.println(arreglo[i] + " - ");
    }
        System.out.println("");*/
}


}
