import java.util.Scanner;

public class Main1 {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());

		System.out.println((n - h + 1) * (n - w + 1));


	}
}
