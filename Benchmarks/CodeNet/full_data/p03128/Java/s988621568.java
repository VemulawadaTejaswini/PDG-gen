import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
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
        int n = fs.nextInt();
        int m = fs.nextInt();
        int[] a = new int[m];
        int[] match = {0,2,5,5,4,5,6,3,7,6};
        int inf = -1000000000;
        for(int i=0;i<m;i++){
            a[i] = -fs.nextInt();
        }

        Arrays.sort(a);

        int[] dp = new int[n+1];
        int prev;
        for(int i=1;i<=n;i++){
            dp[i] = inf;
            for(int j=0;j<m;j++){
                prev = i-match[-a[j]];
                if(prev>=0 && dp[prev]!=inf){
                    dp[i] = Math.max(dp[i],dp[prev] + 1);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i=n;i>0;){
            for(int j=0;j<m;j++){
                if(i-match[-a[j]]<0)continue;
                if(dp[i]-dp[i-match[-a[j]]]==1){
                    sb.append(-a[j]);
                    i-=match[-a[j]];
                    break;
                }
            }
        }
        System.out.println(sb.toString());
        



    }
    
}