
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String[] array = s.split(" ");
		int a = Integer.parseInt(array[0]);
		String op = array[1];
		int b = Integer.parseInt(array[2]);

		if (op.equals("+")) {
			System.out.println(a + b);
		} else {
			System.out.println(a - b);
		}
	}
}
