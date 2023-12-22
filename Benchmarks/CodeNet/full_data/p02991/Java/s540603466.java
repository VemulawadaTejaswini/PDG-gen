import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), m=fsc.nextInt();
        Node[] nodes=new Node[n];
        for(int i=0;i<n;i++) nodes[i]=new Node();
        for(int j=0;j<m;j++){
            int u=fsc.nextInt()-1, v=fsc.nextInt()-1;
            nodes[u].edges.add(v);
        }
        int s=fsc.nextInt()-1, t=fsc.nextInt()-1;
        fsc.close();
        nodes[s].dists.add(0);
        for(int i=0;i<3;i++){
            IntQueue q=new IntQueue(10*n);
            q.add(s);
            HashSet<Integer> visited=new HashSet<>();
            while(q.size()>0){
                int now=q.poll();
                for(int v:nodes[now].edges){
                    for(int dist:nodes[now].dists) nodes[v].dists.add(dist+1);
                    if(!visited.contains(v)){
                        visited.add(v);
                        q.add(v);
                    }
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int dist:nodes[t].dists) if(dist%3==0) min=Math.min(min, dist/3);
        if(min==Integer.MAX_VALUE) min=-1;
        System.out.println(min);
    }
    static class Node{
        HashSet<Integer> dists;
        HashSet<Integer> edges;
        public Node(){
            dists=new HashSet<>();
            edges=new HashSet<>();
        }
    }
    static class Edge{
        int id;
        long cost;
        public Edge(int id, long cost){
            this.id=id;
            this.cost=cost;
        }
    }
    static class IntQueue{
        int[] a;
        private int max;
        int head=0, tail=0;
        private int size=0;
        public IntQueue(int max){
            this.max=max;
            a=new int[max];
        }
        public IntQueue(){
            this.max=Integer.MAX_VALUE;
            a=new int[max];
        }
        public void add(int x){
            a[tail++]=x;
            size++;
        }
        public int poll(){
            if(size==0) System.exit(1);
            size--;
            return a[head++];
        }
        public int size(){
            return size;
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