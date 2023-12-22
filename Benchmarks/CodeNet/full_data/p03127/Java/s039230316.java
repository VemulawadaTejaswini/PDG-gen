import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {



	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int [N];

		for (int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		int zerocnt = 0;
		int notzero = A[0];
		while (zerocnt < N - 1){
			notzero = A[zerocnt];
			for (int i = zerocnt + 1; i<N;i++) {
				A[i] = A[i] % notzero;
				if(A[i] == 0) {
					zerocnt++;
				}
				Arrays.sort(A);
			}
		}
		System.out.println(A[N-1]);
		
		
		
	}
}	
