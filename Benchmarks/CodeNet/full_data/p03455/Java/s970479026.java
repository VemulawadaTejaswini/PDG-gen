import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] cut = x.split(" ");
		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[1]);

		System.out.println((a * b) % 2 == 0 ? "Even" : "Odd");
	}
}