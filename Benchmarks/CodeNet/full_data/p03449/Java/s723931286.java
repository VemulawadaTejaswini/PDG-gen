import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a1 = new int [n];
		int[] a2 = new int [n];

		for(int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			a2[i] = sc.nextInt();
		}

		int max = 0;
		int idx = 0;
		while(idx < n) {
			int sum = 0;
			for(int i = 0; i <= idx; i++) {
				sum += a1[i];
			}

			for(int i = idx; i < n; i++) {
				sum += a2[i];
			}
			max = Math.max(max, sum);
            idx++;
		}
		System.out.println(max);
	}
}