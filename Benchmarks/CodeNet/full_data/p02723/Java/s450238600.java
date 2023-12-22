import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int LEN = 6;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String str = null;
		String rst = null;
		if (s != null) {
			if (s.length() == LEN) {
				str = s.substring(2);
				rst = s.substring(2);
				System.out.println(str.equals(rst) ? "Yes" : "No");
			}
		}
	}
}
