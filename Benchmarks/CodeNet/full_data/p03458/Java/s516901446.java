import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	FastScanner sc = new FastScanner();
    	
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	
    	int[] x = new int[N];
    	int[] y = new int[N];
    	boolean[] c = new boolean[N];
    	
    	for(int i=0;i<N;i++){
    		x[i] = sc.nextInt() %2*K;
    		y[i] = sc.nextInt() %2*K;
    		
    		String g = sc.next();
    		
    		if(g=="B"){
    			c[i] = true;
    		}
    		else{
    			c[i] = false;
    		}
    		
    	}
    	
    	int max = 0;
    	
    	for(int i=0;i<2*K;i++){
    		for(int j=0;j<2*K;j++){
				int num = 0;
    			
    			for(int p=0;p<N;p++){
    				
    				if(x[p] < i || x[p] > i+K){
    					if(y[p] < j || y[p] >= j+K){
    						if(c[p]){
        						num += 1;
    						}
    					}
    					else{
    						if(!c[p]){
        						num += 1;
    						}
    					}
    				}
    				else{
    					if(y[p] < j || y[p] >= j+K){
    						if(!c[p]){
    							num += 1;
    						}
    					}
    					else{
    						if(c[p]){
    							num += 1;
    						}
    					}
    				}
    				
    			}
    			
    			if(num > max){
    				max = num;
    			}
    		}
    	}
    	
    	System.out.println(max);

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