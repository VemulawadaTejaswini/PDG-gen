
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int k = fs.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            a[i] = fs.nextInt();
            sum+=a[i];
        }
        List<Integer> divisors = makeDivisors(sum);
        Integer[] mod = new Integer[n];
        int res = 0;
        for(int i=0;i<divisors.size();i++){
            int div = divisors.get(i);
            for(int j=0;j<n;j++)mod[j] = a[j]%div;
            Arrays.sort(mod,Collections.reverseOrder());
            int left = 0;
            int right = n-1;
            int count = 0;
            int Lrequire = 0;
            while(left < right){
                Lrequire = (div-mod[left]);
                count+=Lrequire;
                while(Lrequire > 0 && left < right){
                    int Rrequire = Math.min(Lrequire,mod[right]);
                    Lrequire-=Rrequire;
                    mod[right]-=Rrequire;
                    if(mod[right]==0){
                        right--;
                    }
                }
                left++;
            }
            if(count<=k){
                res = Math.max(res,div);
            }
        }
        System.out.println(res);
    }   
    public static List<Integer> makeDivisors(long n){
        List<Integer> divisors = new ArrayList<>();
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                divisors.add((int)i);
                if(n/i!=i){
                    divisors.add((int)(n/i));
                }
            }
        }
        return divisors;
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