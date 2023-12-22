import java.util.*;


public class Main{
	public static void main( String args[] ) {
		String resMes;
		Scanner scan = new Scanner( System.in);
		
		
		int array[] = new int[2];
		
		for( int i = 0; i < array.length;  i++) {
			array[i ] = scan.nextInt();

		}
		
		if(  ( array[0] * array[1] ) % 2 == 0 ){
			resMes = "Even";
		}
		else {
			resMes = "Odd";
			
		}
		
		System.out.println( resMes );
		
		scan.close();
		
	}
}