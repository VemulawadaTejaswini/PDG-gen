//package test_samples;

import java.util.Scanner;

// Beginner 135 City_Savers still wrong !!!

public class Main {

	static int A[] , B[] ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		
		int N = in.nextInt() ;
		
		int i ;
		
		A = new int[N+1] ;
		
		for(i=0;i<N+1;i++) {
			A[i] = in.nextInt() ;
		}
		
		B = new int[N] ;
		
		for(i=0;i<N;i++) {
			B[i] = in.nextInt() ;
		}
		
		int ans = 0 ;
		
		for(i=0;i<N;i++) {
			if(A[i]>B[i]) {
				ans += B[i] ;
			}else {
				if(A[i]<B[i]) {
					// check next
					
					ans += A[i] ;
					
					B[i] -= A[i] ;
					
					if(A[i+1]>=B[i]) {
						
						A[i+1] -= B[i] ;
						
						ans += B[i] ;
					}else {

						ans += A[i+1] ;
						
						A[i+1] = 0 ;
						
					}
				}else {
					ans += B[i] ;
				}
			}
		}
		
		System.out.println(ans);
		
		in.close() ;
	}

}
