import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	int[] A;
	int[] keta;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		A = new int[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}

		keta = new int[20];
		for (int i = 0; i < N; ++i) {
			int index = Integer.toString(A[i], 2).length();
			keta[i] = index;
		}
	}

	int calcR(int l) {
		int result = N - 1;
		for (int r = l + 1; r < N; ++r) {
			if (keta[r] <= keta[r - 1]) {
				result = r - 1;
				break;
			}
		}
		return result;
	}

	int calcL(int r) {
		int result = 0;
		for (int l = r - 1; l >= 0; --l) {
			if (keta[l] <= keta[l + 1]) {
				result = l + 1;
				break;
			}
		}
		return result;
	}

	void calc() {
		long count = 0L;
		for (int l = 0; l < N; ++l) {
			int r = calcR(l);
			// System.out.println(l + " " + r);
			count += (long) (r - l + 1);
		}
//		for (int r = N - 1; r >= 0; --r) {
//			int l = calcL(r);
//			System.out.println(l + " " + r);
//			count += (long) (r - l + 1);
//		}
		System.out.println(count);
	}

	void showResult() {
	}
}