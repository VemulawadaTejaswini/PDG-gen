import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int a = 0;
		int b = 0;
		
		if(N % 2 == 0) {
			B[N / 2] = A[0];
			for(int i = 1; i < N; i++) {				
				if((i % 2 != 0) && (a == 0)) {
					B[(N / 2) - (i + 1) / 2] = A[N - (i + 1) / 2];
					a = 1;
				} else if((i % 2 != 0) && (a == 1)) {
					B[(N / 2) - (i + 1) / 2] = A[(i + 1) / 2 - 1];
					a = 0;		
				} else if((i % 2 == 0) && (b == 0)){
					B[(N / 2) + (i / 2)] = A[N - (i + 2) / 2];
					b = 1;
				} else if((i % 2 == 0) && (b == 1)){
					B[(N / 2) + (i / 2)] = A[(i + 2) / 2 - 1];
					b = 0;					
				}
			}
		}
		
		if(N % 2 != 0) {
			B[(N - 1) / 2] = A[0];
			for(int i = 1; i < N; i++) {				
				if((i % 2 != 0) && (a == 0)) {
					B[(N - 1) / 2 - (i + 1) / 2] = A[N - (i + 1) / 2];
					a = 1;
				} else if((i % 2 != 0) && (a == 1)) {
					B[(N - 1) / 2 - (i + 1) / 2] = A[(i + 1) / 2 - 1];
					a = 0;		
				} else if((i % 2 == 0) && (b == 0)){
					B[(N - 1) / 2 + (i / 2)] = A[N - (i + 2) / 2];
					b = 1;
				} else if((i % 2 == 0) && (b == 1)){
					B[(N - 1) / 2 + (i / 2)] = A[(i + 2) / 2 - 1];
					b = 0;					
				}
			}	
		}
		
		int diff = 0;
		int sum = 0;
		
		for(int i = 1; i < N; i++) {
			diff = Math.abs(B[i] - B[i - 1]);
			sum = sum + diff;
		}
		

		System.out.println(sum);

	}
}
