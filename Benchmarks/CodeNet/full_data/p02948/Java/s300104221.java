import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	/* several useful subroutines */
	private static final BigDecimal BD1000000007 = new BigDecimal(1000000007);
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
	private static BigDecimal mod1000000007(BigDecimal bd) {
		return bd.subtract(BD1000000007.multiply(bd.divide(BD1000000007, BigDecimal.ROUND_DOWN))) ;
	}
	@SuppressWarnings("unused")
	private static BigDecimal mod1000000007(int i) {
		return mod1000000007(new BigDecimal(i)) ;
	}
	@SuppressWarnings("unused")
	private static BigDecimal mod1000000007(long l) {
		return mod1000000007(new BigDecimal(l)) ;
	}

	
	/* main routine */
	public static void main(String args[]) throws IOException {
		int n = getInt();
		int m = getInt();

		List<int[]> l = new ArrayList<int[]>();
		for ( int i = 0 ; i < n ; i++ ) {
			int x[] = new int[2];
			x[0] = getInt();
			x[1] = getInt();
			if ( x[0] <= m ) {
				l.add(x);
			}
		}
		l.sort( new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1] ;
			}
		});

		int earn = 0;
		for ( int i = m ; i>0 ; --i ) {
			if ( l.size() == 0 ) {
				break;
			}
			earn += l.get(0)[1];
			l.remove(0);
			for ( int j = l.size()-1 ; j >= 0 ; --j ) {
				if ( l.get(j)[0] == m ) {
					l.remove(j);
				}
			}
		}
		
		System.out.println(earn);
	}
}
