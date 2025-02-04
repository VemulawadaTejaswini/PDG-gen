import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main implements Runnable {

	public static void main(String[] args) {

		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();

	}

	@Override
	public void run() {
		exec();
	}

	private void exec() {

		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		List<Integer> list = new LinkedList<>();
		for(int i = 0 ; i < n ; i++) {
			list.add(a[i]);
		}
		int pre = 0;
		int preCnt = 0;
		int uniq = 0;
		List<Integer> uniqList = new ArrayList<>();
		PARENT: while(true) {
			Iterator<Integer> ite = list.iterator();
			while(ite.hasNext()) {
				int i = ite.next();
				if(i != pre) {
					pre = i;
					preCnt = 0;
					uniq++;
					ite.remove();
				} else if(i == pre) {
					preCnt++;
				}
				if(list.size() == 0 || list.size() == preCnt) {
					uniqList.add(uniq);
					break PARENT;
				}
			}
			uniqList.add(uniq);
			uniq = 0;
		}

		int[] ans = new int[n];
		ans[0] = n;
		for(int i = 2 ; i <= n ; i++) {
			for(int u : uniqList) {
				ans[i - 1] += u / i;
			}
		}

		for(int i = 0 ; i < n ; i++) {
			System.out.println(ans[i]);
		}

	}

}

class FastScanner {

	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public FastScanner(InputStream in) {
		this.in = in;
	}

	private boolean hasNextByte() {
		if(ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if(hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while(hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while(true){
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			}else if(b == -1 || !isPrintableChar(b)){
				return minus ? -n : n;
			}else{
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

}
