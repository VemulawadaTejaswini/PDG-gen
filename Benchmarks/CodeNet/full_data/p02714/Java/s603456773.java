import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			final char[] S = scn.next().toCharArray();

			long sum = 0;
			for (int r = 0; r < N; r++) {
				if (S[r] != 'R')
					continue;
				for (int g = 0; g < N; g++) {
					if (S[g] != 'G')
						continue;
					for (int b = 0; b < N; b++) {
						if (S[b] != 'B')
							continue;
						int i = Math.min(Math.min(r, g), b);
						int k = Math.max(Math.max(r, g), b);
						int j = (r + g + b) - i - k;
						if (j - i != k - j)
							sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}
}
