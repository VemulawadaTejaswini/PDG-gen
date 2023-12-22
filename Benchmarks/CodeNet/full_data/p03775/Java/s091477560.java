import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long ans = 0;
		for( long i=1; i*i<=N; i++ ){
			if( N%i==0 ){
				ans = N/i;
			}
		}
		String ss = String.valueOf(ans);
		System.out.println(ss.length());
	}
}
