import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        char[] ch = fs.next().toCharArray();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];
        for(int i=n;i>=1;i--){
            if(ch[i-1] == 'R'){
                a[i-1]=a[i]+1;
                b[i-1]=b[i];
                c[i-1]=c[i];
            }else if(ch[i-1]=='G'){
                a[i-1] = a[i];
                b[i-1] = b[i]+1;
                c[i-1] = c[i];
            }else{
                a[i-1] = a[i];
                b[i-1] = b[i];
                c[i-1] = c[i]+1;
            }
        }

        char chi,chj;
        long sum = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j+1<n;j++){
                chi = ch[i];
                chj = ch[j];
                if(chi=='R' ){
                    if(chj=='G'){
                        sum+=c[j+1];
                        if(j+j-i < n && ch[j+j-i] =='B'){
                            sum--;
                        }
                    }else if(chj=='B'){
                        sum+=b[j+1];
                        if(j+j-i < n && ch[j+j-i] =='G'){
                            sum--;
                        }
                    }
                }else if(chi=='G'){
                    if(chj=='R'){
                        sum+=c[j+1];
                        if(j+j-i < n && ch[j+j-i] =='B'){
                            sum--;
                        }
                    }else if(chj=='B'){
                        sum+=a[j+1];
                        if(j+j-i < n && ch[j+j-i] =='R'){
                            sum--;
                        }
                    }
                }else {//B
                    if(chj=='R'){
                        sum+=b[j+1];
                        if(j+j-i < n && ch[j+j-i] =='G'){
                            sum--;
                        }
                    }else if(chj=='G'){
                        sum+=a[j+1];
                        if(j+j-i < n && ch[j+j-i] =='R'){
                            sum--;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
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