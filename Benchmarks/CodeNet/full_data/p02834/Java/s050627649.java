import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int u=fsc.nextInt()-1, v=fsc.nextInt()-1;
        ArrayList<Integer>[] nodes=new ArrayList[n];
        for(int i=0;i<n;i++){
            nodes[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
            int a=fsc.nextInt()-1, b=fsc.nextInt()-1;
            nodes[a].add(b);
            nodes[b].add(a);
        }
        fsc.close();
        int[] path=bfs(nodes, u, v);
        int back=Math.max((path.length-2)/2, 0);
        int ans=back;
        int st=path[back];
        int ng=path[back+1];
        ans+=rebfs(nodes, st, ng);
        if(path.length%2==1) ans++;
        System.out.println(ans);
    }
    public static  int[] bfs(ArrayList<Integer>[] nodes, int u, int v){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(u);
        int n=nodes.length;
        int[] d=new int[n];
        int[] prev=new int[n];
        for(int i=0;i<n;i++){
            d[i]=-1;
        }
        d[u]=0;
        while(q.size()>0){
            int now=q.removeFirst();
            for(int next:nodes[now]){
                if(d[next]<0){
                    d[next]=d[now]+1;
                    q.add(next);
                    prev[next]=now;
                }
            }
        }
        int len=d[v];
        int[] path=new int[len+1];
        int now=v;
        for(int i=0;i<len+1;i++){
            path[len-i]=now;
            now=prev[now];
        }
        return path;
    }
    public static  int rebfs(ArrayList<Integer>[] nodes, int st, int ng){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(st);
        int n=nodes.length;
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            d[i]=-1;
        }
        d[st]=0;
        int max=0;
        while(q.size()>0){
            int now=q.removeFirst();
            for(int next:nodes[now]){
                if(d[next]<0 && next!=ng){
                    d[next]=d[now]+1;
                    max=Math.max(max, d[next]);
                    q.add(next);
                }
            }
        }
        return max;
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
