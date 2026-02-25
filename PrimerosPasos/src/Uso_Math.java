// Clase Math
public class Uso_Math {

	public static void main(String[] args) {
		
		// Probaremos el uso del metodo round
		
		// Primer caso: double --> long
		long caso1 = Math.round(9.56);
		System.out.println("Ingresa un double y retorna un long: " + caso1);
		
		// Segundo caso: float --> int
		int caso2 = Math.round(3.45F);
		System.out.println("Ingresa un float y retorna un int: " + caso2);
		
		
		
		// Casting
		
		// Si tenemos un caso donde no es posible cambiar el tipo de dato, aqui nos ayuda el casting
		
		double precio = 4.5;
		
		// casteo de datos primitivos como byte, float, double, int, long
		int resultado = (int) Math.round(precio); // casting de double a int
		
		System.out.println("casteo: " + resultado);
		
	}

}
