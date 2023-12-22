import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] a = new int[n];
        int[][] x = new int[n][];
        int[][] y = new int[n][];
        for(int i=0;i<n;i++){
            a[i] = fs.nextInt();
            x[i] = new int[a[i]];
            y[i] = new int[a[i]];
            for(int j=0;j<a[i];j++){
                x[i][j] = fs.nextInt()-1;
                y[i][j] = fs.nextInt();
            }
        }
        int max = 0;
        boolean flag;
        for(int i=1;i<1<<n;i++){
            flag = true;
            outer:for(int j=0;j<n;j++){
                int an = a[j];
                for(int k=0;k<an;k++){
                    if(((i>>j)&1)==1){
                        if(((i>>x[j][k])&1)!=y[j][k]){
                            flag = false;
                            break outer;
                        }
                    }else{
                        if(((i>>x[j][k])&1)==y[j][k]){
                            flag = false;
                            break outer;
                        }
                    }
                }
            }
            if(flag){
                int count = 0;
                for(int j=0;j<n;j++){
                    if(((i>>j)&1)==1){
                        count++;
                    }
                }
                max = Math.max(max,count);
            }
        }
        System.out.println(max);
    }
    static class FastScanner{
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte(){
            if(ptr < buflen){
                return true;
            }else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen <= 0){
                    return false;
                }
            }
            return true;
        }

        private int readByte(){
            if(hasNextByte())return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c){
            return 33<=c && c<=126;
        }

        public boolean hasNext(){
            while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
            return hasNextByte();
        }

        public String next(){
            if(!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)){
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong(){
            if(!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if(b == '-'){
                minus = true;
                b = readByte();
            }
            if(b < '0' || '9' < b){
                throw new NumberFormatException();
            }
            while(true){
                if('0' <= b && b<='9'){
                    n*=10;
                    n+=b-'0';
                }else if(b==-1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt(){
            long nl = nextLong();
            if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
            return (int)nl;
        }
        public double nextDouble(){return Double.parseDouble(next());}
    }
}