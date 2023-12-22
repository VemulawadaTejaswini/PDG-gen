import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		int H = readInt(), W = readInt(), D = readInt(); int board[][] = new int[H+1][W+1]; int X[] = new int[H*W+1], Y[] = new int[H*W+1];
		for(int i = 1; i<=H; i++) for(int j = 1; j<=W; j++) {
			board[i][j] = readInt(); X[board[i][j]] = i; Y[board[i][j]] = j;
		}
		int prefixboard[][] = new int[D+1][H*W/D+4];
		for(int i = 1; i<=D; i++) {
			int crntX = X[i], crntY = Y[i]; 
			for(int j = i, k = 1; j<=H*W; j += D, k++) {
				prefixboard[i%D][k] = prefixboard[i%D][k-1] + Math.abs(crntX-X[j])+Math.abs(crntY-Y[j]);
				crntX = X[j]; crntY = Y[j];
			}
		}
		int Q = readInt(); for(int q = 0; q < Q; q++) {
			int L = readInt(), R = readInt(); 
			if(L%D==0)println(prefixboard[L%D][R/D]-prefixboard[L%D][L/D]);
			else println(prefixboard[L%D][R/D+1]-prefixboard[L%D][L/D+1]);
//			println(prefixboard[L%D][R/D] + " " + (R/D) + " " + prefixboard[L%D][L/D] + " " + (L/D));
		}
//		for(int i = 0; i<=D; i++) {for(int j = 1; j<=9; j++) print(prefixboard[i][j] + " "); println();}
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

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		br.close();
		pr.close();
		System.exit(0);
	}
}
