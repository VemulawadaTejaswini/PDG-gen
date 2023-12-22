import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		boolean flag = false;
		outer:
		for (int A = 1; A <= 9; A++) {
			for (int B = 1; B <= 9; B++) {
				if (N == A * B) {
					System.out.println("Yes");
					flag = true;
					break outer;
				}
			}
		}
		if (!flag) {
			System.out.println("No");
		}
	}
}