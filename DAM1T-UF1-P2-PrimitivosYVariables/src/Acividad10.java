import java.util.Random;
import java.util.Scanner;

public class Acividad10 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int aleatorio = random.nextInt(10);
		System.out.println("Introduce un numero de 0 a 9");
		int numero = scanner.nextInt();
		System.out.println(aleatorio == numero);
		
	}

}
