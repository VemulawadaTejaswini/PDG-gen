import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] B = new int[N];

		for (int i=0; i<N+1; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<N; i++){
			B[i] = sc.nextInt();
		}
		long killTotal = 0;
		for (int i=0; i<N; i++){
			int killCnt;
			if (A[i] > B[i]){
				killCnt = B[i];
				A[i] = A[i] - killCnt;
				B[i] = 0;
			} else {
				killCnt = A[i];
				A[i] = 0;
				B[i] = B[i] -killCnt;
			}
			killTotal += killCnt;
			killCnt = 0;
			if (A[i+1] > B[i]){
				killCnt = B[i];
				A[i+1] = A[i+1] - killCnt;
				B[i] = 0;
			} else {
				killCnt = A[i+1];
				A[i+1] = 0;
				B[i] = B[i] -killCnt;
			}
			killTotal += killCnt;
		}
		System.out.println(killTotal);
	}
}