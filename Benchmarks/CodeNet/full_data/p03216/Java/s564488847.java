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
        int n = in.nextInt();
        String s = in.next();
        int sl = s.length();
        int q = in.nextInt();
        int[] ks = new int[q];
        for(int i = 0; i < q; i++) {
            ks[i] = in.nextInt();
        }
        for(int h = 0; h < q; h++) {
            int dmc = 0;
            int[] m = new int[sl];
            int lasta = 0;
            for(int i = 0; i < sl;i++) {
                if(s.charAt(i) == 'D') {
                    int nj = (i > lasta-1 ? i : lasta-1) + 1;
                    int nim = m[i];
                    for(int k = i; k < lasta; k++) {
                        m[k] -= nim;
                        if(s.charAt(k) == 'C') dmc += m[k];
                    }
                    for(int j = nj; j < sl && j < i+ks[h]; j++) {
                        if(s.charAt(j) == 'M') m[j] = m[j-1]+1;
                        else if(s.charAt(j) == 'C') {
                            m[j] = m[j-1];
                            dmc += m[j];
                        }
                        else m[j] = m[j-1];
                    }
                    lasta = i+ks[h];
                    lasta = lasta > sl-1 ? sl-1 : lasta;
                }
            }
            out.println(dmc);
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