import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int x = 1; x <= n; x++) {
			int tmp = x + x * 8 / 100;
			if (tmp == n) {
				System.out.println(x);
				return;
			}
		}
		
		System.out.println(":(");
	}
}
