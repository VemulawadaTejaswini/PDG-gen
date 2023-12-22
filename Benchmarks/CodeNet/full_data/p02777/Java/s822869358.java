import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] p = new int[n];
		Arrays.setAll(p, i -> sc.nextInt());
		
		double maxSumEv = 0.0;
		for (int i = 0; i <= n - k; i++) {
			double sumEv = 0;
			for (int j = i; j < i + k; j++) {
				sumEv += (1 + p[j]) / 2.0;
			}
			maxSumEv = Math.max(maxSumEv, sumEv);
		}
		
		System.out.println(maxSumEv);
		
		sc.close();
	}
	
	

}


