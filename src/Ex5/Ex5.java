package Ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible entre 2.");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2.");
        }

        sc.close();
    }

}