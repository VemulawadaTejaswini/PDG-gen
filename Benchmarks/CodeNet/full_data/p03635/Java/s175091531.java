
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {
			 final int n = s.nextInt();
			 final int m = s.nextInt();
			 
			 System.out.println((n - 1) * (m - 1));
		}
	}
}
