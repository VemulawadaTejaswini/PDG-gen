import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.print(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5) ? "Yes" : "N0");
	}

}