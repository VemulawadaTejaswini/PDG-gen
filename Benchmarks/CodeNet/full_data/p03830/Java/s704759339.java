import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long a = 0;
		long count = 0;
		for( int i=2; i<=N; i++ ){
			a = (i*(i+1))%1000000007L;
		}
		for( long i=1; i<=a/2-1; i++ ){
			if( a%i==0 ){
				count+=2;
			}
		}
		count = count%1000000007L;
		if( N==1 ){
			count = 1;
		}
		System.out.println(count);
	}
}
