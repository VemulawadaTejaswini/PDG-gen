import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();

		for(int a = 0; a <= n; a++) {
			for(int b = 0; b <= n; b++) {
				int c = n - a - b;
				int total = a * 10000 + b * 5000 + c * 1000;
				if(total == y && c >= 0) {
					System.out.println(a + " " + b + " " + c);
					return;
				}
			}
		}

		System.out.println("-1 -1 -1");
	}
}