import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
		for (int i = (int) (Math.sqrt(c) - 2); i <= Math.sqrt(c); i++) {
			if (i * i == c) {
				System.out.println("Yes");
			}
		}
	}
}