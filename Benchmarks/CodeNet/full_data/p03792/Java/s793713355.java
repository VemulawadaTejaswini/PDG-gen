import java.util.*;
import java.io.*;

class Main{
    /* hack case

        4
        #...
        ....
        ##.#
        ....
    
        ans = 6.
        out = 7.
    */
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        boolean[][] a=new boolean[n][n];
        int[] white=new int[n];
        boolean[] exb=new boolean[n];
        boolean ex=false;
        for(int i=0;i<n;i++){
            char[] row=fsc.next().toCharArray();
            for(int j=0;j<n;j++){
                a[i][j]=row[j]=='#';
                if(a[i][j]){
                    exb[j]=true;
                    ex=true;
                } else{
                    white[i]++;
                }
            }
        }
        fsc.close();
        if(!ex){
            System.out.println(-1);
            return;
        }
        PriorityQueue<Integer> wpq=new PriorityQueue<>((u, v)->{
            if(exb[u] && exb[v]){
                return white[u]-white[v];
            } else if(exb[u]){
                return white[u]-(white[v]+1);
            } else if(exb[v]){
                return (white[u]+1)-white[v];
            } else{
                return (white[u]+1)-(white[v]+1);
            }
        });
        for(int i=0;i<n;i++){
            wpq.add(i);
        }
        int ans=0;
        L:for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(!a[i][j]){
                    ans++;
                    continue L;
                }
            }
        }
        int r=wpq.poll();
        if(!exb[r]){
            ans++;
        }
        ans+=white[r];
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
