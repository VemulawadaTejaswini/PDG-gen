import java.util.*;
import java.io.*;

public class Main {
	private static final boolean local = false;
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter output;
	//char c = line.nextToken().charAt(0);

	private static void openFile() throws IOException {
		if (local) {
			String inp = "C:/Users/ztrong/Desktop/AndroidStudioProjects/Java/src/main/java/input.txt";
			String out = "C:/Users/ztrong/Desktop/AndroidStudioProjects/Java/src/main/java/output.txt";
			br = new BufferedReader(new InputStreamReader(new FileInputStream(inp)));
			output = new PrintWriter(new FileOutputStream(out));
		}
		else {
			br = new BufferedReader(new InputStreamReader(System.in));
			output = new PrintWriter(System.out);
		}
	}

	private static String _next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	private static int nextInt() {
		return Integer.parseInt(_next());
	}

	private static long nextLong() {
		return Long.parseLong(_next());
	}

	private static double nextDouble() {
		return Double.parseDouble(_next());
	}

	private static String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	private static final int maxN = (int) 1e5 + 5;
	private static final int maxM = (int) 1e6 + 5;
	private static final int inf = (int) 1e9 + 7;

	private static int N;
	private static int[] A = new int[maxN];

	private static void init() {

	}

	private static void enter() throws IOException {
		N = nextInt();
		for (int i = 1; i <= N; ++i) {
			A[i] = nextInt();
		}
	}

	private static void solve() throws IOException {
		Arrays.sort(A, 1, N + 1);
		int a = 0, cnta = 0, b = 0, cntb = 0;
		for (int i = N; i >= 1; --i) {
			if (a == A[i]) {
				++cnta;
			}
			else if (a == 0 || cnta < 2) {
				a = A[i];
				cnta = 1;
			}
			else if (b == A[i]) {
				++cntb;
			}
			else if (b == 0 || cntb < 2) {
				b = A[i];
				cntb = 1;
			}
			if (cnta >= 4) {
				output.println(a * a);
				return;
			}
			if (cnta >= 2 && cntb >= 2) {
				output.println(a * b);
				return;
			}
		}
		output.println(0);
	}

	public static void main(String[] args) throws IOException {
		openFile();
		init();
		enter();
		solve();
		output.close();
	}
}