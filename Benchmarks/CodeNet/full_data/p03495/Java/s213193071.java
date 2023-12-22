
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveC();
		new Main().solveC2();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		char[] wk;

		try {
			scanner = new Scanner(System.in);
			wk = scanner.nextLine().toCharArray();

			int res = 0;
			for (int i = 0; i < wk.length; i++) {
				if (wk[i] == '1') {
					res++;
				}
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private int divide(int[] wk) {
		boolean divide = true;
		int res = 0;
		for (int i = 0; i < wk.length && divide; i++) {
			if (wk[i] % 2 == 0 && wk[i] > 0) {
				wk[i] = wk[i] / 2;
			} else {
				divide = false;
			}
		}
		if (divide) {
			res = divide(wk) + 1;
		}
		return res;
	}

	private void solveB() {
		Scanner scanner = null;
		int n = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();

			int[] wk = new int[n];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			System.out.println(divide(wk));

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private List<Integer> getSortedKeyArray(Map<Integer, Integer> wk) {
		List<Integer> wkList = new ArrayList<Integer>();

		for (Iterator<Integer> itr = wk.values().iterator(); itr.hasNext();) {
			wkList.add(itr.next());
		}

		Collections.sort(wkList);
		return wkList;
	}

	private void solveC() {
		Scanner scanner = null;
		int n = 0;
		int k = 0;

		try {
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
			k = scanner.nextInt();

			Map<Integer, Integer> wk = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int wkKey = scanner.nextInt();
				if (!wk.containsKey(wkKey)) {
					wk.put(wkKey, 1);
				} else {
					wk.put(wkKey, wk.get(wkKey) + 1);
				}
			}

			List<Integer> wkList = getSortedKeyArray(wk);

			int res = 0;
			for (int i = 0; i < wkList.size() - k; i++) {
				res += wkList.get(i);
			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC2() {
		final Scanner scanner = new Scanner(System.in);
		int n = 0;
		int k = 0;

		try {
			n = scanner.nextInt();
			k = scanner.nextInt();

			Map<Integer, Integer> wk = IntStream.range(0, n).collect(() -> new HashMap<Integer, Integer>(), (t, i) -> {
				int wkKey = scanner.nextInt();
				if (!t.containsKey(wkKey)) {
					t.put(wkKey, 1);
				} else {
					t.put(wkKey, t.get(wkKey) + 1);
				}
			},
					(t, u) -> {
						t.putAll(u);
					});

			//			Map<Integer, Integer> wk = new HashMap<Integer, Integer>();
			//			for (int i = 0; i < n; i++) {
			//				int wkKey = scanner.nextInt();
			//				if (!wk.containsKey(wkKey)) {
			//					wk.put(wkKey, 1);
			//				} else {
			//					wk.put(wkKey, wk.get(wkKey) + 1);
			//				}
			//			}

			List<Integer> wkList = getSortedKeyArray(wk);

			int res = wkList.stream().limit(wkList.size() - k).reduce(0, (sum, i) -> sum + i);
			//			for (int i = 0; i < wkList.size() - k; i++) {
			//				res += wkList.get(i);
			//			}

			System.out.println(res);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}