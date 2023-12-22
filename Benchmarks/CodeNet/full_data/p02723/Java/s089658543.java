import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();

		if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
