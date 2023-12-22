

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		
		int[] L = new int[N+1];
		int[] R = new int[N+1];
		
		int temp = 0;
		for (int i=0;i<N;i++) {
			temp+=A[i];
			L[i+1]=temp;
		}
		temp = 0;
		for (int i=N-1;i>-1;i--) {
			temp+=A[i];
			R[i+1]=temp;
		}
		int ans = 10000000;
		for (int i=0;i<N;i++) {
			ans = Math.min(ans, Math.abs(L[i]-R[i+1]));
		}
		
		System.out.println(ans);
	}

}
