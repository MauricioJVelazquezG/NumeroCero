import java.util.Scanner;
import javax.swing.JOptionPane;

public class NumeroCeroScanner {
private static final Scanner scanner = new Scanner(System.in);
public static int obtenerNumero (String mensaje){
    int numeroTemporal = 0;
    while (numeroTemporal <= 0) {
            System.out.println ("Give me a number:");
            numeroTemporal = scanner.nextInt();
            
        }
        return numeroTemporal;
}

    public static void main (String[] args){
        int numero = obtenerNumero("Give me a number:");
    }
}