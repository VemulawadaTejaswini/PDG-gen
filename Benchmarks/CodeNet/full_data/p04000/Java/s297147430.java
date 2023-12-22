import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		Box[] boxes = new Box[N];
		for (int i = 0; i < N; i++) {
			boxes[i] = new Box(sc.nextInt() - 1, sc.nextInt() - 1);
		}

		Arrays.sort(boxes, Comparator.comparingInt(Box::getY).thenComparing(Box::getX));

		int[][] rows = new int[3][W];
		int rowIndex = 0;

		int index = 0;
		long[] group = new long[10];

		for (int h = 0; h < H; h++) {
			int[] row = rows[rowIndex];
			while (index < boxes.length && boxes[index].y == h) {
				Box box = boxes[index];
				if (box.x - 2 >= 0) {
					row[box.x - 2]++;
				}
				if (box.x - 1 >= 0) {
					row[box.x - 1]++;
				}
				row[box.x]++;

				index++;
			}

			if (h >= 2) {
				for (int i = 0; i < W - 2; i++) {
					int sum = rows[0][i] + rows[1][i] + rows[2][i];
					group[sum]++;
				}
			}

			rowIndex = (rowIndex + 1) % 3;
			rows[rowIndex] = new int[W];
		}

		for (long g : group) {
			System.out.println(g);
		}
	}

	private static class Box {
		public int y;
		public int x;

		public Box(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public int getX() {
			return x;
		}
	}

	public static class Scanner {
		private BufferedInputStream inputStream;

		public Scanner(InputStream in) {
			inputStream = new BufferedInputStream(in);
		}

		public int nextInt() throws IOException {
			int num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(int[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
		}

		public void fill(int[] a, int[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
				b[i] = nextInt();
			}
		}

		public long nextLong() throws IOException {
			long num = 0;
			int sign = 1;

			int read = skip();
			if (read == '-') {
				sign = -1;
				read = inputStream.read();
			}

			do {
				num = num * 10 + sign * (read - 0x30);
			} while ((read = inputStream.read()) > 0x20);

			return num;
		}

		public void fill(long[] a) throws IOException {
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
		}

		public void fill(long[] a, long[] b) throws IOException {
			if (a.length != b.length) {
				throw new IllegalArgumentException();
			}

			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
				b[i] = nextLong();
			}
		}

		public long[] nextLong(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextLong();
			}

			return array;
		}

		public String next() throws IOException {
			StringBuilder builder = new StringBuilder();

			int read = skip();
			do {
				builder.append((char) read);
			} while ((read = inputStream.read()) > 0x20);

			return builder.toString();
		}

		private int skip() throws IOException {
			int read;
			while ((read = inputStream.read()) <= 0x20)
				;

			return read;
		}
	}
}
