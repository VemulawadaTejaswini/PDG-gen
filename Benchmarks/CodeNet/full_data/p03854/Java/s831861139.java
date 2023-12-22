import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String m = "";
		try {
			m = sc.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
      sc.close();
		String ans = "YES";
		int no = 0;
		
		while (m.length() > no && m.length() > 4) {
			if (m.substring(no).startsWith("dream")) {
				no += 5;
				if (!m.substring(no).startsWith("era") && m.substring(no).startsWith("er")) {
					no += 2;
				}
			} else if (m.substring(no).startsWith("erase")) {
				no += 5;
				if (m.substring(no).startsWith("r")) {
					no += 1;
				}
			} else {
				break;
			}
		}

		if (m.length() != no) {
			ans = "NO";
		}
		System.out.println(ans);
	}
}
