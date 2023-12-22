import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];
		
		for (int i = 0; i < 2; i++)
			Arrays.setAll(a[i], idx -> sc.nextInt());
		
		int[] sum1 = new int[n];
		int[] sum2 = new int[n];
		sum1[0] = a[0][0];
		sum2[n - 1] = a[1][n - 1];
		
		for (int i = 1; i < n; i++) {
			sum1[i] = sum1[i - 1] + a[0][i];
			sum2[n - 1 - i] = sum2[n - i] + a[1][n - 1 - i];
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			int tmp = sum1[i] + sum2[i];
			max = Math.max(max, tmp);
		}
		
		System.out.println(max);
	}	
}
