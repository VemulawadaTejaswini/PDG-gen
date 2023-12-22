import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split("");
		int N = str.length;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (str[i].equals("x")) {
				count++;
			}
		}
		if (count <= 7) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}