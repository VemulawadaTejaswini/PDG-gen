import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main instance = new Main();
		Scanner in = new Scanner(System.in);
		long k = Long.parseLong(in.nextLine());
		char[] v = new char[1];
		v[0] = '1';
		for (long i = 0; i < k; ++i) {
			System.out.println(String.valueOf(v));
			v = instance.getNext(v);
		}

		in.close();
	}

	private char[] getNext(char[] chars) {
		char[] result = null;
		for (int i = chars.length - 1; i >= 0; --i) {
			char c = chars[i];
			if (c != '9') {
				// その桁に1たしたもの
				result = Arrays.copyOf(chars, chars.length);
				result[i]++;
				break;
			}
		}
		if (result != null) {
			return result;
		}

		// 桁を足す
		if (chars.length == 1) {
			result = new char[2];
			result[0] = '1';
			result[1] = '9';
			return result;
		}else if(chars.length == 2) {
			result = new char[3];
			result[0] = '1';
			result[1] = '9';
			result[2] = '9';
			return result;
		}
		char[] base = Arrays.copyOf(chars, chars.length);
		long value = Long.parseLong(String.valueOf(base));
		value++;
		char[] sub = Arrays.copyOfRange(chars, 1, chars.length);
		value += Long.parseLong(String.valueOf(sub));

		return Long.toString(value).toCharArray();

	}

	private List<Long> calcResult() {
		List<Long> result = new ArrayList<>();
		double minValue = Double.MAX_VALUE;
		for (long i = 20000L; i > 0; --i) {
			long s = calcS(i);
			double v = (double) i / (double) s;
			if (minValue >= v) {
				result.add(i);
				minValue = v;
				System.out.println(i);
			}
		}
		return result;
	}

	/**
	 * 調査用の関数．実行の結果， 999999999999999999, 162, 18 が得られた
	 */
	private void calcMax() {
		long value = 9;
		while (true) {
			long strValue = calcS(value);
			double v = (double) value / (double) strValue;
			if (v > 1000000000000000L) {
				System.out.println(value + ", " + strValue + ", " + Long.toString(value).length());
				break;
			}
			value *= 10;
			value += 9L;
		}
	}

	private void exec() {
		for (long i = 1; i < 20; ++i) {
			long s = calcS(i);
			double value = (double) i / (double) s;
			System.out.println(value);
		}
	}

	private long calcS(long value) {
		String str = Long.toString(value);
		long result = 0;
		for (int i = 0; i < str.length(); ++i) {
			Character c = str.charAt(i);
			result += Long.parseLong(c.toString());
		}
		return result;
	}

}