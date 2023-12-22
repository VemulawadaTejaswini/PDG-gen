import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int k = Integer.parseInt(sa[0]);
		int x = Integer.parseInt(sa[1]);
		br.close();

		if (500 * k >= x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
