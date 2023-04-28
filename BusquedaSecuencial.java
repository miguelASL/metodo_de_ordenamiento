import javax.swing.*;
import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        int[] arreglo = {4, 1, 5, 2, 3};
        int dato;
        boolean bandera = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));

        //*** BUSQUEDA SECUENCIAL ***
        int i = 0;
        while (i < 5 && bandera == false){
            if (arreglo[i]== dato){
                bandera = true;
            }
            i++;
        }
        if(bandera == false){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion: " + (i+1));
        }
    }
}
