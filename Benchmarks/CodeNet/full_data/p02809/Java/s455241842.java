import java.util.*;
import java.util.function.BiFunction;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[] ng=new int[n+1];
        int[] hated=new int[n+1];
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i<=n;i++){
            ng[i]=fsc.nextInt();
            hated[ng[i]]++;
            set.add(i);
        }
        if(n==2){
            System.out.println(-1);
            return;
        }
        SegmentTree max=new SegmentTree(hated, 0, (u, v)->u>v?u:v);
        fsc.close();
        int[] ans=new int[n];
        int ngl=0;
        if(n>3){
            if(max.query(0, n)==n-1){
                ans[0]=max.find(n-1);
                set.remove(ans[0]);
            } else{
                ans[0]=set.pollFirst();
            }
            hated[ng[ans[0]]]--;
            max.update(ng[ans[0]], hated[ng[ans[0]]]);
            for(int i=1;i<n-3;i++){
                if(max.query(0, n)==n-i-1){
                    ans[i]=max.find(n-i-1);
                    if(ans[i]==ng[ans[i-1]]){
                        System.out.println(-1);
                        return;
                    } else{
                        set.remove(ans[i]);
                    }
                } else{
                    int f=set.pollFirst();
                    if(f==ng[ans[i-1]]){
                        ans[i]=set.pollFirst();
                        set.add(f);
                    } else{
                        ans[i]=f;
                    }
                }
                hated[ng[ans[i]]]--;
                max.update(ng[ans[i]], hated[ng[ans[i]]]);
            }
            ngl=ng[ans[n-4]];
        }
        int size=set.size();
        int[] rest=new int[size];
        for(int r=0;r<size;r++){
            rest[r]=set.pollFirst();
        }
        W:while(true){
            for(int i=0;i<size;i++){
                if((i>0?ng[rest[i-1]]:ngl)==rest[i]){
                    if(Objects.isNull(nextPermutation(rest))){
                        System.out.println(-1);
                        return;
                    }
                    continue W;
                }
            }
            for(int i=0;i<size;i++){
                ans[n-3+i]=rest[i];
            }
            break;
        }
        for(int a:ans){
            System.out.print(a+" ");
        }
        System.out.print("\n");
    }

    static int[] nextPermutation(int[] a){
        int n=a.length;
        for(int i=n-1;i>=1;i--){
            if(a[i]>a[i-1]){
                int fail=n, pass=i;
                while(fail-pass>1){
                    int mid=pass+(fail-pass)/2;
                    if(a[mid]>a[i-1]) pass=mid;
                    else fail=mid;
                }
                int tmp=a[pass];
                a[pass]=a[i-1];
                a[i-1]=tmp;
                reverse(a, i, n);
                return a;
            }
        }
        return null;
    }

    static void reverse(int[] a, int begin, int end){
        for(int i=begin;i<begin+(end-begin)/2;i++){
            int tmp=a[i];
            a[i]=a[begin+end-i-1];
            a[begin+end-i-1]=tmp;
        }
    }
    static void reverse(int[] a){
        reverse(a, 0, a.length);
    }

    static class SegmentTree{
        private int[] segTree;
    
        int treeSize;
        int height;
        
        private int bottomSize;
        private int identityElement;
        private BiFunction<Integer, Integer, Integer> function;
    
        public SegmentTree(int[] array, int identityElement, BiFunction<Integer,Integer,Integer> function){
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
            segTree=new int[treeSize];
            for(int i=0;i<bottomSize;i++){
                segTree[i+bottomSize-1]=i<n?function.apply(array[i],array[i]):identityElement;
            }
            for(int i=bottomSize-2;i>=0;i--){
                segTree[i]=function.apply(segTree[2*i+1], segTree[2*i+2]);
            }
        }
        public void update(int i, int v){
            int index=i-1+(treeSize+1)/2;
            int parent=(index-1)/2;
            segTree[index]=v;
            while(index>0){
                segTree[parent]=function.apply(segTree[parent], segTree[index]);
                index=parent;
                parent=(index-1)/2;
            }
        }
        public int query(int a, int b){
            return subQuery(a, b, 0, 0, (treeSize+1)/2);
        }
        //tree size=2^0+2^1+...+2^height=2^(height+1)-1
        public int treeSize(){
            return treeSize;
        }
        public int height(){
            return height;
        }

        public int find(int m){
            return find(m ,0);
        }

        private int find(int m, int k){
            if(isBottom(k)){
                return k-bottomSize+1;
            }
            if(segTree[2*k+1]==m){
                return find(m, 2*k+1);
            } else{
                return find(m, 2*k+2);
            }
        }

        private boolean isBottom(int k){
            return k>=bottomSize-1;
        }
    
        private int subQuery(int a, int b, int k, int l, int r){
            if(r<=a||b<=l) return identityElement;
            if(a<=l&&r<=b) return segTree[k];
            else{
                int u1=subQuery(a, b, 2*k+1, l, (l+r)/2);
                int u2=subQuery(a, b, 2*k+2, (l+r)/2, r);
                return segTree[k]=function.apply(u1,u2);
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
