import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int[] even = new int[N/2+1];
		int[] odd = new int[N/2+1];
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if (i % 2 == 0) {
				even[i/2] = temp;
			} else {
				odd[i/2] = temp;
			}
		}
		even[even.length-1] = 1000000;
		odd[odd.length-1] = 1000000;
		Arrays.sort(even);
		Arrays.sort(odd);
		number[] e = method(even);
		number[] o = method(odd);
		int ans = 0;
		if (e[0].num == o[0].num && e[0].count == N/2 && o[0].count == N/2) {
			ans = N/2;
		} else if (e[0].num == o[0].num) {
			ans = Math.max(e[0].count + o[1].count,e[1].count + o[0].count);
		} else {
			ans = e[0].count + o[0].count;
		}
		System.out.println(N - ans);
	}
	static class number {
		int num;
		int count;
		
		number(int num, int count) {
			this.num = num;
			this.count = count;
		}
	}
	
	static number[] method(int[] ary) {
		int pre = -1;
		number max = new number(-1,1);
		number semi = new number(-1,1);
		int count = 0;
		for (int i = 0; i < ary.length; i++) {
			if (pre != ary[i]) {
				if (count >= max.count) {
					max = new number(ary[i-1], count);
				} else if (count >= semi.count) {
					max = new number(ary[i-1], count);
				}
				pre = ary[i];
				count = 1;
			} else {
				count++;
			}
		}
		return new number[] {max,semi};
	}
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}