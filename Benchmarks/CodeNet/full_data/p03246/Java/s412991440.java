import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	public void run() throws Exception {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int[] v = new int[n];
		int tmp = 0;
		for (int i = 0; i < n; ++i) {
			v[i] = sc.nextInt() - 1;
			if (v[0] == v[i])
				++tmp;
		}
		if (tmp == n) {
			System.out.println(n / 2);
			return;
		}
		int[][] cntodd = new int[100000][2];
		int[][] cnteven = new int[100000][2];
		for (int i = 0; i < 100000; ++i) {
			cntodd[i][0] = i;
			cnteven[i][0] = i;
		}
		for (int i = 0; i < n; ++i) {
			if (i % 2 == 0) {
				cnteven[v[i]][1]++;
			} else {
				cntodd[v[i]][1]++;
			}
		}
		Arrays.sort(cnteven, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return -Integer.compare(o1[1], o2[1]);
			}
		});
		Arrays.sort(cntodd, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return -Integer.compare(o1[1], o2[1]);
			}
		});

		long ans = 1L << 60;
		for (int i = 0; i < Math.min(2, n / 2); ++i) {
			for (int j = 0; j < Math.min(2, n / 2); ++j) {
				if (cntodd[i][0] == cnteven[j][0])
					continue;
				ans = Math.min(ans, n - cntodd[i][1] - cnteven[j][1]);
			}
		}
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	class Scanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
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
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
	    
	    public int nextInt() {
	    	return (int)nextLong();
	    }
	    public long nextLong() {
	        if (!hasNext()) throw new NoSuchElementException();
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
	}
}