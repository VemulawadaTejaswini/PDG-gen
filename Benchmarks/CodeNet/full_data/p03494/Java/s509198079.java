import java.io.*;

public class Main {
	public static void main( String[] args ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.valueOf( br.readLine() );
		String[] A = br.readLine().split( " " );

		boolean flg = true;
		int cnt = 0;
		while( flg ) {
			for( int i = 0; i < N; i++ ) {
				if( ( Integer.valueOf( A[i] ) % 2 ) != 0 ){
					flg =  true;
					break;
				}
			}
			cnt++;
		}
		System.out.println( cnt );
	}
}