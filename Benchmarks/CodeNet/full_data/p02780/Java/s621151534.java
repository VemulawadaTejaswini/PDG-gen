import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] p = new int[n];
		Arrays.setAll(p, i -> sc.nextInt());
		
		int[] sumP = new int[n];
		double[] sumEv = new double[n];
		
		for (int i = 0; i < n; i++) {
			int bgn = Math.max(0, i - k + 1);
			int end = Math.min(i, n - k);
			
			for (int j = bgn; j <= end; j++) {
				sumP[j] += p[i];
				sumEv[j] += (1 + p[i]) / 2.0;
			}
		}
//		System.out.println(Arrays.toString(sumP));
//		System.out.println(Arrays.toString(sumEv));
		
		Arrays.sort(sumEv);
		double ans = sumEv[n - 1];
		
		System.out.println(ans);
		
		sc.close();
	}
	
	

}


