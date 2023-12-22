
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
    static int n,m;
    static List<LinkedList<Integer>> graph;
    static int[] dist;
    static boolean[] finished;
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        n = fs.nextInt();
        m = fs.nextInt();
        graph = new ArrayList<>();
        dist = new int[n];
        finished = new boolean[n];
        for(int i=0;i<n;i++){
            graph.add(new LinkedList<>());
            dist[i] = -1;
        }
        Integer s,t;
        for(int i=0;i<m;i++){
            s = fs.nextInt()-1;
            t = fs.nextInt()-1;
            graph.get(s).add(t);
        }
        s = fs.nextInt()-1;
        t = fs.nextInt()-1;
        dfs(s,0);
        if(dist[t]==-1){
            System.out.println(-1);
        }else{
            System.out.println(dist[t]/3);
        }
        
    }

    public static void dfs(int v,int count){
        if(dist[v]!=-1 && dist[v] <= count && count%3==0){
            return ;
        }
        if((count%3==0) && (dist[v]==-1 || dist[v] > count)){
            dist[v] = count;
        }


        for(Integer i: graph.get(v)){
            dfs(i,count+1);
        }
        finished[v] = true;
        
    }
}