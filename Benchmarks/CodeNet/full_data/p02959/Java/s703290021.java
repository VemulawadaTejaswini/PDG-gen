import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		int[] B = new int[N];
		long ans = 0;
		for(int i = 0; i < N + 1; i++) A[i] = sc.nextInt();
		for(int i = 0; i < N; i++) B[i] = sc.nextInt();

		for(int i = 0; i < N; i++) {
			/* B[i] */
			// A[i]
			long killi = (A[i] >= B[i]) ? B[i] : A[i];
			ans += killi;
			A[i] -= killi; B[i] -= killi;

			// A[i + 1]
			long killii = (A[i + 1] >= B[i]) ? B[i] : A[i + 1];
			ans += killii;
			A[i + 1] -= killii; B[i] -= killii;
		}
		System.out.println(ans);
	}
}