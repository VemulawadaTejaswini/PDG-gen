import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[][] cc = new int[4][4];
		for( int i=1; i<=3; i++ ){
			for( int k=1; k<=3; k++ ){
				cc[i][k] = sc.nextInt();
			}
		}
		loop:for( int i=0; i<=100; i++ ){
			for( int j=0; j<=100; j++ ){
				for( int k=0; k<=100; k++ ){
					int a = cc[1][1]-i;
					int b = cc[1][2]-i;
					int c = cc[1][3]-i;
					int d = cc[2][1]-j;
					int e = cc[2][2]-j;
					int f = cc[2][3]-j;
					int g = cc[3][1]-k;
					int h = cc[3][2]-k;
					int l = cc[3][3]-k;
					if( a==d && d==g && b==e && e==h && c==f && f==l ){
						System.out.println("Yes");
						break loop;
					}
				}
			}
			if( i==100 ){
				System.out.println("No");
				break;
			}
		}
	}
}
