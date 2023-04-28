import javax.swing.*;
import java.util.Scanner;

public class OrdenamientoInsercion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arreglo[], nelementos, pos, aux;

        nelementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos: "));

        arreglo = new int[nelementos];

        System.out.print("Digite el arreglo: ");
        for (int i = 0;i < nelementos; i++){
            System.out.print((i+1) + " . digite un numero: ");
            arreglo[i] = s.nextInt();
        }
        // *** ORDENAMIENTO DE INSERCION ***.

        for (int i = 0; i< nelementos;i++){
            pos = i;
            aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos -1];
                pos --;
            }
            arreglo[pos]= aux;
        }
        System.out.println("\nOrden Ascendente: ");
        for (int i = 0; i < nelementos; i++){
            System.out.println(arreglo[i] + " - ");
        }
        System.out.println("");

        System.out.println("\nOrden Descendente: ");
        for (int i = (nelementos-1);i >= 0; i--){
            System.out.println(arreglo[i] + " - ");
        }
        System.out.println("");
    }
}
