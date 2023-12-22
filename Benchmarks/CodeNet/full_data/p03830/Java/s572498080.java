import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long a = 1;
		long count = 0;
		for( int i=1; i<=N; i++ ){
			a = (a*i)%1000000007L;
		}     
		for( long i=1; i<=a/2; i++ ){
			if( a%i==0 ){
				count+=2;
			}
		}      
		System.out.println(count);
	}
}
