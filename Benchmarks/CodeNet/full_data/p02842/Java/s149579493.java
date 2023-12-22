import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int N = Integer.parseInt(str);
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if ((int)Math.floor(i * 1.08) == N) {
				ans = i;
				break;
			}
		}
		if (ans > 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(":(");
		}
	}
}
