import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        ArrayList<Integer>[] nodes=new ArrayList[n];
        for(int i=0;i<n;i++){
            nodes[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            int a=fsc.nextInt()-1;
            int b=fsc.nextInt()-1;
            nodes[a].add(b);
            nodes[b].add(a);
        }
        int m=fsc.nextInt();
        int[][] pair=new int[m][2];
        for(int i=0;i<m;i++){
            int u=fsc.nextInt()-1;
            int v=fsc.nextInt()-1;
            pair[i][0]=u;
            pair[i][1]=v;
        }
        fsc.close();
        HashSet<Integer>[][] path=new HashSet[n][n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                path[i][j]=new HashSet<>();
                ArrayList<Integer> l=bfs(nodes, i, j);
                for(int k=0;k<l.size()-1;k++){
                    int from=Math.min(l.get(k), l.get(k+1));
                    int to=Math.max(l.get(k), l.get(k+1));
                    path[i][j].add(from*n+to);
                }
            }
        }
        long ans=1l<<(n-1);
        for(int i=1;i<(1<<m);i++){
            HashSet<Integer> e=new HashSet<>();
            for(int b=0;b<m;b++){
                if(((1<<b)&i)!=0){
                    int x=Math.min(pair[b][0], pair[b][1]);
                    int y=Math.max(pair[b][0], pair[b][1]);
                    e.addAll(path[x][y]);
                }
            }
            int cnt=(n-1)-e.size();
            if(Integer.bitCount(i)%2!=0){
                ans-=1l<<cnt;
            } else{
                ans+=1l<<cnt;
            }
        }
        System.out.println(ans);
    }
    
    // return the shortest path from 's' to 't' as an array.
    // [s, a1, a2, ..., ak, t] => distance = array.length-1
    // if NO path from 's' to 't' exists, returns NULL.
    public static ArrayList<Integer> bfs(ArrayList<Integer>[] nodes, int s, int t) {
        IntQueue q = new IntQueue(nodes.length + 1);
        q.add(s);
        int n = nodes.length;
        int[] d = new int[n];
        int[] prev = new int[n];
        for (int i = 0; i < n; i++){
            d[i] = -1;
        }
        d[s]=0;
        while (q.size() > 0) {
            int now = q.poll();
            for (int next : nodes[now]) {
                if (d[next] < 0) {
                    d[next] = d[now] + 1;
                    prev[next] = now;
                    q.add(next);
                }
            }
        }
        int now = t;
        ArrayList<Integer> path = new ArrayList<>();
        for (int i = 0; i <= d[t]; i++) {
            path.add(0, now);
            now = prev[now];
        }
        return path;
    }

    static class IntQueue {
        private int[] a;
        private int max;
        private int head = 0, tail = 0;
        private int size = 0;

        public IntQueue(int max) {
            this.max = max;
            a = new int[max];
        }

        public IntQueue() {
            this.max = Integer.MAX_VALUE;
            a = new int[max];
        }

        public void add(int x) {
            a[tail++] = x;
            size++;
        }

        public int poll() {
            if (size == 0) {
                try {
                    throw new Exception("no elements.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            size--;
            return a[head++];
        }

        public int size() {
            return size;
        }

        public void init() {
            head = 0;
            tail = 0;
            size = 0;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
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
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
