import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] p = new int[n];
		int[] pSum = new int[n + 1];
		pSum[0] = 0;

		int i;
		for(i = 0; i < n; i++) {
			p[i] = scan.nextInt();
			pSum[i + 1] = pSum[i] + p[i];
		}

		double max = Double.MIN_VALUE;
		int index = 0;
		for(i = k; i < n + 1; i++) {
			double temp = pSum[i] - pSum[i - k];
			if(temp > max) {
				max = temp;
				index = i;
			}
		}

		double ans = 0;
		for(i = 0; i < k; i++) {
			double temp = pSum[index - i] - pSum[index - i - 1];
			ans += (temp + 1) * (temp / 2) / temp;
		}
		System.out.println(ans);
	}
}