package com.gianpc.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		int edad = entrada.nextInt();
		
		System.out.println("Introduce tu nombre, por favor");
		
		entrada.nextLine();  // Si finalizamos con un nextLine debemos agregar una nextLine demas para un siguiente salto de linea y asi pueda leer la siguiente sentencia
		String nombre = entrada.nextLine();
		
		
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
		
		entrada.close();
		
	}
}
