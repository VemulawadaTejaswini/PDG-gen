import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Node nodes[]=new Node[n];
        long aroundK[]=new long[n];
        int a,b;
        long c;
        for(int i=0;i<n;i++){
            nodes[i]= new Node(i);
            aroundK[i]=Long.MAX_VALUE;
        }
        for(int i=0;i<n-1;i++){
            a=fsc.nextInt()-1;
            b=fsc.nextInt()-1;
            c=fsc.nextLong();
            nodes[a].edges.add(new Edge(b,c));
            nodes[b].edges.add(new Edge(a,c));
        }
        int q=fsc.nextInt();
        int k=fsc.nextInt()-1;
        aroundK=solve(nodes, aroundK,0,k,-1);
        int x,y;
        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<q;j++){
            x=fsc.nextInt()-1;
            y=fsc.nextInt()-1;
            sb.append(aroundK[x]+aroundK[y]+"\n");
        }
        fsc.close();
        PrintWriter pw=new PrintWriter(System.out);
        pw.print(sb);
        pw.flush();
    }

    public static long[] solve(Node nodes[], long dist[], long stCost, int st, int from){
        dist[st]=stCost;
        for(Edge e:nodes[st].edges){
            if(e.id!=from){
                dist[e.id]=dist[st]+e.cost;
                dist=solve(nodes, dist, dist[e.id], e.id, st);
            }
        }
        return dist;
    }

    static class Node{
        int id;
        ArrayList<Edge> edges;
        public Node(int id){
            this.id=id;
            edges=new ArrayList<Edge>();
        }
        @Override public boolean equals(Object o){
            if(! (o instanceof Node)) return false;
            Node n=(Node) o;
            if(n.id==id) return true;
            else return false;
        }
        @Override public int hashCode(){
            return id;
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
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}