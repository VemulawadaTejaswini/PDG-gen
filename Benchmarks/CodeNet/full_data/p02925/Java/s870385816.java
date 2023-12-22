import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
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
    static List<LinkedList<Integer>> graph;
    static boolean[] isVisited ;
    static int[] longest;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[][] a = new int[n][n-1];
        graph = new ArrayList<>();
        isVisited = new boolean[n*(n-1)/2];
        longest = new int[n*(n-1)/2];
        Arrays.fill(longest,-1);
        for(int i=0;i<n*(n-1)/2;i++){
            graph.add(new LinkedList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                a[i][j] = fs.nextInt()-1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                int min1 = Math.min(i,a[i][j]);
                int max1 = Math.max(i,a[i][j]);
                int turn1 = min1*(2*n-min1-1)/2 + max1-min1-1;
                int min2 = Math.min(i,a[i][j+1]);
                int max2 = Math.max(i,a[i][j+1]);
                int turn2 = min2*(2*n-min2-1)/2 + max2-min2-1;
                graph.get(turn1).add(turn2);
            }
        }
        int max = 0;
        for(int i=0;i<n*(n-1)/2;i++){
            int dist = dfs(i);
            if(dist==-1){
                max = -2;
                break;
            }else{
                max = Math.max(max,dist);
            }
        }
        System.out.println(max+1);


    }

    public static int dfs(int v){
        if(isVisited[v])return -1;
        if(longest[v]!=-1)return longest[v];
        isVisited[v] = true;
        int res = 0;
        for(Integer i : graph.get(v)){
            int dist = dfs(i);
            if(dist==-1){
                return -1;
            }else{
                res = Math.max(res, dist+1);
            }
        }
        isVisited[v] = false;
        return longest[v] = res;
    }
}