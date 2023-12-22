import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	/**
	 * Main method.
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    
	    String n = in.readLine();
	    int answer = 0;

		for (int i = 0; i < n.length(); i++) {
			String n_i = n.substring(i, i+1);
			if (i == 0) {
				answer += Integer.parseInt(n_i) - 1;
			} else {
				answer += 9;
			}
		}
		
		System.out.println(answer);
 
	}
}