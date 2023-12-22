import java.util.*;


public class Main{
	public static void main( String args[] ) {

		int N,A,B;
		int l,s;
		int max,min;
		
		Scanner scan = new Scanner( System.in );
		N = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();
		
		if( A > B ) {
			l = A;
			s = B;
		}
		else {
			l = B;
			s = A;
		}
		
	
		max = s;
		min = -1;
		
		min = (N - l - s ) * min;
		
		if(min < 0 ) {
			min = 0;
		}
		
		System.out.println( max + " " + min  );
		
		scan.close();
		
	}
}