import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        double[][] lines=new double[n][3];
        PriorityQueue<Double> pqx=new PriorityQueue<>(n*(n-1)/4+1);
        PriorityQueue<Double> pqy=new PriorityQueue<>(n*(n-1)/4+1);
        for(int i=0;i<n;i++){
            lines[i][0]=fsc.nextInt();
            lines[i][1]=fsc.nextInt();
            lines[i][2]=-fsc.nextInt();
        }
        fsc.close();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int indx=i*(n-1)-i*(i-1)/2+j-(i+1);
                double p =lines[i][0]*lines[j][1]-lines[j][0]*lines[i][1];
                double qx=lines[i][1]*lines[j][2]-lines[j][1]*lines[i][2];
                double qy=lines[j][0]*lines[i][2]-lines[i][0]*lines[j][2];
                pqx.add(qx/p);
                pqy.add(qy/p);
                if(indx>n*(n-1)/4){
                    pqx.poll();
                    pqy.poll();
                }
            }
        }
        double ax, ay;
        ax=pqx.poll();
        ay=pqy.poll();
        System.out.println(ax+" "+ay);
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
