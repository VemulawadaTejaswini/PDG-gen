import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int h=fsc.nextInt(), w=fsc.nextInt();
        boolean[][] a=new boolean[h][w];
        for(int i=0;i<h;i++) for(int j=0;j<w;j++) a[i][j]=fsc.nextInt()%2==0;
        fsc.close();
        StringBuilder sb=new StringBuilder("");
        int move=0;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(!a[i][j]){
                    if(j!=w-1){
                        sb.append(i+" "+j+" "+i+" "+(j+1)+"\n");
                        a[i][j+1]=!a[i][j+1];
                        move++;
                    }
                    else{
                        if(i!=h-1){
                            sb.append(i+" "+j+" "+(i+1)+" "+j+"\n");
                            a[i+1][j]=!a[i+1][j];
                            move++;
                        }
                        else a[i][j]=!a[i][j];
                    }
                    a[i][j]=!a[i][j];
                }
            }
        }
        System.out.println(move);
        System.out.println(sb);
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