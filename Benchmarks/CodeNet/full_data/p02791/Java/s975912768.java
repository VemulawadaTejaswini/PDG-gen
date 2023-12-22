import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] P = new int[N];
		for( int i=0; i<N; i++ ){
			P[i] = sc.nextInt();
		}
		int count = 0;
		int minium = P[0];
		for( int i=0; i<N; i++ ){
			if( P[i]<=minium ){
				minium = P[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
