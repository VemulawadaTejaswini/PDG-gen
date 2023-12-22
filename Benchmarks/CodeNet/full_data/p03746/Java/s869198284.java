import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] count = new int[N + 1];
		Arrays.fill(count, 0);

		int M = sc.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		List<Integer> indexes = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			count[A[i]]++;
			count[B[i]]++;
			indexes.add(i);
		}

		List<Integer> path = new ArrayList<Integer>();
		path.add(A[0]);
		path.add(B[0]);
		indexes.remove(0);

		for (int i = 0; i < indexes.size(); i++) {
			int last = path.size() - 1;
			int index = indexes.get(i);
			int indexA = path.indexOf(A[index]);
			int indexB = path.indexOf(B[index]);
			
			if (indexA > -1) {
				if (indexB == -1) {
					if (indexA == 0) {
						path.add(0, B[index]);
					} else if (indexA == last) {
						path.add(B[index]);
					}
					indexes.remove(i);
					i = -1;
				}
			} else if (indexB > - 1) {
				if (indexA == -1) {
					if (indexB == 0) {
						path.add(0, A[index]);
					} else if (indexB == last) {
						path.add(A[index]);
					}
					indexes.remove(i);
					i = -1;
				}
			}
		}
		System.out.printf("%d\n", path.size());
		System.out.printf("%d", path.get(0));
		for (int i = 1; i < path.size(); i++) {
			System.out.printf(" %d", path.get(i));
		}
	}

	static class Scanner {
		private InputStream in;
		private final byte[] buf = new byte[1024];
		private int cur = 0;
		private int len = 0;

		Scanner (InputStream in) {
			this.in = in;
		}

		private int read() {
			if (cur >= len) {
				cur = 0;
				try {
					len = in.read(buf);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (len < 0) {
					return -1;
				}
			}
			return (int)buf[cur++];
		}

		public String next() {
			int c = read();
			if (c == -1) {
				throw new NoSuchElementException();
			}
			while (c < 33 || 126 < c) {
				c = read();
			}
			StringBuilder sb = new StringBuilder();
			while (33 <= c && c <= 126) {
				sb.appendCodePoint(c);
				c = read();
			}
			return sb.toString();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
