package Ex11;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 7 y te diré si es dia laboral o festivo: ");
		int dia = sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes, dia laboral");
			break;
		case 2:
			System.out.println("Martes, dia laboral");
			break;
		case 3:
			System.out.println("Miércoles, dia laboral");
			break;
		case 4:
			System.out.println("Jueves, dia laboral");
			break;
		case 5:
			System.out.println("Viernes, dia laboral");
			break;
		case 6:
			System.out.println("Sábado, dia no laborable");
			break;
		case 7:
			System.out.println("Domingo, dia no laborable");
			break;
		}
		sc.close();
	}
}
