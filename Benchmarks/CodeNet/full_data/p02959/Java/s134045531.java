import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int N = sc.nextInt();

		int A[] = new int[N+1];
		int B[] = new int[N];
		
		for(int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		long  num = 0;
		
		/*
		for(int i = 0; i < N; i++) {
			if(B[i] >= A[i]) {
				num += A[i];
				B[i] -= A[i];
			} else {
				num += B[i];
				B[i] = 0;
			}
			
			if(B[i] >= A[i+1]) {
				num += A[i+1];
				A[i+1] = 0;
			} else {
				num += B[i];
				A[i+1] -= B[i];
			}
		}
		*/
		
		for(int i = N; i >= 0; i--) {
			
			if(i != N) {
				if(A[i] <= B[i]) {
					num += A[i];
					A[i] = 0;
				} else {
					num += B[i];
					A[i] -= B[i];
				}
			}
			
			if(i == 0) break;
			
			if(A[i] <= B[i-1]) {
				num += A[i];
				B[i-1] -= A[i];
			} else {
				num += B[i-1];
				B[i-1] = 0;
			}
		}
		
		
		System.out.println(num);

        sc.close();
	}
}