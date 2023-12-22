import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        int Q = sc.nextInt();
        HashMap<Integer, Node> map  = new HashMap<>();

        for(Integer i=1; i<=N; i++) {
            Node node  = new Node(i);
            map.put(i, node);
        }

        for (int i=1; i<=N-1; i++) {
            Node A = map.get(sc.nextInt());
            Node B = map.get(sc.nextInt());
            B.addLink(A);
        }

        for (int i=1; i<=Q; i++) {
            Node P = map.get(sc.nextInt());
            P.addVal(sc.nextInt());
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=N; i++) {
            Node next = map.get(i);
            int val  = next.calculateVal();
            sb.append(val);
            sb.append(" ");
        }

//        out.println(map);
        out.println(sb.toString());
        out.flush();
    }
}

class Node {
    int no;
    int val;
    int sum;
    List<Node> parents;

    public Node(int no) {
        this.no = no;
        this.val = 0;
        this.sum = 0;
        this.parents = new LinkedList<>();
    }

    void addVal(int add) {
        this.val += add;
    }

    void addLink(Node node) {
        this.parents.add(node);
    }

    int calculateVal() {
        if (this.sum == 0) {
            for (Node parent: parents) {
                this.sum += parent.calculateVal();
            }
            this.sum += this.val;
        }
        return this.sum;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", val=" + val +
                ", sum=" + sum +
                ", parents=" + parents +
                '}';
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
