import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	static class Task {
		static final long MOD = (long) 1e9 + 7;

		public void solve() {
			Scan sc = new Scan();
			int n = (int) sc.scanLong();
			long k = sc.scanLong();
			BIT bit = new BIT(2000);
			int[] arr = new int[2001];
			long indivCount = 0;
			for (int i = 0; i < n; ++i) {
				int curr = (int) sc.scanLong();
				indivCount += i - bit.query(curr);
				bit.update(curr, 1);
				arr[curr]++;
			}
			indivCount = modMul(indivCount, k);
			int prev = 0;
			for (int i = 0; i < 2001; ++i) {
				if (arr[i] > 0) {
					indivCount += modMul(arr[i], modMul(prev, (k * (k - 1)) / 2));
					arr[i] += prev;
					prev = arr[i];
					indivCount %= MOD;
				}
			}
			System.out.println(indivCount);
		}

		private long modMul(long a, long b) {
			b %= MOD;
			return (a * b) % MOD;
		}

	}

	static class BIT {
		int[] fwk;
		int n;

		public BIT(int n) {
			this.n = n;
			this.fwk = new int[n + 1];
		}

		void update(int at, int by) {
			for (int i = at; i <= n; i += (i & -i)) {
				fwk[i] += by;
			}
		}

		int query(int at) {
			int res = 0;
			for (int i = at; i > 0; i -= (i & -i)) {
				res += fwk[i];
			}
			return res;
		}
	}

	static class Scan {
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

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
