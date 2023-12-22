import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int a = sc.nextInt();

			int r = 0;
			if (h % a > 0) {
				r++;
			}
			System.out.println(h / a + r);
		}
	}
}
