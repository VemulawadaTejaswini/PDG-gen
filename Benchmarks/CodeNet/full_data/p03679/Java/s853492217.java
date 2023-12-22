import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");

		int x = Integer.parseInt(array[0]);
		int a = Integer.parseInt(array[1]);
		int b = Integer.parseInt(array[2]);

		if (a - b >= 0) {
			System.out.println("delicious");
		} else if ((a + x) - b >= 0) {
			System.out.println("safe");
		} else {
			System.out.println("dangerous");
		}
	}
}
