import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
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
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }

    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c){
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
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int a = fs.nextInt();
        int b = fs.nextInt();
        int q = fs.nextInt();
        long[] s = new long[a+2];
        long[] t = new long[b+2];
        long[] x = new long[q];
        Map<Long,Integer> map = new HashMap<>();
        s[0] = t[0] = -100000000000L;
        s[a+1] = t[b+1] = 100000000000L;
        for(int i=1;i<=a;i++)s[i] = fs.nextLong();
        for(int i=1;i<=b;i++)t[i] = fs.nextLong();
        for(int i=0;i<q;i++){
            x[i] = fs.nextLong();
            map.put(x[i],i);
        }
        Arrays.sort(x);

        long[] dist = new long[q];
        int snow = 0,tnow = 0;
        long res;
        for(int i=0;i<q;i++){
            res = Long.MAX_VALUE;
            while(!(s[snow]<= x[i] && s[snow+1] > x[i]))snow++;
            while(!(t[tnow]<= x[i] && t[tnow+1] > x[i]))tnow++;
            if(s[snow] <= t[tnow]){
                if(s[snow+1] <= t[tnow+1]){
                    res = x[i] - s[snow];
                    res = Math.min(res,x[i]-t[tnow]+s[snow+1]-t[tnow]);
                    res = Math.min(res,s[snow+1] - x[i]+s[snow+1] - t[tnow]);
                    res = Math.min(res,t[tnow+1] - x[i]);
                }else{
                    res = x[i] - s[snow];
                    res = Math.min(res,s[snow+1] - x[i]);
                }
            }else if(s[snow] > t[tnow]){
                if(t[tnow+1] <= s[snow+1]){
                    res = x[i] - t[tnow];
                    res = Math.min(res,x[i]-s[snow]+t[tnow+1]-s[snow]);
                    res = Math.min(res,t[tnow+1]-x[i]+t[tnow+1]-s[snow]);
                    res = Math.min(res,s[snow+1]-x[i]);
                }else{
                    res = x[i] - t[tnow];
                    res = Math.min(res,t[tnow+1]-x[i]);
                }
            }
            dist[map.get(x[i])] = res;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            sb.append(dist[i]);
            sb.append('\n');
        }

        System.out.println(sb.toString());

    }
}