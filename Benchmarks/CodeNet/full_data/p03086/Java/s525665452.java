import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		char[] lineC = convert(line).toCharArray();
		int ans = 0;
		for (int i = 0; i < lineC.length; i++) {
			int count = 0;
			if (lineC[i] == '+') {
				count++;
				ans = count;
			} else {
				count = 0;
			}
		}
		System.out.println(ans);

	}

	public static String convert(String str) {
		char[] atgc = { 'A', 'T', 'G', 'C' };
		for (byte i = 0; i < 4; i++) {
			str = str.replace(atgc[i], '+');
		}
		return str;
	}
}