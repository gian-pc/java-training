package com.gianpc.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor: "));
		
		boolean mayor_edad = false;
		
		if(edad >= 18) {
			
			mayor_edad = true;
		}

		if (mayor_edad) {
			
			String carnet = JOptionPane.showInputDialog("Tienes carnet?: ");

			if (carnet.equalsIgnoreCase("si"))JOptionPane.showMessageDialog(null, "Puedes comprar el coche");

			else JOptionPane.showMessageDialog(null, "Sin carnet no hay coche");

		} else JOptionPane.showMessageDialog(null, "Si ere menor no puedes tener carnet y por lo tanto tampoco coche");

	}

}
