import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String S = br.readLine();

			System.out.println(S.lastIndexOf("Z") - S.indexOf("A") + 1);
		}
	}
}