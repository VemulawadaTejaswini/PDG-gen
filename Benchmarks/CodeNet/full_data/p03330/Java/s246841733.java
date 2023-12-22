import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt(), c=fsc.nextInt();
        int d[][]=new int[c][c];
        int color[][]=new int[n][n];
        for(int k=0;k<c;k++) for(int l=0;l<c;l++) d[k][l]=fsc.nextInt();
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) color[i][j]=fsc.nextInt()-1;
        fsc.close();
        int count[][]=new int[3][c];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) count[(i+j)%3][color[i][j]]++;
        int cost=0;
        int opt=Integer.MAX_VALUE;
        int[] changed=new int[3];
        for(changed[0]=0;changed[0]<c;changed[0]++){
            for(changed[1]=0;changed[1]<c;changed[1]++){
                if(changed[1]==changed[0]) continue;
                for(changed[2]=0;changed[2]<c;changed[2]++){
                    if(changed[2]==changed[1]||changed[2]==changed[0]) continue;
                    for(int r=0;r<3;r++){
                        for(int defC=0;defC<c;defC++){
                            cost+=d[defC][changed[r]]*count[r][defC];
                        }
                    }
                    opt=Math.min(opt, cost);
                    cost=0;
                }
            }
        }
        System.out.println(opt);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
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
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
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