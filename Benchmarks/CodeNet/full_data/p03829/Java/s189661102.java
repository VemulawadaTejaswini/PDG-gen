import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int cost = 0;
		for (int i = 0; i < n-1; i++) {
			cost += Math.min((x[i + 1] - x[i]) * a, b);
		}
		System.out.println(cost);
	}

}
