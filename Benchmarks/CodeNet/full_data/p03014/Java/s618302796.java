import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        int H = sc.nextInt();
        int W = sc.nextInt();
        Node[][] nodes  = new Node[H][W];

        String S = sc.next();
        char cur = S.charAt(0);
        if (cur == '.') {
            nodes[0][0] = new Node(false);
        } else {
            nodes[0][0] = new Node(true);
        }
        for (int j=1; j<S.length(); j++) {
            cur = S.charAt(j);
            if (cur == '.') {
                if (nodes[0][j-1].isObstacle) {
                    nodes[0][j] = new Node(false);
                } else {
                    MoveInteger hh = new MoveInteger(1);
                    MoveInteger ww = nodes[0][j-1].getWW();
                    nodes[0][j] = new Node(false, hh, ww);
                }
            } else {
                nodes[0][j] = new Node(true);
            }
        }

        for (int i=1; i<H; i++) {
            S = sc.next();
            cur = S.charAt(0);
            if (cur == '.') {
                if (nodes[i-1][0].isObstacle) {
                    nodes[i][0] = new Node(false);
                } else {
                    MoveInteger hh = nodes[i-1][0].getHH();
                    MoveInteger ww = new MoveInteger(1);
                    nodes[i][0] = new Node(false, hh, ww);
                }
            } else {
                nodes[i][0] = new Node(true);
            }
            for (int j=1; j<S.length(); j++) {
                cur = S.charAt(j);
                if (cur == '.') {
                    MoveInteger hh;
                    MoveInteger ww;
                    if (nodes[i][j-1].isObstacle) {
                        ww = new MoveInteger(1);
                    } else {
                        ww = nodes[i][j-1].getWW();
                    }
                    if (nodes[i-1][j].isObstacle) {
                        hh = new MoveInteger(1);
                    } else {
                        hh = nodes[i-1][j].getHH();
                    }
                    nodes[i][j] = new Node(false, hh, ww);
                } else {
                    nodes[i][j] = new Node(true);
                }
            }
        }
        int max = 0;
        out.println(max);
        out.flush();
    }
}

class Node {
    MoveInteger hh;
    MoveInteger ww;
    boolean isObstacle;

    public Node(boolean isObstacle, MoveInteger hh, MoveInteger ww) {
        this.isObstacle = isObstacle;
        if (isObstacle) {
            this.hh = null;
            this.ww = null;
        } else {
            this.hh = hh;
            this.ww = ww;
        }
    }

    public MoveInteger getHH() {
        return this.hh.addI(1);
    }

    public MoveInteger getWW() {
        return this.ww.addI(1);
    }

    public int getVal() {
        if (this.isObstacle) {
            return 0;
        } else {
            return this.hh.toInt() + this.ww.toInt() -1;
        }
    }

    public Node(boolean isObstacle) {
        this(isObstacle, new MoveInteger(1), new MoveInteger(1));
    }

    @Override
    public String toString() {
        return "(" + hh + ", " + ww + ")";
    }
}

class MoveInteger {
    private int i;
    MoveInteger(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public MoveInteger addI(int i) {
        this.i += 1;
        return this;
    }

    public int toInt() {
        return this.i;
    }

    @Override
    public String toString() {
        return String.valueOf(i);
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