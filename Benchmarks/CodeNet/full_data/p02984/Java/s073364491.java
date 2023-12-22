import java.util.*;
import java.util.function.BiFunction;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[] odd=new long[n];
        long[] even=new long[n];
        long sum=0;
        int indexO=0, indexE=0;
        for(int i=0;i<n;i++){
            long l=fsc.nextLong();
            if(i%2==0){
                even[indexE]=l;
                odd[indexE+(n-1)/2]=l;
                indexE++;
            }
            else{
                odd[indexO]=l;
                even[indexO+(n+1)/2]=l;
                indexO++;
            }
            sum+=l;
        }
        fsc.close();
        int num=n/2;
        SegmentTree sgtO=new SegmentTree(odd, 0, (u,v)->u+v);
        SegmentTree sgtE=new SegmentTree(even, 0, (u,v)->u+v);
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<=n;i++){
            if(i%2==0) sb.append(sum-2*sgtE.query(i/2,(i/2)+num)+" ");
            else sb.append(sum-2*sgtO.query(i/2, (i/2)+num)+" ");
        }
        System.out.println(sb);
    }
    static class SegmentTree{
        long[] st;
        int length;
        int level;
        
        private long id;
        private BiFunction<Long, Long, Long> pre;
        private boolean[] inited;

        public SegmentTree(long[] array, long id, BiFunction<Long, Long, Long> pre){
            this.id=id;
            this.pre=pre;
            int n=array.length;
            int l=0, r=31, m=(l+r)/2;
            while(r-l>1){
                if(n<=1l<<m) r=m;
                else l=m;
                m=l+(r-l)/2;
            }
            level=r;
            int size=1<<level;
            length=2*size-1;
            long[] ret=new long[length];
            inited=new boolean[length];
            for(int i=0;i<size;i++){
                ret[i+size-1]=i<n?array[i]:id;
                inited[i+size-1]=true;
            }
            st=ret;
            init(0);
        }
        public void update(int i, long v){
            int index=i-1+(length+1)/2;
            int parent=(index-1)/2;
            st[index]=v;
            while(index>0){
                st[parent]=pre.apply(st[parent], st[index]);
                index=parent;
                parent=(index-1)/2;
            }
        }
        private long subQuery(int a, int b, int k, int l, int r){
            if(r<=a||b<=l) return id;
            if(a<=l&&r<=b) return st[k];
            else{
                long u=subQuery(a, b, 2*k+1, l, (l+r)/2);
                long v=subQuery(a, b, 2*k+2, (l+r)/2, r);
                return pre.apply(u,v);
            }
        }
        public long query(int a, int b){
            return subQuery(a, b, 0, 0, (length+1)/2);
        }
        private long init(int i){
            if(!inited[i]){
                long ret;
                ret=pre.apply(init(2*i+1), init(2*i+2));
                inited[i]=true;
                st[i]=ret;
            }
            return st[i];
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