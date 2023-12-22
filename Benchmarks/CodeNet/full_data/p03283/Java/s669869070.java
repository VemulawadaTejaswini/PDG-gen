import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int Q = scn.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for(int i = 0;i < M;i++){
			L[i] = scn.nextInt();
			R[i] = scn.nextInt();
		}
		for(int i = 0;i < Q;i++) {
			int ans = 0;
			int l = scn.nextInt();
			int r = scn.nextInt();
			for(int j = 0;j < M;j++) {
				if(L[j] >= l && R[j] <= r)ans++;
			}
			System.out.println(ans);
		}
		scn.close();
	}
}
