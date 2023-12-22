import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        Node[] nodes=new Node[(n*(n-1))/2];
        for(int k=0;k<nodes.length;k++) nodes[k]=new Node(k);
        for(int i=0;i<n;i++){
            int pre=-1;
            for(int j=0;j<n-1;j++){
                int k=fsc.nextInt()-1;
                int small=Math.min(i, k);
                int pl=Math.max(i, k)-(small+1);
                int st=(small*(2*n-small-1))/2;
                if(j>0){
                    nodes[pre].edges.add(st+pl);
                    nodes[st+pl].in++;
                }
                pre=st+pl;
            }
        }
        //for(Node node:nodes) for(Edge e:node.edges) System.out.println(node.id+", "+e.id);       
        fsc.close();
        int ans=shortest(nodes);
        System.out.println(ans);
    }
    static int shortest(Node[] nodes){
        int n=nodes.length;
        int ret=0;
        IntQueue zeros=new IntQueue(3*n);
        for(Node node:nodes) if(node.in==0) zeros.add(node.id);
        int num=zeros.size();
        while(zeros.size()>0){
            int size=zeros.size();
            while(size>0){
                int v=zeros.poll();
                size--;
                for(Integer u:nodes[v].edges){
                    nodes[u].in--;
                    if(nodes[u].in==0){
                        zeros.add(u);
                        num++;
                    }
                }
            }
            ret++;
        }
        if(num<n) return -1;
        return ret;
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
            if (size == 0){
                try{throw new Exception("no elements.");}
                catch (Exception e){e.printStackTrace();}
            }
            size--;
            return a[head++];
        }
        public int size(){
            return size;
        }
        public void init(){
            tail=0;
            size=0;
        }
    }
    static class Node{
        int id;
        int in;
        ArrayList<Integer> edges;
        public Node(int id){
            this.id=id;
            edges=new ArrayList<Integer>();
            this.in=0;
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