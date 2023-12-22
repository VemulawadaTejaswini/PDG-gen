import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int[] B = new int[A[N - 1] + 1];
		
		for(int i = 0; i < N; i++) {
			B[A[i]]++;
		}
		
		long S = 0;
		
		for(int i = 0; i < B.length; i++) {
			if(B[i] >= 2) {
				for(int j = i + 1; j < B.length; j++) {
					if(B[j] >= 2) {
						S = Math.max(S, i * j);
					}
				}
				if(B[i] >= 4) {
					S = Math.max(S, i * i);
				}
			}
		}
		System.out.println(S);
	}
}
