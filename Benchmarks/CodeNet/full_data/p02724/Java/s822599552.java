
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Long n 	   = Long.parseLong(scanner.nextLine());
		Long count  = (long)Math.floor(n / 500.0);
		Long tcoun  = (long)Math.floor((n - 500 * count) / 5.0);

		System.out.println(count * 1000 + tcoun * 5);


	}
}