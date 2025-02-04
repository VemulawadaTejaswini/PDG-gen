import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

	/* several useful subroutines */
	private static BufferedReader brStdin = new BufferedReader(new InputStreamReader(System.in));
	private static String[] readBuf = null;
	private static int readPtr = 0;
	private static String getString() throws IOException {
		while ( readBuf == null || readPtr >= readBuf.length ) {
			readBuf = brStdin.readLine().split(" ");
			readPtr = 0;
		}
		return readBuf[readPtr++];
	}
	private static int getInt() throws IOException {
		return Integer.parseInt(getString());
	}
	private static long getLong() throws IOException {
		return Long.parseLong(getString());
	}
	private static BigDecimal getBD() throws IOException {
		return new BigDecimal(getString());
	}
	@SuppressWarnings("unused")
	private static String[] getStringArray(int size) throws IOException {
		String stringArray[] = new String[size];
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = getString();
		}
		return stringArray;
	}
	@SuppressWarnings("unused")
	private static int[] getIntArray(int size) throws IOException {
		int intArray[] = new int[size];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = getInt();
		}
		return intArray;
	}
	@SuppressWarnings("unused")
	private static long[] getLongArray(int size) throws IOException {
		long longArray[] = new long[size];
		for (int i = 0; i < longArray.length; i++) {
			longArray[i] = getLong();
		}
		return longArray;
	}
	@SuppressWarnings("unused")
	private static BigDecimal[] getBDArray(int size) throws IOException {
		BigDecimal bdArray[] = new BigDecimal[size];
		for (int i = 0; i < bdArray.length; i++) {
			bdArray[i] = getBD();
		}
		return bdArray;
	}
	@SuppressWarnings("unused")
	private static long calculateLCM(long a, long b) throws IOException {
		if ( a  < b ) {
			long t = a;
			a = b;
			b = t;
		}
		while ( b > 0 ) {
			long t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	
	/* main routine */
	
	public static void main(String args[]) throws IOException {
		int n = getInt();

		int c[] = new int[n];
		for ( int i = 0 ; i < n ; i++ ) {
			int p = getInt()-1;
			--c[p];
		}
		Arrays.sort(c);
		int t;
		for ( t = 0 ; t < n && c[t] != 0 ; t++ ) {
			c[t] = -c[t];
		}

		int w[] = new int[t];
		for ( int k = 1 ; k <= n ; k++ ) {
			int cnt = 0;
			System.arraycopy(c, 0, w, 0, t);
			int v = t ;
			while ( v >= k ) {
				for ( int i = t-1, cc = k ; i >=0 ; --i ) {
					if ( w[i] > 0 ) {
						if ( --w[i] == 0 ) {
							--v;
						}
						if ( --cc == 0 ) {
							break;
						}
					}
				}
				cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
