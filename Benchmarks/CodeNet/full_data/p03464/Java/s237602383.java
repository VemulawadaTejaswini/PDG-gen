import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException {
		int N = readInt();
		
		long event[] = new long[N];
		
		for(int i = 0; i<N; i++) event[i] = readInt();
		
		if(event[N-1] != 2) {println(-1); exit();}		
		
		long low = 2, high = 3;
		for(int i = N-2; i>=0; i--) {
			if(event[i] >= high*2) {println(-1); exit();}
			
			low = (long) Math.ceil(low/(1.0*event[i]))*event[i];
//			high = 2*event[i]-1;
			high = (long) Math.floor(high/(1.0*event[i]))*event[i]+event[i]-1;			
		}
		
		println(low + " " + high);
		exit();
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static float readFloat() throws IOException {
		return Float.parseFloat(next());
	}

	static boolean readBoolean() throws IOException {
		return Boolean.parseBoolean(next());
	}

	static short readShort() throws IOException {
		return Short.parseShort(next());
	}

	static byte readByte() throws IOException {
		return Byte.parseByte(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}

	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void exit() throws IOException {
		br.close();
		pr.close();
		System.exit(0);
	}
}
