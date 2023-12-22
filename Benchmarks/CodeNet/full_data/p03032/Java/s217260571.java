import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

@SuppressWarnings("unused")
public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	//final int INF = Integer.MAX_VALUE / 2;
	final long INF = Long.MAX_VALUE / 2;
	
	int N, K;
	int[] V;
	
	void solve() throws Exception{
		N = sc.nextInt(); K = sc.nextInt();
		V = new int[N+2];
		for(int i = 1; i <= N; i++) V[i] = sc.nextInt();
		
		long max = 0;
		for(int numL = 0; numL <= N; numL++){
			for(int numR = 0; numR + numL <= Math.min(N, K); numR++){
				int[] L = new int[numL], R = new int[numR];
				for(int i = 0; i < numL; i++) L[i] = V[i+1];
				for(int i = 0; i < numR; i++) R[i] = V[N - i];
				Arrays.sort(L); Arrays.sort(R);
				int k = K - numL - numR;
				int indexL = 0, indexR = 0;
				while(true){
					if(k == 0) break;
					if(indexL == numL && indexR == numR) break;
					if(indexL == numL){
						if(R[indexR] < 0){
							R[indexR] = 0;
							indexR++;
						}else break;
					}else if(indexR == numR){
						if(L[indexL] < 0){
							L[indexL] = 0;
							indexL++;
						}else break;
					}else{
						if(R[indexR] < 0 && L[indexL] < 0){
							if(R[indexR] < L[indexL]){
								R[indexR] = 0;
								indexR++;
							}else{
								L[indexL] = 0;
								indexL++;
							}
						}else if(L[indexL] < 0){
							L[indexL] = 0;
							indexL++;
						}else if(R[indexR] < 0){
							R[indexR] = 0;
							indexR++;
						}else{
							break;
						}
					}
					
					k--;
				}
				
				long sum = 0;
				for(int i = 0; i < numL; i++) sum += L[i];
				for(int i = 0; i < numR; i++) sum += R[i];
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms\n", (G-S));
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
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
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