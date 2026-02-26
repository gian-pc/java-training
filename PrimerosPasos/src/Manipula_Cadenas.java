
public class Manipula_Cadenas {

	public static void main(String[] args) {

		String nombre = "Hola Gian";

		System.out.println("Min nombre es: " + nombre);

		// Longitud del nombre
		System.out.println("Longitud del nombre: " + nombre.length());

		// Accediendo a un indice
		System.out.println("Accediendo a un caracter: " + nombre.charAt(2));

		// Accediendo a la ultima letra
		System.out.println("Accediendo a la ultima letra: " + (nombre.charAt((nombre.length() - 1))));

		// Trabajando con subcadenas - substring
		String frase = "No hay nada mejor que levantarse un domingo para estudiar Java";

		System.out.println("Substring con un solo parametro: " + frase.substring(30));
		System.out.println("Substring con dos parametros: " + frase.substring(30, 50));

		// Comparando 2 objetos - equals y equalsIgnoreCase

		String palabra1 = "casa";
		String palabra2 = "casa";
		System.out.println("Comparando: " + palabra1 + " = " + palabra2 + " -> " + palabra1.equals(palabra2));

	}

}
