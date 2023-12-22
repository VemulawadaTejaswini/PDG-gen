import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=fsc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=fsc.nextInt();
        }
        fsc.close();
        int max=Integer.MAX_VALUE;
        int min=max;
        L:for(int i=0;i<(1<<n);i++){
            boolean[] slcta=new boolean[n];
            int[] ac=a.clone();
            int[] bc=b.clone();
            int[] res=new int[n];
            for(int bit=0;bit<n;bit++){
                slcta[bit]=(i&(1<<bit))!=0;
                res[bit]=slcta[bit]?a[bit]:b[bit];
            }
            Arrays.sort(res);
            int cnt=0;
            boolean[] rev=new boolean[n];
            for(int j=0;j<n;j++){
                boolean ok=false;
                if(slcta[j]){
                    for(int k=j;k<n;k++){
                        if((!rev[k] && ac[k]==res[j] && (k-j)%2==0) || 
                            (rev[k] && bc[k]==res[j] && (k-j)%2==1)){
                            ok=true;
                            for(int l=k;l>=j+1;l--){
                                int tmp1=ac[l];
                                ac[l]=bc[l-1];
                                bc[k-1]=tmp1;
                                int tmp2=ac[l-1];
                                ac[l-1]=bc[l];
                                bc[l]=tmp2;
                                cnt++;
                                boolean tmp3=rev[l];
                                rev[l]=!rev[l-1];
                                rev[l-1]=!tmp3;
                            }
                            break;
                        }
                    }
                } else{
                    for(int k=j;k<n;k++){
                        if((!rev[k] && bc[k]==res[j] && (k-j)%2==1) || 
                            (rev[k] && ac[k]==res[j] && (k-j)%2==0)){
                            ok=true;
                            for(int l=k;l>=j+1;l--){
                                int tmp1=ac[l];
                                ac[l]=bc[l-1];
                                bc[k-1]=tmp1;
                                int tmp2=ac[l-1];
                                ac[l-1]=bc[l];
                                bc[l]=tmp2;
                                cnt++;
                                boolean tmp3=rev[l];
                                rev[l]=!rev[l-1];
                                rev[l-1]=!tmp3;
                            }
                            break;
                        }
                    }
                }
                if(!ok){
                    continue L;
                }
            }
            min=Math.min(min, cnt);
        }
        System.out.println(min<max?min:-1);
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
