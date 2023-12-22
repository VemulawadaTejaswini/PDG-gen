import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), m=fsc.nextInt();
        long[] a=new long[n];
        long[] revSum=new long[n];
        long[][] bc=new long[n][2];
        for(int i=0;i<n;i++) a[i]=fsc.nextLong();
        for(int j=0;j<m;j++) for(int k=0;k<2;k++) bc[j][k]=fsc.nextLong();
        fsc.close();
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--) revSum[i]=a[i]+(i<n-1?revSum[i+1]:0);
        Arrays.sort(bc,(u,v)->u[1]<v[1]?1:u[1]>v[1]?-1:u[0]<v[0]?1:-1);
        //for(int j=0;j<m;j++) for(int k=0;k<2;k++) System.out.println("bc["+j+"]["+k+"]:"+bc[j][k]);
        int st=0;
        long ans=0;
        int use=0;
        for(int j=0;j<m;j++){
            int border=binarySearch(a, bc[j][1], st);
            //System.out.println("border:"+border+", val:"+bc[j][1]);
            if(st>border) break;
            else{
                int num=Math.min(border-st+1, (int)bc[j][0]);
                use+=num;
                ans+=num*bc[j][1];
                st=Math.min(border+1,st+(int)bc[j][0]);
                //System.out.println("st:"+st);
                if(st>=n) break;
            }
        }
        if(use<n) ans+=revSum[use];
        //System.out.println("use:"+use);
        System.out.println(ans);
    }
    public static boolean isOK(long[] array, int index, long key) {
        if (array[index]<=key) return true;
        return false;
    }
    public static int binarySearch(long[] array, long key, int st){
        if(st>0) array[st-1]=0;
        int left=st-1;
        int right=array.length;
        while(right-left>1){
            int mid=left+(right-left)/2;
            if(isOK(array, mid, key)) left=mid;
            else right=mid;
        }
        return left;
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