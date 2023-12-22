import java.util.*;

public class Main {
	int N, M;
	String S, T;
	long result = -1L;

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
		long saishouKoubai = saishouKoubai(N, M);
		if (N == M) {
			// 同じ長さ -> すべての要素が同じ
			result = N;
			for (int i = 0; i < N; ++i) {
				if (S.charAt(i) != T.charAt(i)) {
					result = -1;
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
			// System.out.println(S + ", " + T);
			for (int i = 0; i < saidaiKouyaku; ++i) {
				// System.out.println(sIndex + ", " + tIndex);
				if (S.charAt(sIndex) != T.charAt(tIndex)) {
					result = -1;
					break;
				}
				sIndex += sStep;
				tIndex += tStep;
			}
		}
		return;

	}

	private void show() {
		System.out.println(result);
	}

	private long saishouKoubai(int large, int little) {
		if (large < little) {
			return saishouKoubai(little, large);
		}
		int saidaiKouyaku = gcd(large, little);
		long result = (long)(little / saidaiKouyaku);
		result *= (long)large;
		return result;
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