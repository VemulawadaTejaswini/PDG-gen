import java.util.*;
import java.lang.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int total = 0;
		for( int i=0; i<M; i++ ){
			int a = sc.nextInt();
			total += a;
		}
		if( total<=N ){
			System.out.println(N-total);
		}else{
			System.out.println(-1);
		}
	}
}