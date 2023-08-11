package Ex4;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        String input = sc.nextLine();
        double radio = Double.parseDouble(input);

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " es " + area);
        sc.close();
	
	}
}
