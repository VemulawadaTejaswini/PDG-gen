import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) throws IOException {
		int N = readInt(), M = readInt(); char grid[][] = new char[N][M]; int dist[][] = new int[N][M]; int cnt = 0;
		for(int i = 0; i<N; i++) {String s = read(); Arrays.fill(dist[i], Integer.MAX_VALUE); 
		for(int j = 0; j<M; j++) {grid[i][j] = s.charAt(j); if(s.charAt(j) == '.') cnt++; }}
		dist[0][0] = 1; LinkedList<Integer> X = new LinkedList<Integer>(), Y = new LinkedList<Integer>(); X.add(0); Y.add(0);
		while(!X.isEmpty()) {
			int x = X.pop(), y = Y.pop();
			if(grid[x][y] == '#') {dist[x][y] = Integer.MAX_VALUE; continue;}
//			println(x + " " + y);
			if(x > 0 && dist[x-1][y] > dist[x][y]+1) {dist[x-1][y] = dist[x][y]+1; X.add(x-1); Y.add(y);}
			if(x < N-1 && dist[x+1][y] > dist[x][y]+1) {dist[x+1][y] = dist[x][y]+1; X.add(x+1); Y.add(y);}
			if(y > 0 && dist[x][y-1] > dist[x][y]+1) {dist[x][y-1] = dist[x][y]+1; X.add(x); Y.add(y-1);}
			if(y < M-1 && dist[x][y+1] > dist[x][y]+1) {dist[x][y+1] = dist[x][y]+1; X.add(x); Y.add(y+1);}
		}
		if(dist[N-1][M-1] == Integer.MAX_VALUE) println(-1); else println(cnt-dist[N-1][M-1]);
		exit();
	}

	final private static int BUFFER_SIZE = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BUFFER_SIZE];
	private static int bufferPointer = 0, bytesRead = 0;
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static String readLine() throws IOException {
		byte[] buf = new byte[64]; // line length
		int cnt = 0, c;
		while ((c = Read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	public static String read() throws IOException {
		byte[] ret = new byte[1024];
		int idx = 0;
		byte c = Read();
		while (c <= ' ') {
			c = Read();
		}
		do {
			ret[idx++] = c;
			c = Read();
		} while (c != -1 && c != ' ' && c != '\n' && c != '\r');
		return new String(ret, 0, idx);
	}

	public static int readInt() throws IOException {
		int ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}

	public static long readLong() throws IOException {
		long ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}

	public static double readDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = Read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
	}

	private static void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private static byte Read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	public void close() throws IOException {
		if (din == null)
			return;
		din.close();
	}

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
		din.close();
		pr.close();
		System.exit(0);
	}
}
