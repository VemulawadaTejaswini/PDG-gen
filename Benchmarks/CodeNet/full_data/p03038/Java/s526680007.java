import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i] = fs.nextInt();
        }
        
        Arrays.sort(a);
        int[] b= new int[m];
        int[] c = new int[m];
        Map<Integer,Integer> map = new HashMap<>();
        Integer temp;
        for(int i=0;i<m;i++){
            b[i] = fs.nextInt();
            c[i] = fs.nextInt();
            temp = map.get(c[i]);
            if(temp == null){
                map.put(c[i],b[i]);
            }else{
                map.replace(c[i],temp+b[i]);
            }
        }
        Arrays.sort(c);
        long sum = 0;
        int aidx = n-1;
        int cidx = m-1;
        for(int i=0;i<n;i++){
            temp = map.get(c[cidx]);
            while(cidx >=0 && map.get(c[cidx])==0){
                cidx--;
            }
            if(cidx < 0){
                sum+=a[aidx--];
            }else if(a[aidx] > c[cidx] ){
                sum+=a[aidx--];
            }else{
                sum+=c[cidx];
                temp = map.get(c[cidx]);
                map.replace(c[cidx],temp-1);
            }
        }
        System.out.println(sum);
    }
}

