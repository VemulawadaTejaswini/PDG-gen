import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static String str;

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		str = f.readLine();
		int res = 700;
		for (int i = 0; i < 3; i++) {
			if (str.charAt(i) == 'o') {
				res += 100;
			}
		}
		System.out.println(res);
	}
}