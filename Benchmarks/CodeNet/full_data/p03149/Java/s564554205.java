import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] n = br.readLine().split(" ");
		br.close();

		String a ="1974";
		for (int i = 0; i < 4; i++) {
			a = a.replaceAll(n[i], "");
		}

		if (a.length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
