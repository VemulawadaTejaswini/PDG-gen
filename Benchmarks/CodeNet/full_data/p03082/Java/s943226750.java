import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static long mod = 1000000007;
    private static long ans = 0;
    private static long MIN = Long.MAX_VALUE;
    private static long[] fact;
    private static int[] S;
    private static int N;

    public static void main(String[] args) {
    	N = sc.nextInt();
    	int X = sc.nextInt();
    	S = new int[N];
    	HashSet <Integer> set = new HashSet<>();
    	fact = new long[N+1];
    	fact[0] = 1;
    	for(int i=1; i<=N; i++) {
    		fact[i] = (fact[i-1] * i) % mod;
    	}
    	for(int i=0; i<N; i++) {
    		S[i] = sc.nextInt();
    		if(S[i] < MIN) MIN = S[i];
    		set.add(i);
    	}
    	solve(set, X, 0);
    	System.out.println(ans);
    }

    static void solve(HashSet<Integer> unused, int num, int removed) {
    	if(unused.size() == 0) return;
		HashSet<Integer> tmpset = new HashSet<>(unused);
		for(int idx : unused) {
			if(S[idx] > num) {
				removed++;
				tmpset.remove(idx);
			}
		}
		HashSet<Integer> tmpset2 = new HashSet<>(tmpset);
    	for(int idx : tmpset) {
    		int y = S[idx];
    		int tmp = num % y;
    		if(tmp < MIN) {
    			ans = (ans + (tmp * (fact[N-removed-1]) % mod) ) % mod;
    		} else {
    			tmpset2.remove(idx);
    			solve(tmpset2, tmp, removed+1);
    		}
    	}
    	return;
    }

    static long power(long m , long n){
    	if(n == 0) {
    		return 1;
    	}else if(n == 1){
            return m;
        }else if(n % 2 == 0){
            long s = power(m, n/2);
            return ( (s % mod) * (s % mod) ) % mod;
        }else{
            return ( (m % mod) * (power(m, n-1) % mod) ) % mod;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
