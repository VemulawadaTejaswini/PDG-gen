import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();

		int a = Integer.parseInt(s.substring(0, 2));
		int b = Integer.parseInt(s.substring(2, 4));
		if (a == 0 || a > 12) {
			if (b == 0 || b > 12) {
				System.out.println("NA");
			} else {
				System.out.println("YYMM");
			}
		} else {
			if (b == 0 || b > 12) {
				System.out.println("MMYY");
			} else {
				System.out.println("AMBIGUOUS");
			}
		}
	}
}
