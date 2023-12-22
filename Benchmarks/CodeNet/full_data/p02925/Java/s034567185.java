
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
        int[][] a = new int[n][n-1];

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                a[i][j] = fs.nextInt()-1;
            }
        }
        int[] aIdx = new int[n];
        boolean[] isDecided = new boolean[n];
        int res = 0,count = 0;;
        boolean ok;
        int tmp;
        while(count < (n-1)*n/2){
            Arrays.fill(isDecided,false);
            ok = false;
            for(int i=0;i<n;i++){
                if(isDecided[i] || aIdx[i] == n-1)continue;
                tmp = a[i][aIdx[i]];
                if(aIdx[tmp] == n-1 || isDecided[tmp])continue;
                if(i == a[tmp][aIdx[tmp]]){
                    aIdx[i]++;
                    aIdx[tmp]++;
                    ok = true;
                    isDecided[i] = true;
                    isDecided[tmp] = true;
                    count++;
                }
            }
            if(!ok){
                System.out.println(-1);
                return;
            }else{
                res++;
            }
        }
        System.out.println(res);
    }
}