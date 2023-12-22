import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[100001];
		int[] B = new int[100001];
		int a1 =1, a2 = 0,b1 = 1,b2 = 0;
		int ans = 0;
		for(int i = 0;i < N;i++) {
			if(i%2 == 0) {
				A[scn.nextInt()]++;
			}else {
				B[scn.nextInt()]++;
			}
		}
		for(int i = 2;i <= 100000;i++) {
			if(A[i] > A[a1]) {
				a2 = a1;
				a1 = i;
			}else {
				if(A[i] > A[a2]) {
					a2 = i;
				}
			}
			if(B[i] > B[b1]) {
				b2 = b1;
				b1 = i;
			}else {
				if(B[i] > B[b2]) {
					b2 = i;
				}
			}
		}
		if(a1!=b1) {
			ans = N - A[a1] - B[b1];
		}else {
			ans = Math.min(N-A[a1]-B[b2], N-A[a2]-B[b2]);
		}
		System.out.println(ans);
		scn.close();

	}
}