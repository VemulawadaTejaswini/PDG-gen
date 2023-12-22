import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		int cnt = 0;
		if (a == b) cnt++;
		if (a == c) cnt++;
		if (b == c) cnt++;
		if (cnt == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
