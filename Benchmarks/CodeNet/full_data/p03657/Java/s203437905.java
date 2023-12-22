import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] array = str.split(" ");

		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);

		if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
			System.out.println("Possible");
		} else {
			System.out.println("Impossible");
		}
	}
}
