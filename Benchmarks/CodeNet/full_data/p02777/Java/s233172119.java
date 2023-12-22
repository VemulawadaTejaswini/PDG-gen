import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		String str1 = str[0];
		String str2 = str[1];

		str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		String s = br.readLine();

		if (s.equals(str1)) {
			a--;
		} else {
			b--;
		}
		System.out.println(a + " " + b);
	}
}
