import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Engine[] arr = new Engine[N];
		for (int i = 0; i < N; i++) {
			arr[i] = new Engine(sc.nextLong(), sc.nextLong());
		}
		Arrays.sort(arr, (e1, e2) -> {
			if (e1.theta > e2.theta) {
				return 1;
			}
			if (e1.theta < e2.theta) {
				return -1;
			}
			return 0;
		});
		long max = 0L;
		for (int start = 0; start < N; start++) {
			for (int end = start; end < start + N; end++) {
				long sum_x = 0L;
				long sum_y = 0L;
				for (int i = start; i <= end; i++) {
					sum_x += arr[i % N].x;
					sum_y += arr[i % N].y;
				}
				long tmp = sum_x * sum_x + sum_y * sum_y;
				if (max < tmp) {
					max = tmp;
				}
			}
		}
		System.out.println(Math.sqrt(max));
	}

	class Engine {
		long x;
		long y;
		double theta;
		public Engine(long x, long y) {
			this.x = x;
			this.y = y;
			this.theta = Math.atan2(y, x);
		}
	}

	class Scanner {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int index;
		private int length;

		public Scanner(InputStream in) {
			this.in = in;
		}

		private boolean isPrintableChar(int c) {
			return '!' <= c && c <= '~';
		}

		private boolean isDigit(int c) {
			return '0' <= c && c <= '9';
		}

		private boolean hasNextByte() {
			if (index < length) {
				return true;
			} else {
				try {
					length = in.read(buffer);
					index = 0;
				} catch (IOException e) {
					e.printStackTrace();
				}
				return length > 0;
			}
		}

		private boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[index])) {
				index++;
			}
			return hasNextByte();
		}

		private int readByte() {
			return hasNextByte() ? buffer[index++] : -1;
		}

		public String next() {
			if (!hasNext()) {
				throw new RuntimeException("no input");
			}
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) {
				throw new RuntimeException("no input");
			}
			long value = 0L;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (isPrintableChar(b)) {
				if (isDigit(b)) {
					value = value * 10 + (b - '0');
				}
				b = readByte();
			}
			return minus ? -value : value;
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}