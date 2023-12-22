import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

//		String strA = Long.toBinaryString(a);
		String strB = Long.toBinaryString(b);

		long d = b - a + 1;
		long base = 1;
		boolean[] odd = new boolean[40];
		for (int i = 0; i < strB.length(); i++) {
			base *= 2;
			if (d == base) {
				break;
			} else if (d < base) {
				long mod = d % base;
				boolean oddFlg = false;
				for (long j = b - mod + 1; j <= b; j++) {
					String str = Long.toBinaryString(j);
					str = pad0(str, strB.length());
					char ch = str.charAt(str.length() - i - 1);
					if (ch == '1') {
						oddFlg = !oddFlg;
					}
				}
				odd[i] = oddFlg;
			} else {
				boolean oddFlg = false;
				for (long j = a; j <= b; j++) {
					String str = Long.toBinaryString(j);
					str = pad0(str, strB.length());
					char ch = str.charAt(str.length() - i - 1);
					if (ch == '1') {
						oddFlg = !oddFlg;
					}
				}
				odd[i] = oddFlg;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = strB.length(); i >= 0; i--) {
			if (odd[i]) {
				sb.append("1");
			} else {
				sb.append("0");
			}
		}
		System.out.println(Long.parseLong(sb.toString(), 2));
	}

	private static String pad0(String str, int len) {
		StringBuilder sb = new StringBuilder(str);
		while (sb.length() < len) {
			sb.insert(0, "0");
		}
		return sb.toString();
	}
}
