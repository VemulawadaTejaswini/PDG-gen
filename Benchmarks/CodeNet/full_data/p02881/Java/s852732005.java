import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long NN = sc.nextLong();
		long a = 0;
		long b = 0; 
		String S = String.valueOf(NN);
		int R = S.length()/2+S.length()%2;
		if( S.length()<5 ){
			R = S.length();
		}    
		if( NN==1000000000000L ){
			R = 6;          
        }          
		long c = 1;
		for( int i=0; i<R; i++ ){
			c = c*10;
		}
		long A = 0,B = 0;      
		for( int i=1; i<=c; i++ ){
			a++;
			b = NN/a;
			if( NN%a==0 ){
				A = a;
				B = b;              
			}
			if( a>=b ){
				break;              
            }              
			if( i==c ){
				A = NN;
				B = 1;
			}
		}
		System.out.println((A-1)+(B-1));
	}
}
