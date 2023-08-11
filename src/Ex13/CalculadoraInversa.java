package Ex13;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculadoraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer operando (entero): ");
        int operando1 = sc.nextInt();

        System.out.print("Introduce el segundo operando (entero): ");
        int operando2 = sc.nextInt();

        System.out.print("Introduce el signo aritmético (+, -, *, /, ^, %): ");
        String signo = sc.nextLine();

        double resultado = 0;
        String mensaje = "";

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                } else {
                    mensaje = "División por cero no permitida.";
                }
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                mensaje = "Signo aritmético no válido.";
                break;
        }

        if (mensaje.isEmpty()) {
            mensaje = "El resultado de " + operando1 + " " + signo + " " + operando2 + " es " + resultado;
        }

        JOptionPane.showMessageDialog(null, mensaje);

        sc.close();
    }
}