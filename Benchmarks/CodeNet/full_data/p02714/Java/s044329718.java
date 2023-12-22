import java.util.Scanner;

public class Main {
	private static int[][] rgb;

	public static void main(String[] args) {
		int count = 0;

		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		String S = in.next();
		in.close();

		rgb = new int[3][2 * N + 1];

		int cntb = 0;
		int cntg = 0;
		int cntr = 0;
		for (int i = N - 1; i >= 0; i--) {
			String str = String.valueOf(S.charAt(i));
			if (str.equals("B")) {
				cntb++;
			} else if (str.equals("G")) {
				cntg++;
			} else {
				cntr++;
			}
			rgb[0][i] = cntb;
			rgb[1][i] = cntg;
			rgb[2][i] = cntr;
		}

		String str1, str2;

		for (int i = 0; i < S.length() - 2; i++) {
			str1 = String.valueOf(S.charAt(i));
			for (int j = i + 1; j < S.length() - 1; j++) {
				str2 = String.valueOf(S.charAt(j));
				//				System.out.println("i:"+i+", j:"+j);
				if (str1.equals(str2)) {
					continue;
				}
				count += calc(i, j, str1, str2);
			}
		}
		System.out.println(count);
	}

	public static int calc(int i, int j, String str1, String str2) {
		int calc = 0;
		int idx = j - i;
		if (str1.equals("B")) {
			if (str2.equals("G")) {
				calc = rgb[2][j + 1] - (rgb[2][j + idx] - rgb[2][j + idx + 1]);
			} else {
				calc = rgb[1][j + 1] - (rgb[1][j + idx] - rgb[1][j + idx + 1]);
			}
		} else if (str1.equals("G")) {
			if (str2.equals("B")) {
				calc = rgb[2][j + 1] - (rgb[2][j + idx] - rgb[2][j + idx + 1]);
			} else {
				calc = rgb[0][j + 1] - (rgb[0][j + idx] - rgb[0][j + idx + 1]);
			}
		} else {// str1 == R
			if (str2.equals("B")) {
				calc = rgb[1][j + 1] - (rgb[1][j + idx] - rgb[1][j + idx + 1]);
			} else {
				calc = rgb[0][j + 1] - (rgb[0][j + idx] - rgb[0][j + idx + 1]);
			}
		}
		return calc;
	}
}
