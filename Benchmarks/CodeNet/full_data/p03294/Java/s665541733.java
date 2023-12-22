import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] aline = br.readLine().split(" ");

		long ans = 0;

		for (int i = 0; i < n; i++) {
			ans += Long.parseLong(aline[i]) - 1;
		}

		System.out.println(ans);

	}

}
