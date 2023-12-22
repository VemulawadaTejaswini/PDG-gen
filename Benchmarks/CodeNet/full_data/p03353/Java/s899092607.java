import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        String s=fsc.next();
        int k=fsc.nextInt();
        fsc.close();
        int n=s.length();
        int l=(n*(n+1))/2;
        String[] sub=new String[l];
        int index=0;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n;j++){
                sub[index++]=s.substring(i, j);
            }
        }
        String[] min5=new String[5];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++) sb.append('z');
        String max=sb.toString();
        for(int i=0;i<5;i++) min5[i]=max;
        Out:for(int i=0;i<l;i++){
            for(int j=0;j<5;j++){
                if(sub[i].equals(min5[j])){
                    continue Out;
                }
            }
            if(sub[i].compareTo(min5[0])<0){
                min5[4]=min5[3];
                min5[3]=min5[2];
                min5[2]=min5[1];
                min5[1]=min5[0];
                min5[0]=sub[i];
            }
            else if(sub[i].compareTo(min5[1])<0){
                min5[4]=min5[3];
                min5[3]=min5[2];
                min5[2]=min5[1];
                min5[1]=sub[i];
            }
            else if(sub[i].compareTo(min5[2])<0){
                min5[4]=min5[3];
                min5[3]=min5[2];
                min5[2]=sub[i];
            }
            else if(sub[i].compareTo(min5[3])<0){
                min5[4]=min5[3];
                min5[3]=sub[i];
            }
            else if(sub[i].compareTo(min5[4])<0){
                min5[4]=sub[i];
            }
        }
        //for(int i=0;i<5;i++) System.out.println(min5[i]);
        System.out.println(min5[k-1]);
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
