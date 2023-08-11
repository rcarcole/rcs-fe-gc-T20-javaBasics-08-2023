package Ex12;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String contrasena = "1234";
        int intentosRestantes = 3;
        boolean acertado = false;

        while (intentosRestantes > 0 && !acertado) {
            System.out.print("Por favor, introduce la contraseña: ");
            String contraseñaIntroducida = scanner.nextLine();
            
            if (contraseñaIntroducida.equals(contrasena)) {
                acertado = true;
                System.out.println("Enhorabuena");
            } else {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Contraseña incorrecta. Te quedan " + intentosRestantes + " intento(s).");
                } else {
                    System.out.println("Contraseña incorrecta. No te quedan más intentos.");
                }
            }
        }
        scanner.close();
	}
}
