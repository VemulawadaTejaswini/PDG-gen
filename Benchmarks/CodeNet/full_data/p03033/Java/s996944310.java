import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        TreeSet<Integer> queue = new TreeSet<>();
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        Event[] events = new Event[N*2];
        ArrayList<Event> list = new ArrayList<>();

        for(int i = 0; i<N; i++) {
            int s = Integer.parseInt(sc.next());
            int t = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
//            events[i] = new Event(s-x, 1, x);
//            events[i+N] = new Event(t-x, -1, x);
            list.add(new Event(s-x, 1, x));
            list.add(new Event(t-x, -1, x));
        }
        list.sort((ac,bc)->(ac.t-bc.t));
        int index = 0;
        for(int i = 0; i<Q; i++) {
            int d = Integer.parseInt(sc.next());

            if(index < N*2) {
                Event e = list.get(index);
                while (e.t <= d) {
                    if (e.flag == 1) {
                        queue.add(e.x);
                    } else {
                        queue.remove(e.x);
                    }
                    index++;
                    if (index >= N * 2) break;
                    e = list.get(index);
                }
            }
            int min = -1;
            if(queue.size()!=0) {
                min = queue.first();
            }
            System.out.println(min);
        }
    }
}
class Event {
    int t;
    int flag;
    int x;
    public Event(int t, int flag, int x) {
        this.t = t;
        this.flag = flag;
        this.x = x;
    }
}
class FastScanner implements Closeable {
    private final InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
        this.in = in;
    }
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
    public void close() {
        try {
            in.close();
        } catch (IOException e) {
        }
    }
}