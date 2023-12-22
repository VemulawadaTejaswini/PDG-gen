import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			 System.out.println(n%2 == 0 ? n/2 : (n+1)/2);
		}
	}
}