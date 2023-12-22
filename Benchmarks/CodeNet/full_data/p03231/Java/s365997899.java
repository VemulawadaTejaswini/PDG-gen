import java.util.*;

public class Main {
	int N, M;
	String S, T;
	int result = -1;

	private Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		if (N < M) {
			int temp = N;
			N = M;
			M = temp;
			T = in.nextLine();
			S = in.nextLine();
		} else {
			S = in.nextLine();
			T = in.nextLine();
		}
		in.close();
	}

	private void calc() {
		int saishouKoubai = saishouKoubai(N, M);
		if (N == M) {
			// 同じ長さ -> すべての要素が同じ
			if (S.equals(T)) {
				result = N;
			} else {
				result = -1;
			}
		} else if (saishouKoubai == N) {
			result = N;
			int step = N / M;
			for (int j = 0; j < step; ++j) {
				for (int i = 0; i < M; ++i) {
					if (S.charAt(i + j * M) != T.charAt(i)) {
						result = -1;
						break;
					}
				}
				if (result < 0) {
					break;
				}
			}
		} else {
			int saidaiKouyaku = gcd(N, M);
			int sStep = N / saidaiKouyaku;
			int tStep = M / saidaiKouyaku;
			int sIndex = 0;
			int tIndex = 0;
			result = saishouKoubai;
			for (int i = 0; i < saidaiKouyaku; ++i) {
				if (S.charAt(sIndex) != T.charAt(tIndex)) {
					result = -1;
					break;
				}
				sIndex += sStep;
				tIndex += tStep;
				sIndex = sIndex % N;
				tIndex = tIndex % M;
			}
		}
		return;

	}

	private void show() {
		System.out.println(result);
	}

	private int saishouKoubai(int large, int little) {
		if (large < little) {
			return saishouKoubai(little, large);
		}
		int saidaiKouyaku = gcd(large, little);
		return large / saidaiKouyaku * little;
	}

	private int gcd(int large, int little) {
		if (large < little) {
			return gcd(little, large);
		}
		if (large % little == 0) {
			return little;
		}
		return gcd(little, large % little);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();

	}

}
