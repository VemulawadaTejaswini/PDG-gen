import java.io.BufferedReader;

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
		double a = getInt();
		double b = getInt();
		double x = getInt();
		
		double d ;

		double s = a*a;

		if ( x > s*b/2 ) {
			x = (s*b - x) * 2 / s;
			d = Math.atan(x/a)  / Math.PI * 180 ;
		} else {
			x /= a * b / 2 ;
			d = Math.atan(b/x)   / Math.PI * 180;
		}
		
		
		System.out.println( d );
		
	}
}
