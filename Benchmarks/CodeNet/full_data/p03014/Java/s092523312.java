import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Random;

public class Main {
    private static FastScanner sc = new FastScanner();
    private static boolean DEBUG_FLG = false;

    public static void main(String[] args) {
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	char[][] s = new char[H][W];
    	for(int i=0; i<H; i++) {
    		s[i] = sc.next().toCharArray();
    	}
    	int[][] yoko = new int[H+1][W+1];
    	for(int i=0; i<H; i++) {
    		int left = -1;
    		for(int j=0; j<=W; j++) {
        		if(j == W || s[i][j] == '#') {
        			int num = j - left - 1;
        			for(int k=left+1; k<j; k++) {
        				yoko[i][k] = num;
        			}
        			left = j;
        		}
        	}
    	}
    	int[][] tate = new int[H+1][W+1];
    	for(int i=0; i<W; i++) {
    		int top = -1;
    		for(int j=0; j<=H; j++) {
        		if(j == H || s[j][i] == '#') {
        			int num = j - top - 1;
        			for(int k=top+1; k<j; k++) {
        				tate[k][i] = num;
        			}
        			top = j;
        		}
        	}
    	}
    	int max = 0;
    	for(int i=0; i<H; i++) {
    		for(int j=0; j<W; j++) {
        		int x = yoko[i][j] + tate[i][j];
        		if(x > max) max = x;
        	}
    	}
    	System.out.println(max - 1);
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
