import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		int x = Math.max(h, w);
		System.out.println((n + x - 1) / x);
	}
}
