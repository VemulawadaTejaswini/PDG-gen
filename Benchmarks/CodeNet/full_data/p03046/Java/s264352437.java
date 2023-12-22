
import java.util.StringJoiner;
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
        int m = fs.nextInt();
        int k = fs.nextInt();
        int[] pair = new int[1<<m];

        if(m==0 && k==0){
            System.out.println("0 0");
            return;
        }
        if(k>= (1<<m)){
            System.out.println(-1);
            return;
        }

        for(int i=0;i<1<<m;i++){
            pair[i] = k^i;
        }
        boolean[] used = new boolean[1<<m];
        int idx = 0;
        int[] num = new int[2];
        int[] numPair = new int[2];
        StringJoiner sj = new StringJoiner(" ");
        int len = 0;
        while(len < (1<<m+1)){
            int count = 0;
            while(count < 2){
                while(idx < 1<<m && used[idx])idx++;
                if(idx == 1<<m){
                    System.out.println(-1);
                    return;
                }
                num[count] = idx;
                numPair[count] = pair[idx];
                used[idx] = used[pair[idx]] = true;
                count++;
                idx++;
            }
            if(m==1 || k==0){
                sj.add(String.valueOf(num[0]));
                sj.add(String.valueOf(num[1]));
                sj.add(String.valueOf(numPair[1]));
                sj.add(String.valueOf(num[0]));
                len+=4;
            }else{
                sj.add(String.valueOf(num[0]));
                sj.add(String.valueOf(num[1]));
                sj.add(String.valueOf(numPair[1]));
                sj.add(String.valueOf(num[0]));
                sj.add(String.valueOf(numPair[0]));
                sj.add(String.valueOf(numPair[1]));
                sj.add(String.valueOf(num[1]));
                sj.add(String.valueOf(numPair[0]));
                len+=8;
            }
            
        }
        System.out.println(sj.toString());
    }
    
}