import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner cin = new Scanner(System.in)) {
			if ((cin.nextInt() * 100 + cin.nextInt() * 10 + cin.nextInt()) % 4 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} finally {
		}
	}

}
