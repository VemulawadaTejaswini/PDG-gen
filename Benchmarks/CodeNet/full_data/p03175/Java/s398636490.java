import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        SolP sol = new SolP(n);
        while(n-- > 1)
            sol.ae(sc.scanInt(), sc.scanInt());
        sol.sol();
    }
}

class SolP {
    int n;
    int mod = 1000000007;
    ArrayList<Integer>[] adj;
    int[][] dp;
    
    SolP(int n){
        this.n = n;
        adj = new ArrayList[n+1];
        // 0 = black, 1 = white
        dp = new int[n+1][2];
        for(int i = 0; i <= n; ++i)
            adj[i] = new ArrayList<Integer>();
    }
    
    void ae(int i, int j){
        adj[i].add(j);
        adj[j].add(i);
    }
    
    void sol(){
        dfs(1, 0);
        System.out.println(dp[1][0] + dp[1][1]);
    }
    
    void dfs(int src, int par){
        long black = 1;
        long white = 1;
        for(int nbr : adj[src]){
            if(nbr == par)
                continue;
            dfs(nbr, src);
            black *= (dp[nbr][1]);
            if(black >= mod)
                black -= mod;
            white *= (dp[nbr][0] + dp[nbr][1]);
            if(white >= mod)
                white -= mod;
        }
        dp[src][0] = (int) black;
        dp[src][1] = (int) white;
    }
    
}

class Scan {
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Scan()
    {
        in=System.in;
    }
    public int scan()throws IOException
    {
        if(total<0)
        throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
            return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    public double scanDouble()throws IOException
    {
        double doub=0;
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n)&&n!='.')
        {
            if(n>='0'&&n<='9')
            {
                doub*=10;
                doub+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        if(n=='.')
        {
            n=scan();
            double temp=1;
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n=scan();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    }
    public String scanString()throws IOException
    {
        StringBuilder sb=new StringBuilder();
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n=scan();
        }
        return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}