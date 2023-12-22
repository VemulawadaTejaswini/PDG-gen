import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double[] cs = new double[n];
		cs[0] = (1 + sc.nextInt()) / 2.0;
		
		for (int i = 1; i < n; i++) {
			int p = sc.nextInt();
			cs[i] = cs[i - 1] + (1 + p) / 2.0;
		}
		
		double max = cs[k - 1];
		for (int i = k; i < n; i++) {
			max = Math.max(max, cs[i] - cs[i - k]);
		}
		
		System.out.println(max);
		
		sc.close();
	}

}


