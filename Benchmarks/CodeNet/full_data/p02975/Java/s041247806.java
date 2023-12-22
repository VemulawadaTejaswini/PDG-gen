import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;
    // static int dp[][] = new int[MAX][MAX];
    static int a[] = new int[MAX];
    static Map<Integer,Integer> mp = new HashMap<>();
    
    public void _main(String[] args) {
        _Scanner sc = new _Scanner(in);
        int n = sc.i();
        for(int i=0;i<n;i++) {
            a[i]=sc.i();
            if (!mp.containsKey(a[i])) mp.put(a[i],1);
            else mp.put(a[i],mp.get(a[i])+1);
        }
        exit("No");
        if (n==3) {
            if ((a[0]^a[1])==a[2]&&(a[1]^a[2])==a[0]&&(a[2]^a[0])==a[1])
                exit("Yes");
            else exit("No");
        }
        if (n%3==0) {
            boolean flag = true;
            int m = n/3;
            for (Map.Entry<Integer,Integer> item : mp.entrySet()) {
                if ((item.getValue()%m)!=0) {
                    flag = false;
                    break;
                }
            }
            if (flag) exit("Yes");
        }
        if (n%2==0) {
            int p = 2;
            boolean flag = true;
            for (Map.Entry<Integer,Integer> item : mp.entrySet()) {
                if ((item.getValue()%p)!=0) {
                    flag = false;
                    break;
                }
            }
            if (flag) exit("Yes");
        }
        exit("No");
    }

    void exit(String s) {
        out.println(s);
        System.exit(0);
    }
    class Counter<T> {
        Map<T,Integer> mp = new HashMap<>();
        int add(T t) {
            if (!mp.containsKey(t)) mp.put(t,1);
            else mp.put(t,mp.get(t)+1);
            return mp.get(t);
        }
        int get(T t) {return mp.get(t);}
        Stream<Pair<T,Integer>> entrySet() {
            return mp.entrySet().stream()
                .map(s -> new Pair<>(s.getKey(),s.getValue()));
        }
    }
    static void swap(int[]a,int i,int j){if(i!=j){a[i]^=a[j];a[j]^=a[i];a[i]^=a[j];}}
    static void swap(long[]a,int i,int j){if(i!=j){a[i]^=a[j];a[j]^=a[i];a[i]^=a[j];}}
    class _Scanner {
        private InputStream in;
        public _Scanner(InputStream in) {this.in=in;}
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
                if (buflen <= 0) return false;
            }
            return true;
        }
        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }
        final boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }
        final boolean isNum(String s) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        boolean hasNext() {
            while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }
        String s() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        long l() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b=='-') {
                minus = true;
                b = readByte();
            }
            if (b<'0' || '9'<b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0'<=b && b<='9') {
                    n *= 10;
                    n += b - '0';
                } else if(b == -1 || !isPrintableChar(b))
                    return minus ? -n : n;
                else
                    throw new NumberFormatException();
                b = readByte();
            }
        }
        int i() {
            long nl = l();
            if (nl<Integer.MIN_VALUE || nl>Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int)nl;
        }
        double d() {return Double.parseDouble(s());}
        char c() {return (char)readByte();}
    }
    public class Pair<T,K> {
        T a; K b;
        Pair(T _a, K _b) {a=_a;b=_b;}
    }
    class Queue<T> {
        ArrayDeque<T> Q = new ArrayDeque<T>();
        void push(T a) {Q.add(a);}
        T pop() {return Q.poll();}
        boolean isEmpty() {return Q.isEmpty();}
    }
    public static void main(String[] args) {
        new Main()._main(args);
    }
}
