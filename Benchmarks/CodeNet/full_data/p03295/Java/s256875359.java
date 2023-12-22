import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int m=fsc.nextInt();
        int[][] ab=new int[m][2];
        int[] req=new int[n-1];
        for(int i=0;i<m;i++){
            ab[i][0]=fsc.nextInt()-1;
            ab[i][1]=fsc.nextInt()-1;
            for(int j=ab[i][0];j<ab[i][1];j++) req[j]++;
        }
        fsc.close();
        //Arrays.sort(ab, new C());
        int res=0;
        int manyreq=-1;
        int reqno=0;
        for(int k=0;k<n-1;k++){
            System.out.println(req[k]);
        }
        while(true){
            for(int k=0;k<n-1;k++){
                if(req[k]>reqno){
                    reqno=req[k];
                    manyreq=k;
                }
            }
            if(manyreq==-1) break;
            for(int i=0;i<m;i++)
                if(ab[i][0]<=manyreq && manyreq<ab[i][1]){
                    for(int l=ab[i][0];l<ab[i][1];l++) req[l]--;
                    ab[i][0]=-1;
                    ab[i][1]=-1;
                }   
            res++;
            manyreq=-1;
            reqno=0;
            for(int k=0;k<n-1;k++){
                System.out.println(req[k]);
            }
        }
        System.out.println(res);
    }
    static class C implements Comparator<int[]>{
        @Override
        public int compare(int[] x, int[] y){
            return x[0]>y[0]?1:x[0]<y[0]?-1:0;
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