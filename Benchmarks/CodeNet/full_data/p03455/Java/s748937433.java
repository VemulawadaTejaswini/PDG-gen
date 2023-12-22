import java.io.*;

public class Main {
	public static void main( String[] args ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] AB = br.readLine().split( " " );
		Integer A = Integer.valueOf( AB[0] );
		Integer B = Integer.valueOf( AB[1] );

		Integer Ans = A * B;
		if( (Ans % 2) == 0 ) {
			System.out.println( "Even" );
		} else {
			System.out.println( "Odd" );
		}
	}
}