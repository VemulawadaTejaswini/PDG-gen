import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int max=800;
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt(), w=fsc.nextInt();
        int k=fsc.nextInt();
        boolean[][] a=new boolean[h][w];
        int sy=1, sx=-1;
        for(int i=0;i<h;i++){
            char[] row=fsc.next().toCharArray();
            for(int j=0;j<w;j++){
                a[i][j]=row[j]=='.'||row[j]=='S';
                if(row[j]=='S'){
                    sy=i;
                    sx=j;
                }
            }
        }
        fsc.close();
        int[][] d=new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                d[i][j]=-1;
            }
        }
        int min=min(sy, h-1-sy, sx, w-1-sx);
        d[sy][sx]=0;
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.add(sy*max+sx);
        int[] dx={-1, 0, 1, 0};
        int[] dy={0, -1, 0, 1};
        while(!dq.isEmpty()){
            int now=dq.removeFirst();
            int r=now/max;
            int c=now%max;
            if(d[r][c]==k){
                break;
            }
            for(int dir=0;dir<4;dir++){
                int y=r+dy[dir];
                int x=c+dx[dir];
                if(y>=0 && y<=h-1 && x>=0 && x<=w-1){
                    if(a[y][x] && d[y][x]<0){
                        d[y][x]=d[r][c]+1;
                        min=min(min, y, h-1-y, x, w-1-x);
                        if(y==0 || y==h-1 || x==0 || x==h-1){
                            System.out.println(1);
                            return;
                        }
                        dq.add(y*max+x);
                    }
                }
            }
        }
        System.out.println(1+(min+k-1)/k);
    }
    static int min(int u, int... v){
        int ret=u;
        for(int e:v){
           ret=Math.min(ret, e);
        }
        return ret;
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
