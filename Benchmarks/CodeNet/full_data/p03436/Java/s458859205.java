import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt();
        int w=fsc.nextInt();
        Node nodes[]=new Node[h*w];
        long whites=0;
        String line;
        char[] cs;
        for(int i=0;i<h;i++){
        line=fsc.next();
        cs=line.toCharArray();
            for(int j=0;j<w;j++){
                if(cs[j]=='.'){
                    nodes[i*w+j]=new Node(i*w+j,0);
                    whites++;
                    if(i>0 && nodes[(i-1)*w+j].color==0){
                        nodes[i*w+j].edges.add(new Edge((i-1)*w+j,1));
                        nodes[(i-1)*w+j].edges.add(new Edge(i*w+j,1));
                    }
                    if(j>0 && nodes[i*w+j-1].color==0){
                        nodes[i*w+j].edges.add(new Edge(i*w+j-1,1));
                        nodes[i*w+j-1].edges.add(new Edge(i*w+j,1));
                    }
                }
                else{
                    nodes[i*w+j]=new Node(i*w+j,1);
                }
            }
        }
        fsc.close();

        HashSet<Integer> visited=new HashSet<Integer>();
        ArrayList<Integer> queue=new ArrayList<Integer>();
        visited.add(0);
        queue.add(0);
        nodes[0].value=0;
        int node;
        boolean loop=true;
        while(loop){
            if(queue.size()==0) break;
            node=queue.remove(0);
            for(Edge e:nodes[node].edges){
                if(!visited.contains(e.id)&&!queue.contains(e.id)){
                    queue.add(e.id);
                    visited.add(e.id);
                    nodes[e.id].value=nodes[node].value+1;
                }
                if(e.id==h*w-1) loop=false;
            }
        }
        // long uses=Dijkstra.dijkstra(nodes, 0)[h*w-1]+1;
        // if(uses<0) System.out.println(-1);
        // else System.out.println(whites-uses);
        System.out.println(nodes[h*w-1].value<Integer.MAX_VALUE?whites-nodes[h*w-1].value-1:-1);
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
                return 0;
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
        int color;
        int value;
        ArrayList<Edge> edges;
        public Node(int id, int color){
            this.id=id;
            this.color=color;
            this.value=Integer.MAX_VALUE;
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