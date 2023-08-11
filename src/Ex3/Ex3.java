package Ex3;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Introduce tu nombre: ");
		JOptionPane.showMessageDialog(null, "-- Bienvenido " +name+ " --");
	}
}
