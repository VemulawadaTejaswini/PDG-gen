import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int N = in.nextInt();

			List<Integer> nums = new ArrayList<>();
			for (int k = 11; k < 10000; k++) {
				nums.add(6 * k + 2);
				nums.add(6 * k + 3);
				nums.add(6 * k + 4);
				nums.add(6 * k + 6);
			}

			List<Integer> list = new ArrayList<>();
			list.add(2);
			list.add(5);
			list.add(20);
			list.add(30);
			list.add(63);

			long sum = 0;
			for (int i : list) {
				sum += i;
			}

			if (N == 3) {
				list.remove((Integer)30);
				list.remove((Integer)20);
			} else if (N == 4) {
				list.remove((Integer)30);
			} else if (N == 5) {
				;
			} else {
				int j = 0;
				list.clear();
				while (list.size() < N) {
					sum += nums.get(j);
					list.add(nums.get(j));
					nums.remove(j);
				}
				long mod = sum % 6;
				if (mod == 2) {
					for (int src : list) {
						if (src % 6 == 2) {
							list.remove((Integer)src);
							break;
						}
					}
					for (int tar : nums) {
						if (tar % 6 == 0) {
							list.add(tar);
							break;
						}
					}
				} else if (mod == 3) {
					for (int src : list) {
						if (src % 6 == 3) {
							list.remove((Integer)src);
							break;
						}
					}
					for (int tar : nums) {
						if (tar % 6 == 0) {
							list.add(tar);
							break;
						}
					}
				} else if (mod == 5) {
					for (int src : list) {
						if (src % 6 == 3) {
							list.remove((Integer)src);
							break;
						}
					}
					for (int tar : nums) {
						if (tar % 6 == 4) {
							list.add(tar);
							break;
						}
					}
				}
			}


			for (int i = 0; i < list.size(); i++) {
				if (i == 0) {
					out.print(list.get(i));
				} else {
					out.print(" " + list.get(i));
				}
			}
			out.print("\n");


		}
	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}
