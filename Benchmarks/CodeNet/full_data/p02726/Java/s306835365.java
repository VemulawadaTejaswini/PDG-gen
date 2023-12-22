import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] count = new int[N+1];
		for( int i=1; i<=N-1; i++ ){
			for( int k=i+1; k<=N; k++ ){
				if( k<=X ){
					count[k-i]++;
				}
				if( i>=Y ){
					count[k-i]++;
				}
				if( k>X || i<Y ){
					count[ Math.min( k-i, Math.abs(i-X)+Math.abs(k-Y)+1 ) ]++;
				}
			}
		}
		for( int i=1; i<=N; i++ ){
			System.out.println(count[i]);
		}
	}
}
