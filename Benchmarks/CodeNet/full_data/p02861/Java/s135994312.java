import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double num = 0;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n - 1; j++) {
				num = 0;
				int dx = x[j + 1] - x[i];
				int dy = y[j + 1] - y[i];
				num += dx * dx + dy * dy;
				sum += Math.sqrt(num);
			}
		}
		//System.out.println(sum / factorial(n));
		System.out.println(sum * 2 / n);

	}

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}


}
