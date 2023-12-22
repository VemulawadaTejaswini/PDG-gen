import java.util.*;
import java.util.function.BiFunction;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long k=fsc.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++) a[i]=fsc.nextLong()-1;
        fsc.close();
        long[] accum=new long[n+1];
        accum[0]=0;
        HashMap<Long, Integer> count=new HashMap<>();
        ArrayDeque<Long> dq=new ArrayDeque<>();
        dq.addFirst(0l);
        count.put(0l,1);
        long ans=0;
        for(int i=1;i<=n;i++){
            accum[i]=(accum[i-1]+a[i-1])%k;
            dq.addLast(accum[i]);
            
            if(i>=k-1){
                long l=dq.removeFirst();
                count.put(l, count.get(l)-1);
                ans+=count.get(l);
            }

            if(count.containsKey(accum[i])){
                count.put(accum[i], count.get(accum[i])+1);
            }
            else{
                count.put(accum[i], 1);
            }
        }
        for(long key:count.keySet()){
            int c=count.get(key);
            ans+=(c*(c-1))/2;
        }
        System.out.println(ans);
    }
    static class SegmentTree{
        private long[] segTree;
    
        int treeSize;
        int height;
        
        private int bottomSize;
        private long identityElement;
        private BiFunction<Long, Long, Long> function;
    
        public SegmentTree(long[] array, long identityElement, BiFunction<Long,Long,Long> function){
            this.identityElement=identityElement;
            this.function=function;
            int n=array.length;
            int l=0, r=31, m=(l+r)/2;
            while(r-l>1){
                if(n<=1l<<m) r=m;
                else l=m;
                m=l+(r-l)/2;
            }
            height=r;
            bottomSize=1<<height;
            treeSize=2*bottomSize-1;
            segTree=new long[treeSize];
            for(int i=0;i<bottomSize;i++){
                segTree[i+bottomSize-1]=i<n?function.apply(array[i],array[i]):identityElement;
            }
            for(int i=bottomSize-2;i>=0;i--){
                segTree[i]=function.apply(segTree[2*i+1], segTree[2*i+2]);
            }
        }
        public void update(int i, long v){
            int index=i-1+(treeSize+1)/2;
            int parent=(index-1)/2;
            segTree[index]=v;
            while(index>0){
                segTree[parent]=function.apply(segTree[parent], segTree[index]);
                index=parent;
                parent=(index-1)/2;
            }
        }
        public long query(int a, int b){
            return subQuery(a, b, 0, 0, (treeSize+1)/2);
        }
        //tree size=2^0+2^1+...+2^height=2^(height+1)-1
        public int treeSize(){
            return treeSize;
        }
        public int height(){
            return height;
        }
    
        private long subQuery(int a, int b, int k, int l, int r){
            if(r<=a||b<=l) return identityElement;
            if(a<=l&&r<=b) return segTree[k];
            else{
                long u1=subQuery(a, b, 2*k+1, l, (l+r)/2);
                long u2=subQuery(a, b, 2*k+2, (l+r)/2, r);
                return function.apply(u1,u2);
            }
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