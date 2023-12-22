import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String m = "";
		String ans = "YES";
		try {
			m = sc.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		m = m.replace("dream", "").replace("dreamer", "").replace("erase", "").replace("eraser", "");
		if (m.length() != 0) {
			ans = "NO";
		}

		System.out.println(ans);
	}
}
