import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main{
	public static void main(String[] args){
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		long[] val = new long[3*N];
		for(int i=0; i<3*N; i++){
			val[i] = sc.nextLong();
		}
		
		PriorityQueue<Long> pq1 = new PriorityQueue<>();
		long[] ans = new long[N+1];
		long sum=0;
		for(int i=0; i<N; i++){
			pq1.offer(val[i]);
			sum+=val[i];
		}
		ans[0] = sum;
		for(int i=N; i<2*N; i++){
			pq1.offer(val[i]);
			sum += val[i] - pq1.poll();
			ans[i-N+1] = sum;
		}
		
		PriorityQueue<Long> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		sum=0;
		for(int i=3*N-1; i>=2*N; i--){
			pq2.offer(val[i]);
			sum+=val[i];
		}
		ans[N] -= sum;
		for(int i=2*N-1; i>=N; i--){
			pq2.offer(val[i]);
			sum += val[i] - pq2.poll();
			ans[i-N] -= sum;
		}
		Arrays.sort(ans);
		System.out.println(ans[N]);
		return;
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