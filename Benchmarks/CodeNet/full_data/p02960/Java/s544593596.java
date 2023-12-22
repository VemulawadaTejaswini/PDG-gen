import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	private static void next(final long[] T, final long[] R, int n) {
		for(int i=0;i<13;i++) {
			int index =(i*10+n)%13;
			T[index] = T[index]+R[i];
		}
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final String S = sc.nextLine();
		final int L = S.length();
		final long[] R = new long[13];
		final long[] T = new long[13];
		final long mod = 1000000000+7;
		for(int i=0;i<13;i++) {
			R[i] = 0L;
			T[i] = 0L;
		}

		char c = S.charAt(0);
		if(c=='?') {
			for(int r=0;r<10;r++) {
				R[r] = 1;
			}
		}else {
			R[(int)(c-'0')] = 1;
		}


		for(int i=1;i<L;i++) {
			for(int t=0;t<13;t++) {
				T[t] = 0;
			}
			c = S.charAt(i);
			if(c=='?') {
				for(int r=0;r<10;r++) {
					next(T, R, r);
				}
			}else {
				next(T, R, (int)(c-'0'));
			}
			for(int j=0;j<13;j++) {
				R[j]=T[j]%mod;
			}

		}
		out.println(R[5]);
	}
}
