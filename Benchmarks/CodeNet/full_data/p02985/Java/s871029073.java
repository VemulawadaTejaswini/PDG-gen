import java.util.*;
import java.io.*;

class Main{
    static long MOD=1000000007;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), k=fsc.nextInt();
        HashSet<Integer> edges[]=new HashSet[n]; 
        for(int i=0;i<n;i++) edges[i]=new HashSet<>();
        for(int i=0;i<n-1;i++){
            int a=fsc.nextInt()-1, b=fsc.nextInt()-1;
            edges[a].add(b); edges[b].add(a);
        }
        fsc.close();
        int[] parent=new int[n];
        parent[0]=-1;
        if(edges[0].size()+1>k){
            System.out.println(0);
            return;
        }
        long ans=p(k, edges[0].size()+1);
        IntQueue q=new IntQueue(10*n);
        q.add(0);
        while(q.size()>0){
            int p=q.poll();
            for(int e:edges[p]){
                if(e==parent[p]) continue;
                parent[e]=p;
                if(edges[e].size()+1>k){
                    System.out.println(0);
                    return;
                }
                ans*=p(k-2, edges[e].size()-1);
                ans%=MOD;
                //System.out.println("ans:"+ans+" p:"+p);
                q.add(e);
            }
        }
        System.out.println(ans);
    }
    static long p(int k, int r){
        long res=1;
        for(int i=0;i<r;i++) res=(res*(k-i))%MOD;
        return res;
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