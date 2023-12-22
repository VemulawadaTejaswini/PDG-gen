import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    static int max = 1000000;
    static int[] queue = new int[max];
    static int tail = 0; static int head = 0;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Integer,HashSet<Integer>> graph = new HashMap<>();
        for (int i=1;i<=n;i++)graph.put(i,new HashSet<>());         //O(n)
        for (int i=0;i<n-1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }                                                           //O(n)
        int[] data = new int[n+1];
        for (int i=0;i<q;i++)data[sc.nextInt()]+=sc.nextInt();      //O(n)
        enqueue(1);
        boolean[] seen = new boolean[n+1];
        Arrays.fill(seen,false);
        seen[1]=true;
        while (!isEmpty()){
            int v = dequeue();
            for (int i : graph.get(v)){
                if (!seen[i]){
                    seen[i]=true;
                    enqueue(i);
                    data[i]+=data[v];
                }
            }
        }                                                           //O(n)
        for (int i=1;i<=n;i++)System.out.print(data[i]+" ");        //O(n)
        System.out.println();
    }
    static void init(){head = 0; tail = 0;}
    static boolean isEmpty(){return (head==tail);}
    static boolean isFull(){return (head == (tail+1)%max);}
    static public void enqueue(int v){
        if (isFull()){
            System.out.println("error: queue is full.");
            return;
        }
        queue[tail++] = v;
        if (tail == max) tail = 0;
    }
    static public int dequeue(){
        if (isEmpty()){
            System.out.println("error: queue is empty");
            return -1;
        }
        int res = queue[head];
        ++head;
        if (head == max) head = 0;
        return res;
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
