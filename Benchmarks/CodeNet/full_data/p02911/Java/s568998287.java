import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int Q = scn.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < Q;i++) {
			int a = scn.nextInt()-1;
			A[a]++;
		}
		int[] ans = new int[N];
		for(int i = 0;i < N;i++) {
			ans[i] = K -  Q + A[i];
		}

		for(int i = 0;i < N;i++) {
			System.out.println((ans[i] > 0)?"Yes":"No");
		}
	}

}
