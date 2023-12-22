
import java.io.IOException;
import java.io.InputStream;
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

		int n;
		int k;
		FastScanner sc = new FastScanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();

		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}

		// その数値より小さい数値の数を入れる
		long [] tmp = new long[n];
		for(int i = 0 ; i < n ; i++) {
			long cnt = 0;
			for(int j = 0 ; j < n ; j++) {
				if(a[i] > a[j]) {
					cnt++;
				}
			}
			tmp[i] = cnt;
		}

		long ans = 0;
		// aだけで真面目にカウント
		for(int i = 0 ; i < n - 1 ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				if(a[i] > a[j]) {
					ans++;
				}
			}
		}

		// 真面目カウント * K
		ans = (ans * k) % 1000000007;

		// 2回目のループ以降
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 1 ; j <= k ; j++) {
//				ans += (tmp[i] * (k - j)) % 1000000007;
//				ans = ans % 1000000007;
//			}
//		}

		long x = 0;
		for(int i = 1 ; i <= k ; i++) {
			x += k - i;
		}
		x = x % 1000000007;

		for(int i = 0 ; i < n ; i++) {
			ans += (tmp[i] * x) % 1000000007;
			ans = ans % 1000000007;
		}

		System.out.println(ans % 1000000007);

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
