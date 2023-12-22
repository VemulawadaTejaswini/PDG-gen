import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[4][4];
		for( int i=1; i<=3; i++ ){
			for( int k=1; k<=3; k++ ){
				A[i][k] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		int[] B = new int[N];
		for( int i=0; i<N; i++ ){
			B[i] = sc.nextInt();
			loop:for( int j=1; j<=3; j++ ){
				for( int k=1; k<=3; k++ ){
					if( B[i]==A[j][k] ){
						A[j][k] = 0;
						break loop;
					}
				}
			}
		} 
		int ans = 0;
		if( A[1][1]==A[1][2] && A[1][2]==A[1][3] ){
			ans = 1;
		}
		if( A[2][1]==A[2][2] && A[2][2]==A[2][3] ){
			ans = 1;
		}
		if( A[3][1]==A[3][2] && A[3][2]==A[3][3] ){
			ans = 1;
		}
		if( A[1][1]==A[2][1] && A[2][1]==A[3][1] ){
			ans = 1;
		}
		if( A[1][2]==A[2][2] && A[2][2]==A[3][2] ){
			ans = 1;
		}
		if( A[1][3]==A[2][3] && A[2][3]==A[3][3] ){
			ans = 1;
		}
		if( A[1][1]==A[2][2] && A[2][2]==A[3][3] ){
			ans = 1;
		}
		if( A[1][3]==A[2][2] && A[2][2]==A[3][1] ){
			ans = 1;
		}
		System.out.println(ans==1?"Yes":"No");
	}
}