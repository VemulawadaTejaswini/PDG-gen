import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] receive = br.readLine().split(" ");
		Integer n = Integer.valueOf(receive[0]);
		Integer y = Integer.valueOf(receive[1]);
		int res10000 = -1, res5000 = -1, res1000 = -1, total, c;
		for (int a = 0; a <= n; a++) {
			for (int b = 0; b <= n; b++) {
				c = n - a - b;
				total = 10000 * a + 5000 * b + 1000 * c;
				if (total == y) {
					res10000 = a;
					res5000 = b;
					res1000 = c;
					break;
				}
			}
		}
		System.out.println(res10000 + " " + res5000 + " " + res1000);
	}
}