import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Random;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int N = sc.nextInt();
    	long ga = sc.nextLong();
    	long sa = sc.nextLong();
    	long ba = sc.nextLong();
    	long gb = sc.nextLong();
    	long sb = sc.nextLong();
    	long bb = sc.nextLong();

    	long max = N;
    	long maxi = 0;
    	long maxj = 0;
    	long maxk = 0;
    	for(long i=0; i<=N/ga; i++) {
    		for(long j=0; j<=(N - (i*ga))/sa; j++) {
    			long k = (N - (i*ga) - (j*sa)) / ba;
    			if(i*gb + j*sb + k*bb > max) {
    				max = i*gb + j*sb + k*bb;
    				maxi = i;
    				maxj = j;
    				maxk = k;
    			}
    		}
    	}

    	long max2 = max;
    	maxi = 0;
    	maxj = 0;
    	maxk = 0;
    	if(ga < gb) {
    		for(long j=0; j<=max/sb; j++) {
        		long k = (max - j*sb) / bb;
        		if(j*sa + k*ba > max2) {
    				max2 = j*sa + k*ba;
    				maxj = j;
    				maxk = k;
    			}
        	}
    	} else if(sa < sb) {
    		for(long i=0; i<=max/gb; i++) {
        		long k = (max - i*gb) / bb;
        		if(i*ga + k*ba > max2) {
    				max2 = i*ga + k*ba;
    				maxi = i;
    				maxk = k;
    			}
        	}
    	} else if(ba < bb) {
    		for(long i=0; i<=max/gb; i++) {
        		long j = (max - i*gb) / sb;
        		if(i*ga + j*sa > max2) {
    				max2 = i*ga + j*sa;
    				maxi = i;
    				maxj = j;
    			}
        	}
    	} else {
        	for(long i=0; i<=max/gb; i++) {
        		for(long j=0; j<=(max - (i*gb))/sb; j++) {
        			long k = (max - (i*gb) - (j*sb)) / bb;
        			if(i*ga + j*sa + k*ba > max2) {
        				max2 = i*ga + j*sa + k*ba;
        				maxi = i;
        				maxj = j;
        				maxk = k;
        			}
        		}
        	}
    	}

    	System.out.println(max2);
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

    static void shuffleArray(long[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            long tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }
    }
}
