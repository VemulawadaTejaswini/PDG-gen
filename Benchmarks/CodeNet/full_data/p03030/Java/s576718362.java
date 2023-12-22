import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int n = nextInt();
		long[][] rank = new long[n][3];

		for(int i=0;i<n;i++) {
			long a = Long_ASCII(next());
			rank[i][0] = a;
			rank[i][1] = nextLong();
			rank[i][2] = i;
		}
		sc.close();
		Arrays.sort(rank,(a1,a2)->Long.compare(a2[1],a1[1]));
		Arrays.sort(rank,(a1,a2)->Long.compare(a1[0],a2[0]));

		for(int i=0;i<n;i++) {
			out.println(rank[i][2]);
		}
	}

	private long Long_ASCII(String s) {
		 byte[] asciiCodes = null;
	        String sampleString = s;
	        try {
	            asciiCodes = sampleString.getBytes("US-ASCII");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        long a = 0;
	        for (int i=0;i<asciiCodes.length;i++) {
	        	a *= 100;
	        	a += asciiCodes[i]-23;
	        }

		return a;
	}
	private static int nextInt() {
		return Integer.parseInt(next());
	}
	private static long nextLong() {
		return Long.parseLong(next());
	}
	private static String next() {
		return sc.next();
	}

}
