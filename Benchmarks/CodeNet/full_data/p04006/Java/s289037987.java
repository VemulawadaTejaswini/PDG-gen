import java.util.Scanner;

public class Main {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x= sc.nextLong();
		long[] a = new long[2*(int)n];
		for (int i = 0; i<n; i++) {
			a[i]=sc.nextLong();
			a[i+(int)n]=a[i];
		}
		long[][] costs = new long[(int)n][(int)n];
		for (int i = (int)n; i<2*n; i++) {
			long best=a[i];
			for (int j=0; j<n; j++) {
				best=Math.min(best, a[i-j]);
				costs[i-(int)n][j]=best;
			}
		}
		long best = n*1000000000;
		for (int j = 0; j<n;j++) {
			long curr = j*x;
			for (int i = 0; i<n; i++) {
				curr+=costs[i][j];
			}
			best=Math.min(best, curr);
		}
		System.out.println(best);
	}
}