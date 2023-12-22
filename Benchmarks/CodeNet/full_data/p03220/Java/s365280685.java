import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int []H = new int[N];
		double[]deg = new double[N];

		for (int i = 0; i < N; i++) {
			deg[i] =T - sc.nextInt() * 0.006;
		}
		double min = Double.MAX_VALUE;
		int ans = -1;
		for (int i = 0; i < deg.length; i++) {
			if (min > Math.abs(A - deg[i])) {
				min = Math.abs(A - deg[i]);
				ans=i+1;
			}
		}

		System.out.println(ans);

	}


}

