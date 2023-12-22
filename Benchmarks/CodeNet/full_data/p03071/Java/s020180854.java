import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws Exception {
		int a = in.i();
		int b = in.i();
		if ( a < b ) {
			out.print(2* b - 1);
		} else if ( a == b) {
			out.print(a + b);
		} else {
			out.print(2 * a -1);
		}
		out.println();
	}


	static PrintStream out = System.out;
	static FastReader in = new FastReader();
}

class FastReader {
	final private int BUF_SIZE = 1 << 16;
	private DataInputStream din;
	private byte[] buffer = new byte[BUF_SIZE];
	private int bufferPointer, bytesRead;

	FastReader() {
		din = new DataInputStream(System.in);
	}

	String s() throws IOException {
		byte[] buf = new byte[64];
		int cnt = 0, c;
		while ((c = read()) != -1) {
			if (c == '\n') break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}

	int i() throws IOException {
		int ret = 0;
		byte c = read();
		while (c <= ' ') c = read();
		boolean neg = (c == '-');
		if (neg) c = read();
		do { ret = ret * 10 + c - '0'; }
		while ((c = read()) >= '0' && c <= '9');
		return neg ? -ret : ret;
	}

	long l() throws IOException {
		long ret = 0;
		byte c = read();
		while (c <= ' ') c = read();
		boolean neg = (c == '-');
		if (neg) c = read();
		do { ret = ret * 10 + c - '0'; }
		while ((c = read()) >= '0' && c <= '9');
		return neg ? -ret : ret;
	}

	double d() throws IOException {
		double ret = 0, div = 1;
		byte c = read();
		while (c <= ' ') c = read();
		boolean neg = (c == '-');
		if (neg) c = read();
		do { ret = ret * 10 + c - '0'; }
		while ((c = read()) >= '0' && c <= '9');
		if (c == '.')
			while ((c = read()) >= '0' && c <= '9')
				ret += (c - '0') / (div *= 10);
		return neg ? -ret : ret;
	}

	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUF_SIZE);
		if (bytesRead == -1) buffer[0] = -1;
	}

	private byte read() throws IOException {
		if (bufferPointer == bytesRead) fillBuffer();
		return buffer[bufferPointer++];
	}

	void close() throws IOException {
		if (din != null) din.close();
	}
}

