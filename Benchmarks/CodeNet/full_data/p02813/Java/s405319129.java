import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int[] p=new int[n];
        int[] q=new int[n];
        boolean cmp=false;
        boolean pleq=false;
        for(int i=0;i<n;p[i++]=fsc.nextInt());
        for(int i=0;i<n;i++){
            q[i]=fsc.nextInt();
            if(!cmp){
                if(p[i]==q[i]){
                    continue;
                } else if(p[i]<q[i]){
                    pleq=true;
                } else if(p[i]>q[i]){
                    pleq=false;
                }
                cmp=true;
            }
        }
        if(!cmp){
            System.out.println(0);
            return;
        }
        int cnt=0;
        while(true){
            cnt++;
            if(pleq && Arrays.equals(nextPermutation(p), q)){
                System.out.println(cnt);
                return;
            } else if(!pleq && Arrays.equals(nextPermutation(q), p)){
                System.out.println(cnt);
                return;
            }
        }
        // ArrayList<Integer> p=new ArrayList<>();
        // ArrayList<Integer> q=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     p.add(fsc.nextInt());
        // }
        // for(int i=0;i<n;i++){
        //     q.add(fsc.nextInt());
        // }
        // fsc.close();
        // ArrayList<Integer> rest1=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     rest1.add(i);
        // }
        // ArrayList<Integer> rest2=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     rest2.add(i);
        // }
        // int pnum=order(p, rest1);
        // int qnum=order(q, rest2);
        // System.out.println(Math.abs(qnum-pnum));
    }

    static int[] nextPermutation(int[] a){
        int n=a.length;
        for(int i=n-1;i>=1;i--){
            if(a[i]>a[i-1]){
                int fail=n, pass=i;
                while(fail-pass>1){
                    int mid=pass+(fail-pass)/2;
                    if(a[mid]>a[i-1]) pass=mid;
                    else fail=mid;
                }
                int tmp=a[pass];
                a[pass]=a[i-1];
                a[i-1]=tmp;
                for(int j=i;j<i+(n-i)/2;j++){
                    tmp=a[j];
                    a[j]=a[n+i-1-j];
                    a[n+i-1-j]=tmp;
                }
                return a;
            }
        }
        return null;
    }

    static int order(ArrayList<Integer> a, ArrayList<Integer> rest){
        if(a.isEmpty()){
            return 0;
        }
        int n=a.size();
        int p=a.get(0);
        int i=rest.indexOf(p);
        a.remove(Integer.valueOf(p));
        rest.remove(Integer.valueOf(p));
        return fact(n-1)*i+order(a, rest);
    }
    static int fact(int k){
        int ret=1;
        for(int i=2;i<=k;i++){
            ret*=i;
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
