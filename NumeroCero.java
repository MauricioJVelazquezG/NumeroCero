import java.util.Scanner;
import javax.swing.JOptionPane;

public class NumeroCero {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String numero = JOptionPane.showInputDialog("Give me a number:");
        int numero1 = Integer.parseInt(numero);

        while (numero1 == 0) {
            System.out.println("El numero no puede ser 0 escoge un numero positivo");
            numero = JOptionPane.showInputDialog("Give me a number:");
            numero1 = Integer.parseInt(numero);
            
        }
    }
}