import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        ArrayList<ArrayList<Integer>> xy = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for(int j=0; j<2; j++) tmp.add(fs.nextInt());
            xy.add(tmp);
        }

        double total = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                total += distance(xy,i,j);
            }
        }

        int count = n*(n-1)/2;
        double ans = (double)total/count*(n-1);

        System.out.println(ans);
    }

    public static double distance(ArrayList<ArrayList<Integer>> xy, int i, int j) {
        double xi = (double)xy.get(i).get(0);
        double yi = (double)xy.get(i).get(1);
        double xj = (double)xy.get(j).get(0);
        double yj = (double)xy.get(j).get(1);
        double distance = Math.pow(Math.pow(xi-yi,2)+Math.pow(xj-yj,2),0.5);
        return distance;
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
        } else {
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
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
