import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split("");
		int[] s = new int[str.length];
		for (int i = 0; i < s.length; i++) {
			s[i] = Integer.parseInt(str[i]);
		}
		int a = s[0] * 10 + s[1];
		int b = s[2] * 10 + s[3];
		if (1 <= a && a <= 12) {
			if (1 <= b && b <= 12) {
				System.out.println("AMBIGUOUS");
			}
			else if (0 <= b && b <= 99) {
				System.out.println("MMYY");
			}
		}
		else if (0 <= a && a <= 99) {
			if (1 <= b && b <= 12) {
				System.out.println("YYMM");
			}
			else {
				System.out.println("NA");
			}
		}
		
//		String[] str = reader.readLine().split(" ");
//		int[] ab = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			ab[i] = Integer.parseInt(str[i]);
//		}
	}
}