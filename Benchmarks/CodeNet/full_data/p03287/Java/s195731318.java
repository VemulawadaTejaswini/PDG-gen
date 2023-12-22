import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long[] Ap = new long [N+1];
		long sum = 0,ans = 0;
		for(int r = 1;r <= N;r++) {
			sum += scn.nextInt();
			Ap[r] = sum;
			for(int l = 1;l <= r;l++) {
				if((Ap[r]-Ap[l-1])%M==0)ans++;
			}
		}
		System.out.println(ans);
		scn.close();
	}
}
