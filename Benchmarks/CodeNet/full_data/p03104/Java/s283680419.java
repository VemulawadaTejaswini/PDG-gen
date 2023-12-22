import java.util.*;

public class Main {
	long A, B;
	int keta = 0;
	long[] aCount, bCount;

	Main() {
		Scanner in = new Scanner(System.in);
		A = in.nextLong();
		B = in.nextLong();
		in.close();
		keta = Math.max(Long.toBinaryString(A).length(), Long.toBinaryString(B).length());

	}

	long[] oneCount(long val) {
		long[] result = new long[keta];
		Arrays.fill(result, 0L);
		long v = val + 1;
		long div = 2;
		long base = 1;
		for (int i = 0; i < keta; ++i) {
			long shou = Math.floorDiv(v, div);
			long mod = v % div;
			result[i] += shou * base;
			if (mod == 0) {
				// result[i] = 0;
			} else if (Math.floorDiv(div, 2) >= mod) {
				// result[i] = 0;
			} else {
				result[i] = div - mod;
			}
			div *= 2;
			base *= 2;
		}
		return result;
	}

	void calc() {
		aCount = oneCount(A - 1);
		bCount = oneCount(B);
		long result = 0;
		long base = 1;
		for (int i = 0; i < aCount.length; ++i) {
			// System.out.println(aCount[i] + ", " + bCount[i]);
			if ((aCount[i] + bCount[i]) % 2 == 1) {
				result += base;
			}
			base *= 2;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
	}

}