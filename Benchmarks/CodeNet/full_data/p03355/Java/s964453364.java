import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;
		static String[] subStrings;
		static HashSet<String> strs;
		static int k, sz;

		private void insert(String str) {
			if (strs.contains(str))
				return;
			if (sz < k) {
				subStrings[sz++] = str;
				strs.add(str);
			} else if (str.compareTo(subStrings[k - 1]) > -1) {
				return;
			} else {
				strs.remove(str);
				subStrings[k - 1] = str;
			}
			int index = sz - 2;
			while (index >= 0) {
				String left = subStrings[index];
				String right = subStrings[index + 1];
				if (left.compareTo(right) > 0) {
					subStrings[index] = right;
					subStrings[index + 1] = left;
				} else
					break;
				--index;
			}
		}

		public void solve() {
			Scan sc = new Scan();
			char[] carr = sc.scanString().toCharArray();
			int len = carr.length;
			k = (int) sc.scanLong();
			subStrings = new String[k];
			List<Integer>[] starts = new ArrayList[26];
			strs = new HashSet<String>();
			for (int i = 0; i < len; ++i) {
				int index = carr[i] - 'a';
				if (starts[index] == null)
					starts[index] = new ArrayList<Integer>();
				starts[index].add(i);
			}
			for (int i = 0; i < 26; ++i) {
				if (starts[i] == null)
					continue;
				char start = (char) (i + 'a');
				if (k == 1) {
					System.out.println(start);
					return;
				}
				insert(String.valueOf(start));
				for (int j = 0, end = starts[i].size(); j < end; ++j) {
					int index = starts[i].get(j);
					for (int _j = index + 1; _j < len; ++_j) {
						insert(new String(carr, index, _j - index + 1));
					}
				}
				if (sz == k) {
					break;
				}
			}
			System.out.println(subStrings[k - 1]);
		}
	}

	public static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
