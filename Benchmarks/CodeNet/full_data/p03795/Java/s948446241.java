import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int n = Integer.parseInt(s);

		int x = n * 800;
		int y = (n / 15) * 200;

		System.out.println(x - y);

	}
}
