import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String text = "NO";
			int mul = 0;
			int i = 0;
			for (i = 0; i < b; i++) {
				mul = mul + a;
				if (mul % b == c) {
					text = "YES";
					break;
				}
			}
			System.out.println(text);
		}
	}
}