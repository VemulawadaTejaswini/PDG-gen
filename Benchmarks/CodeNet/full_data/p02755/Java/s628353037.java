import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		try (Stream<String> lines = new BufferedReader(new InputStreamReader(System.in)).lines()) {
			new Main().exec(lines.toArray(String[]::new));
		}
	}

	void exec(String[] args) {
		String[] a = args[0].split(" ");
		int A = Integer.parseInt(a[0]);
		int B = Integer.parseInt(a[1]);
		int AL = (int)(12.5 * A + 0.5);
		int AH = (int)(12.5 * A + 12);
		int BL = 10 * B;
		int BH = 10 * B + 9;
		System.out.println(BL <= AL && AL <= BH ? AL : AL <= BL && BL <= AH ? BL : -1);
	}

}