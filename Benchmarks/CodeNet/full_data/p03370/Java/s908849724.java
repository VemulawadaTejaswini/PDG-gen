import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int[] m = new int[n];
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			sum += m[i];
			min = Math.min(min, m[i]);
		}
		System.out.println((x-sum)/min + n);
		sc.close();
	}
}