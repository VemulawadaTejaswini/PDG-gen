
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		StringBuilder wk1 = new StringBuilder(next());
		StringBuilder wk2 = new StringBuilder(next());

		if (wk1.toString().equals(wk2.reverse().toString())) {
			out.println("YES");
		} else {
			out.println("NO");
		}

	}

	private void solveB() {
		int numN = nextInt();

		int wk = (int) Math.sqrt(numN);

		out.println((int) Math.pow(wk, 2));
	}

	private void solveC() {
		int numN = nextInt();
		Long[] aA = IntStream.range(0, numN).mapToObj(i -> new Long(nextLong())).toArray(Long[]::new);
		Long[] bA = IntStream.range(0, numN).mapToObj(i -> new Long(nextLong())).toArray(Long[]::new);
		Long[] cA = IntStream.range(0, numN).mapToObj(i -> new Long(nextLong())).toArray(Long[]::new);

		Arrays.sort(aA, (x, y) -> Long.compare(x, y));
		Arrays.sort(bA, (x, y) -> Long.compare(x, y));
		Arrays.sort(cA, (x, y) -> Long.compare(x, y));

		long res = 0;
		for (int i = 0; i < aA.length; i++) {
			long aP = aA[i];

			//			int bS = ~Arrays.binarySearch(bA, aP, new LowerBoundComparator<Long>());
			int bS = getTargetIndex(bA, aP);
			if (bS < 0) {
				continue;
			}
			for (int j = bS; j < bA.length; j++) {
				long bP = bA[j];
				if (aP >= bP) {
					continue;
				}
				//				int cS = ~Arrays.binarySearch(cA, bP, new LowerBoundComparator<Long>());
				int cS = getTargetIndex(cA, bP);
				if (cS < 0) {
					continue;
				}
				if (bP >= cA[cS]) {
					cS++;
				}
				res += (cA.length - cS);
				//				System.out.printf("ap: %3d bP:%3d c: %3d ", aP, bP, (cA.length - cS));
				//				System.out.println("");
				//				for (int k = cS; k < cA.length; k++) {
				//					long cP = cA[k];
				//					if (bP >= cP) {
				//						break;
				//					}
				//					res++;
				//				}
			}
		}

		out.println(res);
	}

	private int getTargetIndex(Long[] wkArray, long num) {
		int wkIndex = -1;

		Arrays.sort(wkArray);

		int start = 0;
		int end = wkArray.length - 1;
		boolean res = true;
		int previousIndex = -1;
		int currentIndex = (start + end) / 2;
		while (res) {

			currentIndex = (start + end) / 2;
			//前回と同じ場合は探索終了
			if (previousIndex == currentIndex) {
				wkIndex = currentIndex;
				break;
			} else {
				//前回と違う場合はindex入れ替え
				previousIndex = currentIndex;
				//前回と違う場合は探索継続
				if (wkArray[currentIndex] == num) {
					wkIndex = currentIndex;
					res = false;
				} else if (wkArray[currentIndex] > num) {
					end = currentIndex;
				} else if (wkArray[currentIndex] < num) {
					start = currentIndex + 1;
				}
			}

		}
		return wkIndex;
	}

	private class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {

		@Override
		public int compare(T o1, T o2) {
			return (o1.compareTo(o2) >= 0) ? 1 : -1;
		}

	}

	private void solveC2() {
		int numN = nextInt();
		Long[] aA = IntStream.range(0, numN).mapToObj(i -> new Long(nextLong())).toArray(Long[]::new);
		Long[] bA = IntStream.range(0, numN).mapToObj(i -> new Long(nextLong())).toArray(Long[]::new);
		Long[] cA = IntStream.range(0, numN).mapToObj(i -> new Long(nextLong())).toArray(Long[]::new);

		Arrays.sort(aA, (x, y) -> Long.compare(x, y) * -1);
		Arrays.sort(bA, (x, y) -> Long.compare(x, y) * -1);
		Arrays.sort(cA, (x, y) -> Long.compare(x, y) * -1);

		long res = 0;
		for (int i = 0; i < aA.length; i++) {
			long aP = aA[i];
			for (int j = 0; j < bA.length; j++) {
				long bP = bA[j];
				if (aP >= bP) {
					break;
				}
				for (int k = 0; k < cA.length; k++) {
					long cP = cA[k];
					if (bP >= cP) {
						break;
					}
					res++;
				}
			}
		}

		out.println(res);
	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}