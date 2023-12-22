import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch1 = br.readLine().charAt(0);
		int ascii = (int)ch1;
		ascii++;
		
		char ch2 = (char) ascii;
		
		System.out.println(ch2);
		
	}

}
