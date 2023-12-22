import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	char[] S;
	int[][] counts;
	long result = 0L;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		S = in.readLine().toCharArray();
		counts = new int[N][3];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(counts[i], 0);
		}
		int countR = 0, countG = 0, countB = 0;
		for (int i = N - 1; i >= 1; --i) {
			switch (S[i]) {
			default:
			case 'R':
				++countR;
				break;
			case 'G':
				++countG;
				break;
			case 'B':
				++countB;
				break;
			}
			counts[i - 1][0] = countR;
			counts[i - 1][1] = countG;
			counts[i - 1][2] = countB;
		}
	}

	void calc() {
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				if ((S[i] == 'R' && S[j] == 'G') || (S[i] == 'G' && S[j] == 'R')) {
					// ラストがB; R-G or G-R
					result += counts[j][2];
				} else if ((S[i] == 'G' && S[j] == 'B') || (S[i] == 'B' && S[j] == 'G')) {
					// ラストがR: G-B or B-G
					result += counts[j][0];
				} else if ((S[i] == 'R' && S[j] == 'B') || (S[i] == 'B' && S[j] == 'R')) {
					// ラストがG: R-B or B-R
					result += counts[j][1];
				}
			}
		}
		for (int step = 1; step <= N / 2 + 1; ++step) {
			for (int i = 0; i < N; ++i) {
				int j = i + step;
				int k = j + step;
				if (j >= N || k >= N) {
					break;
				}
				if (S[i] != S[j] && S[j] != S[k] && S[k] != S[i]) {
					result--;
				}
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}