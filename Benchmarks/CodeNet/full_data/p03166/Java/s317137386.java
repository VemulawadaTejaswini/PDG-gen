import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
    static int[] dp ;
    static List<LinkedList<Integer>> graph;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        graph = new ArrayList<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0;i<n;i++)graph.add(new LinkedList<>());
        int s,t;
        for(int i=0;i<m;i++){
            s = sc.nextInt()-1;
            t = sc.nextInt()-1;
            graph.get(t).add(s);
        }

        dp = new int[n];
        Arrays.fill(dp,-1);
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,dfs(i));
        }
        System.out.println(max);
    }

    static int dfs(int v){
        if(dp[v]!=-1){
            return dp[v];
        }else{
            int res = 0;
            for(Integer i : graph.get(v)){
                res = Math.max(res,dfs(i)+1);
            }
            return dp[v] = res;
        }
    }

}
