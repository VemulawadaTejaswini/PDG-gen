import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bfr.readLine());
		
		int N = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(bfr.readLine());
		
		String S = str.nextToken();
		
		if (N %2 == 1) {
			System.out.println("No");
		}
		else {
			
			if (S.substring(0,(N/2)).equals(S.substring(N/2, N))) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
