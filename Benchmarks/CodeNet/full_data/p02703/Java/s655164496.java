import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        City[] cities = new City[n];
        for (int i = 0; i < n; i++) {
            cities[i] = new City(i);
        }
        for (int i = 0; i < m; i++) {
            int mu = sc.nextInt() - 1;
            int mv = sc.nextInt() - 1;
            int ma = sc.nextInt();
            int mb = sc.nextInt();
            cities[mu].addNext(mv, ma, mb);
            cities[mv].addNext(mu, ma, mb);
        }
        for (int i = 0; i < n; i++) {
            int mc = sc.nextInt();
            int md = sc.nextInt();
            cities[i].setRate(mc, md);
        }

        s = Math.min(s, 2500);
        for (int i = 0; i <= s; i++) {
            cities[0].len[i] = 0;
        }

        PriorityQueue<Long[]> que = new PriorityQueue<Long[]>((a, b) -> Long.compare(a[2], b[2])); // id, coin, time;

        que.add(new Long[]{0l, (long)s, 0l});
        int count = 0;

        HashMap<Long[], Integer> map = new HashMap<>();

        while(!que.isEmpty()){
            Long[] next = que.poll();

            count++;

            if(map.containsKey(new Long[]{next[0], next[1]})){
                continue;
            }else{
                map.put(new Long[]{next[0], next[1]}, 1);
            }

            int mid = (int)((long)(next[0]));
            long mcoin = next[1];
            long mtime = next[2];

            // System.out.println(mid + " " + mcoin + " " + mtime);
            // if(count > 10000) break;

            for (int i = (int)mcoin; i >= 0; i--) {
                if(cities[mid].len[i] == -1 || cities[mid].len[i] > mtime){
                    cities[mid].len[i] = mtime;
                }else{
                    break;
                }
            }
            
            for(Integer[] mnext : cities[mid].next){
                int nid = mnext[0];
                long nfee = mnext[1];
                long ntime = mnext[2];
                if(nfee <= mcoin){
                    if(cities[nid].len[(int)(mcoin - nfee)] > mtime + ntime || cities[nid].len[(int)(mcoin - nfee)] == -1){
                        que.add(new Long[]{(long)nid, mcoin - nfee, mtime + ntime});
                    }
                }
            }
            
            if(mcoin < 2500){
                int ncoin = (int)Math.min(2500, mcoin + cities[mid].rate);
                if(cities[mid].len[ncoin] == -1 || cities[mid].len[ncoin] > mtime + cities[mid].cTime){
                    que.add(new Long[]{(long)mid, (long)ncoin, mtime + cities[mid].cTime});
                }
            }
        }

        for (int i = 1; i < cities.length; i++) {
            System.out.println(cities[i].len[0]);
        }

        // System.out.println(count);
    }

    private static class FastScanner {
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

}

class City{
    int id;
    int rate;
    int cTime;
    ArrayList<Integer[]> next;  // id, fee
    long[] len;

    public City(int id){
        this.id = id;
        next = new ArrayList<Integer[]>();
        len = new long[2501];
        Arrays.fill(len, -1);
    }

    public void addNext(int id, int fee, int time){
        next.add(new Integer[]{id, fee, time});
    }

    public void setRate(int rate, int time){
        this.rate = rate;
        cTime = time;
    }
}

