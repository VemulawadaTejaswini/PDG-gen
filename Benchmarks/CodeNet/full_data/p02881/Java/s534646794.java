import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long NN = sc.nextLong();
		long a = 0;
		long b = 0; 
		long A = 0,B = 0;      
		for( int i=1; i*i<=N; i++ ){
			a++;
			b = NN/a;
			if( NN%a==0 ){
				A = a;
				B = b;              
			}
			if( a>=b ){
				break;              
            }              
			if( i*i==N ){
				A = NN;
				B = 1;
			}
		}
		System.out.println((A-1)+(B-1));
	}
}
