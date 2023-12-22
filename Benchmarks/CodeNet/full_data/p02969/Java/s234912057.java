import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			long r = sc.nextLong();
			System.out.println(3 * r * r);
			
		}
	}
}