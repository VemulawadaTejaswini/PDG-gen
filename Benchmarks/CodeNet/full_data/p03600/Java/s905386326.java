import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long[][] a=new long[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) a[i][j]=fsc.nextLong();
        fsc.close();
        HashSet<Long>[] rowset=new HashSet[n];
        // for(int i=0;i<n;i++){
        //     rowset[i]=new HashSet<>();
        //     for(int j=0;j<n;j++){
        //         if(i==j) continue;
        //         rowset[i].add(a[i][j]);
        //     }
        // }
        boolean[][] keep=new boolean[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) keep[i][j]=i!=j;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                for(int k=0;k<n;k++){
                    if(k!=j && a[i][j]==a[i][k]+a[k][j]){
                        keep[i][j]=false;
                        keep[j][i]=false;
                        break;
                    }
                }
            }
        }
        long[][] wf=new long[n][n];
        long max=100_000_000_000_000_000l;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) wf[i][j]=0;
                else if(keep[i][j]) wf[i][j]=a[i][j];
                else wf[i][j]=max;
            }
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(wf[i][k]+wf[k][j]<wf[i][j]){
                        wf[i][j]=wf[i][k]+wf[k][j];
                    }
                }
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(wf[i][j]!=a[i][j]){
                    System.out.println(-1);
                    return;
                }
                else if(keep[i][j] && i<j) ans+=a[i][j];
            }
        }
        System.out.println(ans);
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
