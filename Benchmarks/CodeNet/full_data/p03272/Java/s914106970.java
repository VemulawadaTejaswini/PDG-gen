
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int i = sc.nextInt();


			System.out.println(n - i + 1);
		}
	}
}
