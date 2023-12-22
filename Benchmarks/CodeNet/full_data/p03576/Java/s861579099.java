import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	static ArrayList<Integer> cities = new ArrayList<>();
	public static void main(String args[]) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		HashMap<Integer,Integer> x_y =
				new HashMap<>();
		HashMap<Integer,Integer> y_x = new HashMap<>();
		
	for(int i=0;i<N;i++) {
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
		x_y.put(x[i], y[i]);
		y_x.put(y[i],x[i]);
	}
	long result = Long.MAX_VALUE;
	for(int i_x=0;i_x<N;i_x++) {
		for(int j_x=0;j_x<N;j_x++) {
			for(int i_y=0;i_y<N;i_y++) {
				for(int j_y=0;j_y<N;j_y++) {
					long x_min = Math.min(x[i_x], x[j_x]);
					long x_max = Math.max(x[i_x], x[j_x]);
					long y_min = Math.min(y[i_y], y[j_y]);
					long y_max = Math.max(y[i_y], y[j_y]);
					int count = 0;
					for(int i=0;i<N;i++) {
						if(x[i] >= x_min && x[i] <= x_max
								&& y[i] >= y_min && y[i] <= y_max) count++;
					}
					if(count >= K) result = Math.min(result, (x_max-x_min) * (y_max-y_min));
				}
			}
		}
	}
	
	
	
	out.println(result);

		out.flush();
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
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}

