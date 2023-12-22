import java.util.*;


public class Main{
	public static void main( String args[] ) {

		int N;
		long A[];
		long B[];
		boolean isFinish[];
		
		long takahashi,aoki;
		
		
		Scanner scan = new Scanner( System.in );
		N = scan.nextInt();
		
		A = new long[ N  ];
		B = new long[ N  ];
		isFinish = new boolean[ N ];
		for( int i = 0; i < N; i ++ ) {
			A[i] = scan.nextLong();
			B[i] = scan.nextLong();
			isFinish[i] = false;
		}
		
		takahashi = 0;
		aoki = 0;
		
		int index;
		long temp;
		boolean isFirst;
		
		long ATemp[] = new long[ A.length ];
		long BTemp[] = new long[ B.length ];
		
				
		for ( int i = 0; i < N; i++) {
			ATemp[i] = A[i] - B[i];
			BTemp[i] = B[i] - A[i];
		}
		
		for( int i =0; i < N  ; i++) {
			
			index = -1;
			isFirst = true;
			temp = 0;
			
			if( i %2 == 0 ) {	
				for( int j =0; j < N; j ++) {
	
					if(!isFinish[j] ) {
						/*
						if( isFirst || temp < A[j] - B[j] ) {
							temp = A[j] - B[j];
							index = j;
						}
						*/

						if( isFirst || temp < ATemp[j] ) {
							temp = ATemp[j];
							index = j;
						}

						
					}
				}
				takahashi += A[index];
				isFinish[index] = true; 
			}
			else {
				for( int j =0; j < N; j ++) {
					
					if(!isFinish[j] ) {
						/*
						if( isFirst || temp < B[j] - A[j] ) {
							temp = B[j] - A[j];
							index = j;
						}
						*/
						if( isFirst || temp < BTemp[j] ) {
							temp = BTemp[j];
							index = j;
						}						
					}
				}
				//System.out.println( "a:" + i + ":" + aoki + ":" + B[index] );
				aoki += B[index];
				isFinish[index] = true; 
				//System.out.println( "b:" + i + ":" + aoki + ":" + B[index] );

			}
			
		//	System.out.println(i + ":" + takahashi + ":" + aoki );
			
			
		}
		
				
		System.out.println( (takahashi - aoki )  );
		
		scan.close();
		
	}
}