import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum += d / a + 1;
			if (d < a * (d / a) + 1) {
				sum--;
			}
		}
		System.out.println(sum + x);
	}
}