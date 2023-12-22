import java.util.*;
import java.io.*;

class Main{
    static int[] num=new int[2];
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        ArrayList<Integer>[] nodes=new ArrayList[n];
        for(int i=0;i<n;i++) nodes[i]=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int a=fsc.nextInt()-1, b=fsc.nextInt()-1;
            nodes[a].add(b);
            nodes[b].add(a);
        }
        fsc.close();
        int[] path=bfs(nodes);
        int len=path.length;
        int[] color=new int[n];
        for(int i=0;i<n;i++) color[i]=-1;
        for(int i=0;i<len;i++){
            color[path[i]]=i<len/2?0:1;
        }
        for(int i=0;i<len;i++){
            coloring(nodes, color, path[i], i<len/2?0:1);
        }
        if(num[0]>num[1]) System.out.println("Fennec");
        else System.out.println("Snuke");
    }
    static void coloring(ArrayList<Integer>[] nodes, int[] color, int st, int c){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(st);
        while(q.size()!=0){
            int u=q.removeFirst();
            for(int v:nodes[u]){
                if(color[v]<0){
                    q.addLast(v);
                    color[v]=c;
                    num[c]++;
                }
            }
        }
    }

    static int[] bfs(ArrayList<Integer>[] nodes){
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(0);
        int n=nodes.length;
        int[] d=new int[n];
        int[] prev=new int[n];
        for(int i=0;i<n;i++) d[i]=-1;
        d[0]=0;
        while(q.size()!=0){
            int u=q.removeFirst();
            for(int v:nodes[u]){
                if(d[v]<0){
                    q.addLast(v);
                    d[v]=d[u]+1;
                    prev[v]=u;
                }
            }
        }
        int[] path=new int[d[n-1]+1];
        int now=n-1;
        for(int i=0;i<d[n-1]+1;i++){
            path[d[n-1]-i]=now;
            now=prev[now];
        }
        return path;
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
