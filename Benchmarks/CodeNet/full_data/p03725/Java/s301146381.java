import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) {
		InputReader reader = new InputReader(System.in);
		int H = reader.nextInt();
		int W = reader.nextInt();
		int K = reader.nextInt();
		int[][] A = new int[H + 2][W + 2];

		int si = 0;
		int sj = 0;

		for (int i = 1; i <= H; i++) {
			String istr = reader.next();
			for (int j = 1; j <= W; j++) {
				char Abuf = istr.charAt(j - 1);
				if(Abuf == '#'){
					A[i][j] = -200;	//closed
				}else if(Abuf == '.'){
					A[i][j] = -100;	//opened
				}else if (Abuf == 'S') {
					A[i][j] = 0;
					si = i;
					sj = j;
				}
			}
		}

		int minDistanceToEnd = computeDistanceToEnd(si, sj, H, W);
		// mark initial move position
		for (int k_iterator = 1; k_iterator <= K; k_iterator++) {
			for (int i = 1; i <= H; i++) {
				for (int j = 1; j <= W; j++) {
					if (A[i][j] == -100) { // open?
						if (A[i - 1][j] == k_iterator - 1 || A[i + 1][j] == k_iterator - 1
								|| A[i][j - 1] == k_iterator - 1 || A[i][j + 1] == k_iterator - 1) {
							A[i][j] = (char) k_iterator;
							minDistanceToEnd = Math.min(minDistanceToEnd, computeDistanceToEnd(i, j, H, W));
						}
					}
				}
			}
		}

		int minMagicCount = (minDistanceToEnd + K - 1) / K + 1;
		System.out.println(minMagicCount);

	}

	public static int computeDistanceToEnd(int i, int j, int H, int W) {
		int res = Math.min(i - 1, H - i);
		res = Math.min(res, Math.min(j - 1, W - j));

		return (res);
	}

}

class InputReader {
	public BufferedReader reader;
	public StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream), 32768);
		tokenizer = null;
	}

	public String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}
}