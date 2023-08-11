package Ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, ingresa el precio del producto: ");
        double precio = sc.nextDouble();

        double precioConIVA = precio + (precio * IVA);

        System.out.println("El precio final con IVA del 21% es: " + precioConIVA);

        sc.close();
    }

}
