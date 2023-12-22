import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			String chr[] = in.split("");
			String inp = br.readLine();
			String chrp[] = inp.split("");
			int ans = 0;
			for (int i = 0; i < 3; i++) {
				if (chr[i].equals(chrp[i])) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}