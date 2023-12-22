import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	//PrintWriter out;
	final int MOD = 1000000007;
	
	/* solve */
	void solve(){
		int n = sc.nextInt();
		double[] a = new double[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextDouble();
		Arrays.sort(a);
		
		int ans1 = 0, ans2 = n - 1; 
		
		for(int i = 0; i < n; i++){
			double b1 = a[i];
			int index = binarySearch(a, b1 / 2);
			if(index + 1 < n && Math.abs(a[index] - b1 / 2) > Math.abs(a[index + 1] - b1 / 2)) index++;
			//double b2 = a[index];
			
			if(ans1 > ans2){
				if(ans2 <= index && ans1 - ans2 >= index){
					ans1 = i;
					ans2 = index;
				}
			}else{
				if(ans2 >= index && ans2 - ans1 >= index){
					ans1 = i;
					ans2 = index;
				}
			}
		}
		
		System.out.println((int)Math.max(a[ans1], a[ans2]) + " " + (int)Math.min(a[ans1], a[ans2]));
	}
	
	public static int binarySearch(double[] a, double key){
		/*
		 * 上界の探索
		 * 下界の場合は ok = a.length, ng = -1;
		 */
		int ok = 0;
		int ng = a.length-1;
		
		while(Math.abs(ok - ng) > 1){
			int mid = (ok + ng) / 2;
			if(a[mid] <= key) ok = mid;
			else ng = mid;
		}
		
		return ok;
	}
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws IOException {
		new Main().m();
	}
	
	void m() throws IOException {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		//out = new PrintWriter(System.out);
		solve();
		//out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%7d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
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
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
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
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}
