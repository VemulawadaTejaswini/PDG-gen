import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 標準入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int i = 1;
		int ans = 1;

		while (true) {
			if (x < Math.pow(i, 2)) {
				break;
			}
			ans = (int) Math.pow(i, 2);
			i++;
		}

		System.out.println(ans);

	}

}
