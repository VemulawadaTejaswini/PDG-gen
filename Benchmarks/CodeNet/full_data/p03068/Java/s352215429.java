import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Byte N = Byte.valueOf(in.readLine());
		StringBuilder S = new StringBuilder(in.readLine());
		Byte K = Byte.valueOf(in.readLine());
		
		
		char to = S.charAt(K);
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) != to) {
				S.deleteCharAt(i);
				S.insert(i, '*');
			}
		}
		System.out.println(S.toString());
	}
}