import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] points = new int[n][d];
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			int[] point = new int[d];
			for (int j = 0; j < d; j++) {
				point[j] = sc.nextInt();
			}
			points[i] = point;
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i+1; j < n;j++) {
				double sum = 0.0;
				for (int k = 0; k < d; k++) {
					sum += (points[i][k] - points[j][k])*(points[i][k] - points[j][k]);
				}
				sum = Math.sqrt(sum);
				if ((sum - (int)sum) == 0) {res++;}
			}
		}
		
		System.out.println(res);
		
		sc.close();
	}

}
