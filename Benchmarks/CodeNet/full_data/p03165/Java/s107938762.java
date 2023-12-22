import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	
	static void printMatrixInt(int[][] array) {
		if (array == null || array.length == 0)
			return;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (j > 0)
					System.out.print(" ");
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) throws IOException {
		StringBuilder out = new StringBuilder();
		BufferedReader in;
		
			in = new BufferedReader(new InputStreamReader(System.in));

		char a[] = in.readLine().toCharArray();
		char b[] = in.readLine().toCharArray();
		
		int dp[][] = new int[a.length+1][b.length+1];
		
		for( int i =1; i <= a.length; i++ ) {
			for( int j = 1; j <= b.length;j++ ) {
				if( a[i-1] == b[j-1] ) {
					dp[i][j] = Math.max(dp[i-1][j-1] + 1, Math.max(dp[i-1][j], dp[i][j-1])); 
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		
		ArrayList<Character> values = new ArrayList();
		
		solve( out, a.length, b.length, dp, a );
		
		//System.out.println(values);
		
		System.out.println(out);
		//printMatrixInt(dp);

	}
	
	public static void solve( StringBuilder out, int x, int y, int dp[][], char a[] ) {
		
		if( x > 0 && dp[x-1][y] == dp[x][y] ) {
			solve(out, x-1, y, dp, a);
		}
		else if( y > 0 && dp[x][y-1] == dp[x][y] ) {
			solve( out, x, y-1, dp, a );
		}else if( x > 0 || y > 0 ) {
			solve( out, x-1, y-1, dp, a );
			out.append( a[x-1] );
		}
	}
	
	public static int[] readInts(String cad) {
		String read[] = cad.split(" ");
		int res[] = new int[read.length];
		for (int i = 0; i < read.length; i++) {
			res[i] = Integer.parseInt(read[i]);
		}
		return res;
	}
	
}
