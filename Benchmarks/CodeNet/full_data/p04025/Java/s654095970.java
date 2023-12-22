import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int[] sum = new int[201];
		Arrays.fill(sum, 0);
		for(int i = -100;i <= 100;i++) {
			int n = i;
			for(int j = 0;j < N;j++) {
				sum[i+100] += (int)Math.pow(a[j]-n, 2);
			}
		}
		Arrays.sort(sum);
		System.out.println(sum[0]);
	}
}
