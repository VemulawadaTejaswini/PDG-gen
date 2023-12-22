import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int x = Integer.parseInt(s[1]);

		int p = 0;
		int c = 1;
		s = br.readLine().split(" ");
		for ( String l : s ) {
			p += Integer.parseInt(l);
			if ( p > x ) {
				break;
			}
			c++;
		}
		System.out.println(c);
	}
}
