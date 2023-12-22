import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		byte i;
		boolean is;
		byte N = (byte)IO.nextInt();
		byte[] X = new byte[N];
		byte[] Y = new byte[N];
		int[] H = new int[N];
		byte A = -1;
		for(i=0; i<N; i++){
			X[i] = (byte)IO.nextInt();
			Y[i] = (byte)IO.nextInt();
			H[i] = IO.nextInt();
			if(A==-1 && H[i]!=0){A=i;}
		}
		byte CX=0, CY=0;
		int CH=0;
		loop: for(CX=0; CX<=100; CX++){
			for(CY=0; CY<=100; CY++){
				CH = (A==-1 ? 1 : H[A]+distance(CX, CY, X[A], Y[A]));
				is = true;
				for(i=0; i<N; i++){
					if(H[i]+distance(CX, CY, X[i], Y[i]) != CH){
						is = false;
						break;
					}
				}
				if(is){
					break loop;
				}
			}
		}
		StringBuilder string = new StringBuilder();
		string.append(CX);
		string.append(" ");
		string.append(CY);
		string.append(" ");
		string.append(CH);
		string.append("\n");
		IO.print(string.toString());
		IO.flush();
		return;
	}
	private static int distance(byte ax, byte ay, byte bx, byte by){
		return (ax>bx?ax-bx:bx-ax)+(ay>by?ay-by:by-ay);
	}
}

final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;
	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}
	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}
	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}
	static char nextChar() {
		if (!hasNext())
			throw new NoSuchElementException();
		return (char) readByte();
	}
	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}
	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}
	static double nextDouble() {
		return Double.parseDouble(next());
	}
	static void print(String val) {
		out.print(val);
	}
	static void flush() {
		out.flush();
	}
}