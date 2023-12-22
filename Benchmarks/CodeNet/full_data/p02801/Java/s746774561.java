import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			char[] ans = in.toCharArray();
			char a = (char) ((char)ans[0]+1);
			System.out.println(a);

		}
	}
}