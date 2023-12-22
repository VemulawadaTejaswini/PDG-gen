import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Node nodes[]=new Node[n];
        int a,b;
        long c;
        for(int i=0;i<n;i++) nodes[i]= new Node(i);
        for(int i=0;i<n-1;i++){
            a=fsc.nextInt()-1;
            b=fsc.nextInt()-1;
            c=fsc.nextLong();
            nodes[a].edges.add(new Edge(b,c));
            nodes[b].edges.add(new Edge(a,c));
        }
        int q=fsc.nextInt();
        int k=fsc.nextInt()-1;
        long afterK[]=Dijkstra.dijkstra(nodes, k);
        int x,y;
        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<q;j++){
            x=fsc.nextInt()-1;
            y=fsc.nextInt()-1;
            sb.append(Dijkstra.dijkstra(nodes, x, k)[k]+afterK[y]+"\n");
        }
        fsc.close();
        System.out.print(sb);
    }
    static class Dijkstra{
        static long[] res;
        static class DistanceComparator implements Comparator<Integer>{
            boolean resInitialized;
            DistanceComparator(boolean resInitialized){
                this.resInitialized=resInitialized;
            }
            @Override public int compare(Integer a, Integer b){
                if(resInitialized){
                    if(res[a]<res[b]) return -1;
                    else if(res[a]>res[b]) return 1;
                    else return 0;
                }
                else return 0;
            }
        }
        public static long[] dijkstra(Node nodes[], int st){
            return dijkstra(nodes, st, -1);
        }   
        public static long[] dijkstra(Node nodes[], int st, int ed){
            res=new long[nodes.length];
            DistanceComparator dc=new DistanceComparator(false);
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>(dc);
            for(Node n:nodes){
                pq.add(n.id);
                res[n.id]=Long.MAX_VALUE;
            }
            dc.resInitialized=true;
            pq.remove(st);
            res[st]=0;
            pq.add(st);
            int seeing, next;
            long newValue;
            while(pq.size()>0){
                seeing=pq.poll();           
                if(res[seeing]==Long.MAX_VALUE) return res;
                if(seeing==ed) return res;               
                for(Edge e:nodes[seeing].edges){
                    newValue=res[seeing]+e.cost;
                    next=e.id;
                    if(newValue<res[next]){
                        if(pq.remove(next)){
                            res[e.id]=newValue;
                            pq.add(next);
                        }
                    }
                }
            }
            return res;
        }
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

    static class Pair{
        int id1;
        int id2;
        public Pair(int id1, int id2){
            this.id1=id1;
            this.id2=id2;
        }
        @Override public boolean equals(Object o){
            if(! (o instanceof Pair)) return false;
            Pair p=(Pair) o;
            if((p.id1==id1 && p.id2==id2) || (p.id1==id2 && p.id2==id1)) return true;
            else return false;
        }
        @Override public int hashCode(){
            int res=17;
            res=((res*31+id1)*31+id2)+((res*31+id2)*31+id1);
            return 0;
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