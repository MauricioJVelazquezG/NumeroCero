import java.util.Scanner;
import javax.swing.JOptionPane;
public class NumeroCero {
public static int obtenerNumero (String mensaje){
    int numeroTemporal = 0;
    while (numeroTemporal <= 0) {
            String numero = JOptionPane.showInputDialog("Give me a number:");
            numeroTemporal = Integer.parseInt(numero);
            
        }
        return numeroTemporal;
}

    public static void main (String[] args){
        int numero = obtenerNumero ("Give me a number:");
    }
}