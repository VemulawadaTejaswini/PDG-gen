import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

class Main{
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] kosu=new int[100001];
		long[][] aa=new long[M][3];
		for(int i=0; i<=100000; i++) {
			kosu[i]=0;
		}
		for(int i=0; i<M; i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			kosu[(int)a]++;
			aa[i][0]=a*10000000000L+b;
			aa[i][1]=i;
		}
		for(int i=1; i<=100000; i++) {
			kosu[i]=kosu[i-1]+kosu[i];
		}
		quick_sort(aa,0,M-1);
		for(int i=0; i<M; i++) {
			aa[i][2]=i+1;
		}
		long[][] ansss=new long[M+1][2];
		for(int i=0; i<M; i++) {
			ansss[(int)aa[i][1]][0]=aa[i][0];
			long ban=aa[i][0]/10000000000L;
			ansss[(int)aa[i][1]][1]=aa[i][2]-kosu[(int)ban-1];
		}
		String unti="";
		String buri="";
		for(int i=0; i<M; i++) {
			long aaaa=ansss[i][0]/10000000000L;
			unti=String.format("%06d", (int)(aaaa));
			buri=String.format("%06d", (int)(ansss[i][1]));
			System.out.println(unti+buri);
		}
	}
	static void quick_sort(long[][] d, int left, int right) {
		if (left>=right) {
			return;
		}
		long p = d[(left+right)/2][0];
		int l = left, r = right;
		long tmp,tmp1,tmp2;
		while(l<=r) {
			while(d[l][0] < p) { l++; }
			while(d[r][0] > p) { r--; }
			if (l<=r) {
				tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
				tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
				l++; r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
  
  
  static class FastScanner {

	private final InputStream in = System.in;

	private final byte[] buffer = new byte[1024];

	private int ptr = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (ptr < buflen) return true;
		else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) return false;
		}
		return true;
	}
 
	private static byte readByte() {
		if (hasNextByte()) return buffer[ptr++];
		return -1;
	}
 
	private static boolean isPrintableChar(byte c) {
		return '!' <= c && c <= '~';
	}
 
	private static void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
 
	public static boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
 
	public static String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
 
	public static int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
 
	public static long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}
}
