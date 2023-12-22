import java.util.*;
import static java.lang.System.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] maze = new char[h][w];
		int[][] shine = new int[h][w];
		boolean  flag = false;
		int cnt = 0, start = 0;
		int max = 0;
		
		for (int i = 0; i < h; i++) {	
			if (i > 0 && cnt > 0) {
				flag = true;
				for(int x = start; x < w; x++) {
					shine[i - 1][x] += cnt;
				}
			}
			start = 0;  cnt = 0;
			maze[i] = sc.next().toCharArray();
			for(int j = 0; j < w; j++) {
				//終了
				if (maze[i][j] == '#') {
					flag = true;
					for (int k = start; k < j; k++) {
						shine[i][k] +=cnt;
					}
					cnt = 0;
				}//開始
				else if (flag && maze[i][j] == '.') {
					flag = false;
					start = j;
					cnt++;
				}//継続
				else if (flag == false && maze[i][j] == '.') {
					cnt++;
				}
				}
			}
		
		for (int i = 0; i < w; i++) {	
			if (i > 0 && cnt > 0) {
				flag = true;
				for(int x = start; x < h; x++) {
					shine[x][i - 1] += cnt;
					if (shine[x][i - 1] > max) max = shine[x][i - 1];
				}
			}
			start = 0;  cnt = 0;
			for(int j = 0; j < h; j++) {
				//終了
				if (maze[j][i] == '#') {
					flag = true;
					for (int k = start; k < j; k++) {
						shine[k][i] +=cnt;
						if(shine[k][i] > max) max = shine[k][i];
					}
					cnt = 0;
				}//開始
				else if (flag && maze[j][i] == '.') {
					flag = false;
					start = j;
					cnt++;
				}//継続
				else if (flag == false && maze[j][i] == '.') {
					cnt++;
				}
				}
			}	
		/*
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				out.print(shine[i][j] + " ");
			}
			out.println();
		}
		*/
		int ans = max - 1;
		if (ans < 0) ans = 0;
		out.println(ans);
		
		out.close();
	}

static class FastScanner {
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
}
