import static java.lang.System.out;
import java.lang.Math;
import java.io.InputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        new Main().run();
    }

    MyInput in = new MyInput();
    public void run() {
        int H = in.nextInt();
        int W = in.nextInt();
        boolean[][] bmap = new boolean[H][W];
        String tmp;
        for(int i = 0; i < H; i++) {
            tmp = in.next();
            for(int j = 0; j < W; j++) {
                if(tmp.charAt(j) == '#') bmap[i][j] = true;
            }
        }
        int[][] cmap = new int[H][W];
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                for(int k = -1; k <=1; k++) {
                    for(int l = -1; l <=1; l++) {
                        if(i+k < H && i+k >= 0 && j+l < W && j+l >= 0) {
                            if(bmap[i+k][j+l]) cmap[i][j]++;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(bmap[i][j]) out.print("#");
                else out.print(cmap[i][j]);
            }
            out.println();
        }
    }
}

class MyInput {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr= 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if(ptr < buflen) {
            return true;
        }else {
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

    public int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <=126;
    }

    private void skipUnprintable() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true) {
        if('0' <= b && b <= '9') {
            n *= 10;
            n += b - '0';
        }else if(b == -1 || !isPrintableChar(b)) {
            return minus ? -n : n;
        }else {
            throw new NumberFormatException();
        }
            b = readByte();
        }
	}

    public int nextInt() {
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

