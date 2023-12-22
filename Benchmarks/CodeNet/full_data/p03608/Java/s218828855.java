import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int m=fsc.nextInt();
        int r=fsc.nextInt();
        Node nodes[]=new Node[n];
        int rs[]=new int[r];
        for(int i=0;i<n;i++) nodes[i]=new Node(i);
        for(int k=0;k<r;k++) rs[k]=fsc.nextInt()-1;
        int a,b,c;
        for(int j=0;j<m;j++){
            a=fsc.nextInt()-1;
            b=fsc.nextInt()-1;
            c=fsc.nextInt();
            nodes[a].edges.add(new Edge(b,c));
            nodes[b].edges.add(new Edge(a,c));
        }
        int dist[][]=new int[r][r];
        int rkDist[];
        
        ArrayList<Integer> toVisit=new ArrayList<Integer>();
        for(int k=0;k<r;k++){
            toVisit.add(k);
            rkDist=Dijkstra.dijkstra(nodes, rs[k]);
            for(int l=0;l<r;l++) dist[k][l]=rkDist[rs[l]];
        }
        int st;
        int opt=Integer.MAX_VALUE;
        for(int k=0;k<r;k++){
            st=toVisit.remove(0);
            opt=Math.min(opt, search(dist, toVisit, Integer.MAX_VALUE, 0, st));
            toVisit.add(st);
        }
        System.out.println(opt);


        fsc.close();
    }

    public static int search(int[][] dist, ArrayList<Integer> toVisit, int opt, int prevDist, int st){
        int nextSt;
        int best=opt;
        if(toVisit.size()==1) return prevDist+dist[st][toVisit.get(0)];
        for(int k=0;k<toVisit.size();k++){
            nextSt=toVisit.remove(0);
            best=Math.min(best,search(dist, toVisit, opt, dist[st][nextSt]+prevDist, nextSt));
            toVisit.add(nextSt);
        }
        return best;
    }

    // 経路復元しない場合はこっちを使うと高速。(各nodeをresetしなくて良い。)
    static class Dijkstra{
        static int[] res;
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
                return 0;
            }
        }
        public static int[] dijkstra(Node nodes[], int st){
            return dijkstra(nodes, st, -1);
        }   
        public static int[] dijkstra(Node nodes[], int st, int ed){
            res=new int[nodes.length];
            DistanceComparator dc=new DistanceComparator(false);
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>(dc);
            for(Node n:nodes){
                pq.add(n.id);
                res[n.id]=Integer.MAX_VALUE;
            }
            dc.resInitialized=true;
            pq.remove(st);
            res[st]=0;
            pq.add(st);
            int seeing, next;
            int newValue;
            while(pq.size()>0){
                seeing=pq.poll();           
                if(res[seeing]==Integer.MAX_VALUE) return res;
                if(seeing==ed) return res;               
                for(Edge e:nodes[seeing].edges){
                    newValue=res[seeing]+e.cost;
                    next=e.id;
                    if(newValue<res[next]){
                        if(pq.remove(next)){
                            res[next]=newValue;
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
        int cost;
        public Edge(int id, int cost){
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