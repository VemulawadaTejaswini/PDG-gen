import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			if (k % 2 == 0) {
				System.out.println((int) Math.pow((k / 2), 2));
			} else {
				System.out.println((k / 2) * (k / 2 + 1));
			}
		}
	}
}
