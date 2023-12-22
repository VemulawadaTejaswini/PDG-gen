//package atcoder;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		for(int i =0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		//System.out.println(A[7]);
		for(int j=1;j<N+1;j++) {
			for(int k=0;k<N;k++) {
				if(A[k]==j) {
					B[j-1] = k+1;
					}
			
			}
		
		}
		for(int i=0;i<N;i++) {
			System.out.print(B[i]+" ");
		}
	}
}