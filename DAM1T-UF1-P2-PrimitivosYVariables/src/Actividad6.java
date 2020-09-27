import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad;
		String nombre;
		
		System.out.println("Dime tu nombre: ");
		nombre = scanner.next();
		
		System.out.println("Dime tu edad: ");
		edad = scanner.nextInt();
		
		System.out.println("Hola " + nombre + " de edad " + edad);
	}

}
