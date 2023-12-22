

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (PrintWriter out = new PrintWriter(System.out); Scanner sc = new Scanner(System.in);) {
			Task task = new Task();
			task.solve(sc, out);
			out.flush();

		} catch (Exception e) {

		}

	}

	static class Task {
		public void solve(Scanner sc, PrintWriter out) {
			int n = nint(sc);

			if (n <= 3) {
				out.print("No");
				return;
			}

			List<Integer> list4 = new ArrayList<>();
			for (int i = 4; i <= 100; i += 4) {
				list4.add(i);
			}
			List<Integer> list7 = new ArrayList<>();
			for (int i = 7; i <= 100; i += 7) {
				list7.add(i);
			}

			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < list4.size(); i++) {
				for (int j = 0; j < list7.size(); j++) {
					int ii = list4.get(i);
					int jj = list7.get(j);
					list.add(ii + jj);
				}
			}
			

			if (n % 4 == 0 || n % 7 == 0 || list.contains(Integer.valueOf(n))) {
				out.print("Yes");
				return;
			}
			out.print("No");
		}
	}

	// method
	static int nint(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static long nlong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static double ndouble(Scanner sc) {
		return Double.parseDouble(sc.next());
	}

	static float nfloat(Scanner sc) {
		return Float.parseFloat(sc.next());
	}

	static String nstr(Scanner sc) {
		return String.valueOf(sc.next());
	}

	static long[] longLine(Scanner sc, int size) {
		long[] lLine = new long[size];
		for (int i = 0; i < size; i++) {
			lLine[i] = nlong(sc);
		}
		return lLine;
	}

	static int[] intLine(Scanner sc, int size) {
		int[] iLine = new int[size];
		for (int i = 0; i < size; i++) {
			iLine[i] = nint(sc);
		}
		return iLine;
	}

	static String[] strLine(Scanner sc, int size) {
		String[] strLine = new String[size];
		for (int i = 0; i < size; i++) {
			strLine[i] = nstr(sc);
		}
		return strLine;
	}

	static long maxFromList(List<Long> longList) {
		return longList.stream().max(Comparator.naturalOrder()).get();
	}

	static long minFromList(List<Long> longList) {
		return longList.stream().min(Comparator.naturalOrder()).get();
	}

	public static int sumDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static long sumDigits(long n) {
		long sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	static List<Integer> getIntegerList(Scanner sc, int size) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(nint(sc));
		}
		return list;
	}

	static List<Long> getLongList(Scanner sc, int size) {
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(nlong(sc));
		}
		return list;
	}
}