import java.util.*;
import java.io.*;
 
public class Main{
	public static void main(String[] args){
    	FastScanner sc = new FastScanner();
      	int n = sc.nextInt();
      	int c_num = sc.nextInt();
      	int[][] d = new int[c_num][c_num];
      	int[][] c = new int[n][n];

      	for(int i = 0 ; i < c_num ; i++){
      		for(int j = 0 ; j < c_num ; j++){
      			d[i][j] = sc.nextInt();
      		}
      	}
      	for(int i = 0 ; i < n ; i++){
      		for(int j = 0 ; j < n ; j++){
      			c[i][j] = sc.nextInt()-1;
      		}
      	}

      	int min = (int)1e9;
      	int[] color = new int[3];
      	int[] mod3 = new int[2*n+2];
      	int[] mod3swap = new int[2*n+2];
      	for(int i = 0 ; i < 2*n+2 ; i++){
      		mod3[i] = i%3;
      		mod3swap[i] = 0 < (i%3) ? 3-(i%3) : (i%3);

      	}
      	for(color[0] = 0 ; color[0] < c_num-2 ; color[0]++){
      		for(color[1] = color[0]+1 ; color[1] < c_num-1 ; color[1]++){
      			for(color[2] = color[1]+1 ; color[2] < c_num ; color[2]++){
      				for(int k = 0 ; k < 3 ; k++){
      					int iwa = 0;
	      				for(int i = 0 ; i < n && iwa < min ; i++){
	      					for(int j = 0 ; j < n ; j++){
	      						iwa += d[c[i][j]][color[mod3[i+j+k]]];
	      					}
	      				}
      					min = Math.min(iwa, min);

      					iwa = 0;
	      				for(int i = 0 ; i < n && iwa < min ; i++){
	      					for(int j = 0 ; j < n ; j++){
	      						iwa += d[c[i][j]][color[mod3swap[i+j+k]]];
	      					}
	      				}
      					min = Math.min(iwa, min);
      				}
      			}
      		}
      	}

      	System.out.println(min);
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