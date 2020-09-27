import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Actividad11_Extra1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDate cumple = LocalDate.of(2000, Month.MARCH, 27);
		System.out.println("Tu cumple es: " + cumple);
		
		System.out.println("cuantos años le sumo?");
		cumple = cumple.plusYears(scanner.nextInt());
		
		System.out.println("cuantos dias le sumo?");
		cumple = cumple.plusDays(scanner.nextInt());
		System.out.println("Tu cumpe seria: " + cumple);
	}

}
