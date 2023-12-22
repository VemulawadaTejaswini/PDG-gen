import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	int Q = sc.nextInt();
    	char[] s = sc.next().toCharArray();

    	char[] t = new char[Q];
    	char[] d = new char[Q];
    	for(int i=0; i<Q; i++) {
    		t[i] = sc.next().charAt(0);
    		d[i] = sc.next().charAt(0);
    	}

    	int[] lastLeft = new int[N];
    	for(int i=0; i<N; i++) {
    		lastLeft[i] = -1;
    	}
    	int idx = 0;
    	for(int i=Q-1; i>=0; i--) {
    		if(idx == N) break;
    		if(t[i] == s[idx] && d[i] == 'L') {
    			lastLeft[idx] = i;
    			idx++;
    		} else if(idx != 0 && t[i] == s[idx-1] && d[i] == 'R') {
    			int tmp = idx+1;
    			for(int j=i+1; j<=lastLeft[idx]; j++) {
    				if(tmp == idx || tmp == N || j == lastLeft[idx]) {
    					lastLeft[idx] = -1;
    					idx--;
    					break;
    				}
    				if(t[j] == s[tmp]) {
    					if(d[j] == 'L') {
    						tmp--;
    					} else {
    						tmp++;
    					}
    				}
    			}
    		}
    	}

    	int ans = 0;
    	for(int i=0; i<N; i++) {
    		if(lastLeft[i] != -1) ans++;
    	}

    	int[] lastRight = new int[N];
    	for(int i=0; i<N; i++) {
    		lastRight[i] = -1;
    	}
    	idx = N-1;
    	for(int i=Q-1; i>=0; i--) {
    		if(idx == 0) break;
    		if(t[i] == s[idx] && d[i] == 'R') {
    			lastRight[idx] = i;
    			idx--;
    		} else if(idx != N-1 && t[i] == s[idx+1] && d[i] == 'L') {
    			int tmp = idx-1;
    			for(int j=i+1; j<lastRight[idx]; j++) {
    				if(tmp == idx || tmp == N || j == lastRight[idx]) {
    					lastRight[idx] = -1;
    					idx++;
    					break;
    				}
    				if(t[j] == s[tmp]) {
    					if(d[j] == 'L') {
    						tmp--;
    					} else {
    						tmp++;
    					}
    				}
    			}
    		}
    	}

    	for(int i=0; i<N; i++) {
    		if(lastRight[i] != -1) ans++;
    	}
    	if(ans > N) ans = N;
    	System.out.println(N - ans);
    }

    static void debug(long... args) {
    	if(!DEBUG_FLG) return;
    	boolean flg = false;
    	for(long s : args) {
    		if(flg) System.out.print(" ");
    		flg = true;
    		System.out.print(s);
    	}
    	System.out.println();
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
