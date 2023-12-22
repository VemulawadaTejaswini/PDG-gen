import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;

		public void solve() {
			Scan sc = new Scan();
			int N = (int) sc.scanLong();
			int K = (int) sc.scanLong();

			Pair[] arrX = new Pair[N];

			for (int i = 0; i < N; i++) {
				long x = sc.scanLong();
				long y = sc.scanLong();
				arrX[i] = new Pair(x, y);
			}

			Pair[] arrY = arrX.clone();
			Arrays.sort(arrX, new Comparator<Pair>() {
				public int compare(Pair a, Pair b) {
					return Long.compare(a.from, b.from);
				}
			});

			Arrays.sort(arrY, new Comparator<Pair>() {
				public int compare(Pair a, Pair b) {
					return Long.compare(a.to, b.to);
				}
			});

			long area = area(arrX[0].from, arrY[0].to, arrX[arrX.length - 1].from, arrY[arrY.length - 1].to);
			for (int i = 0, j = 0, k = arrX.length - 1, l = arrY.length - 1; i < k && j < l;) {
				boolean flag = true;

				int cLeft = count(arrY, arrX[i].from, j, l, 'y');
				int cRight = count(arrY, arrX[k].from, j, l, 'y');
				int cTop = count(arrX, arrY[j].to, i, k, 'x');
				int cBottom = count(arrX, arrY[l].to, i, k, 'x');
				
				if(cLeft == 0)
					i++;
				if(cRight == 0)
					k--;
				if(cTop == 0)
					l--;
				if(cBottom == 0)
					j++;
				
				cLeft = count(arrY, arrX[i].from, j, l, 'y');
				cRight = count(arrY, arrX[k].from, j, l, 'y');
				cTop = count(arrX, arrY[j].to, i, k, 'x');
				cBottom = count(arrX, arrY[l].to, i, k, 'x');

				int direction = -1;
				if (N - cLeft >= K) 
					direction = 0;
				if (N - cRight >= K) 
					direction = 1;
				if (N - cTop >= K) 
					direction = 2;
				if (N - cBottom >= K) 
					direction = 3;
				
				switch (direction) {
				case 0:
					i++;
					N = N - cLeft;
					break;
				case 1:
					k--;
					N = N - cRight;
					break;
				case 2:
					l--;
					N = N - cTop;
					break;
				case 3:
					j++;
					N = N - cBottom;
					break;
				default:
					flag = false;
				}
				if (!flag) {
					area = area(arrX[i].from, arrY[j].to, arrX[k].from, arrY[l].to);
					break;
				}
			}
			System.out.println(area);
		}

		public int count(Pair[] arr, long val, int index, int end, char ch) {
			int count = 0;
			for (int i = index; i <= end; i++) {
				if (ch == 'y') {
					if (arr[i].from == val && arr[i].to <= arr[end].to && arr[i].to >= arr[index].to)
						count++;
				} else {
					if (arr[i].to == val && arr[i].from <= arr[end].from && arr[i].from >= arr[index].from)
						count++;
				}
			}
			return count;
		}

		public long area(long x1, long y1, long x2, long y2) {
			return (Math.abs(x2 - x1) * Math.abs(y2 - y1));
		}

		class Pair {
			long from, to;

			Pair(long from, long to) {
				this.from = from;
				this.to = to;
			}
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
