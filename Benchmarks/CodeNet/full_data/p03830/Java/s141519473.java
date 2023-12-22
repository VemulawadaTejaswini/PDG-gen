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
		long d = 0;      
		if( a>20000L ){		//
			a = a/100L;
			d = 1;          
        }          
		if( a>2000000L ){
			a = a/1000L;
			d = 1;          
        }     				// 
		for( long i=1; i<=a; i++ ){
			if( a%i==0 ){
				count++;
			}
		}      
		System.out.println(count+d);
	}
}
