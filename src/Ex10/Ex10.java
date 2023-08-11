package Ex10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de ventas: ");
		int num = sc.nextInt();
        double sumaDeVentas = 0;
        
		for (int i=1; i <= num; i++) {
            System.out.print("Introduce la venta " + i + ": ");
            double venta = sc.nextDouble();
            sumaDeVentas += venta;
		}
        System.out.println("La suma total de las ventas es: " + sumaDeVentas);
        sc.close();
	}
}
