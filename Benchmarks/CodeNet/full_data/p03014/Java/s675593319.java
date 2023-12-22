import java.util.*;
import java.io.*;

public class Main {
    public static final long MOD = 1000000007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        Integer a=0,b=0,c=0,i,j,k,n=0,m=0,h=0,w=0,ans=0;
        List<Integer> l = new ArrayList<>();
        List<String> s = new ArrayList<>();

        h=sc.nextInt();
        w=sc.nextInt();

        for(i=0;i<h;i++){
            s.add(sc.next());
        }

        int[][] yoko = new int[h][w];
        int[][] tate = new int[h][w];

        for(i=0;i<h;i++){
            String tmp=s.get(i);

            k=0;
            for(j=0;j<w;j++){
                if(tmp.charAt(j)=='.'){
                    ++k;
                }else{
                    k=0;
                }
                yoko[i][j]=k;
            }

            k=0;
            for(j=w-1;j>=0;j--){
                if(tmp.charAt(j)=='.'){
                    k=Math.max(k,yoko[i][j]);
                }else{
                    k=0;
                }
                yoko[i][j]=k;
            }
        }

        for(j=0;j<w;j++){
            k=0;
            for(i=0;i<h;i++){
                String tmp=s.get(i);
                if(tmp.charAt(j)=='.'){
                    ++k;
                }else{
                    k=0;
                }
                tate[i][j]=k;
            }

            k=0;
            for(i=h-1;i>=0;i--){
                String tmp=s.get(i);
                if(tmp.charAt(j)=='.'){
                    k=Math.max(k,tate[i][j]);
                }else{
                    k=0;
                }
                tate[i][j]=k;
            }
        }

        for(i=0;i<h;i++){
            for(j=0;j<w;j++){
                n=Math.max(n,yoko[i][j]+tate[i][j]-1);
            }
        }

        print(n);
        
        out.flush();
    }

private static void print(Object o) {
        System.out.println(o.toString());
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
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
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}