import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int[][] s = new int[h][w];
		for (int i = 0; i < h; i++) {
			String row = sc.next();
			for (int j = 0; j < w; j++) {
				s[i][j] = Integer.parseInt(row.substring(j, j + 1));
			}
		}
		sc.close();

		int result = Integer.MAX_VALUE;
		Boolean[] hc = new Boolean[h - 1];
		for (int i = 0; i < Math.pow(2, h - 1); i++) {
			for (int j = 0; j < h - 1; j++) {
				hc[j] = ((i % (int)Math.pow(2, j + 1)) / ((int)Math.pow(2, j))) != 0;
			}
			int hcount = (int) Arrays.stream(hc).filter(value -> value).count();
			int count = count(k, s, hc);
			if (count >= 0) {
				result = Math.min(result, count + hcount);
			}
		}
		System.out.print(result);
	}

	private static int count(int k, int[][] s, Boolean[] hc) {
		int count = 0;
		int[] counts = new int[s.length];
		int wstart = 0;
		for (int i = 0; i < s[0].length; i++) {
			int[] tcounts = new int[s.length];
			int index = 0;
			for (int j = 0; j < s.length; j++) {
				if (s[j][i] == 1) {
					counts[index]++;
					tcounts[index]++;
				}
				if (j < s.length - 1 && hc[j]) {
					index++;
				}
			}
			if (Arrays.stream(counts).anyMatch(c -> c > k)) {
				if (wstart - i == 1) {
					return -1;
				}
				count++;
				wstart = i;
				counts = tcounts;
			}
		}

		return count;
	}
}