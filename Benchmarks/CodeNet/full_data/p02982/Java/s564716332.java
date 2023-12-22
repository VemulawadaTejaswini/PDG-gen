import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int[][] x = new int[n][d];
		for (int i = 0; i < n; i++)
			Arrays.setAll(x[i], idx -> sc.nextInt());
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				double dis = calcDis(x[i], x[j]);
				if (dis == (int) dis) cnt++;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
	
	static double calcDis(int[] y, int[] z) {
		double sum = 0;
		for (int i = 0; i < y.length; i++) {
			sum += (y[i] - z[i]) * (y[i] - z[i]);
		}
		
		return Math.sqrt(sum);
	}
	
}


