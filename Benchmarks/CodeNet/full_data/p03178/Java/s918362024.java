// https://atcoder.jp/contests/dp/tasks/dp_r

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        char[] k = sc.scanString().toCharArray();
        int d = sc.scanInt();
        SolS sol = new SolS(k, d);
        sol.sol();
    }
}

class SolS {
    int[][] dp;
    char[] k;
    int d, mod = 1000000007;
    long tres;
    
    SolS(char[] k, int d){
        this.k = k;
        this.d = d;
        dp = new int[d][2];
    }
    
    void sol(){
        dp[0][1] = 1;
        
        for(int st = 0, end = k.length; st < end; ++st){
            int[][] newdp = new int[d][2];
            int lim = k[st] - '0';
            for(int s = 0; s < 2; ++s){
                for(int j = 0; j < 10; ++j){
                    if(s == 1 && j > lim)
                        break;
                    for(int i = 0; i < d; ++i){
                        if(s == 0){
                            // i.e for number of solutions which are smaller than k
                            tres = newdp[(i+j)%d][0] + dp[i][0];
                            if(tres >= mod)
                                tres -= mod;
                            newdp[(i+j)%d][0] = (int) tres;         
                        }
                        else {
                            // i.e for k itself
                            if(j == lim){
                                tres = newdp[(i+j)%d][1] + dp[i][1];
                                if(tres >= mod)
                                    tres -= mod;
                                newdp[(i+j)%d][1] = (int) tres;  
                            }
                            // i.e for number of solutions which are smaller than k
                            else {
                                tres = newdp[(i+j)%d][0] + dp[i][1];
                                if(tres >= mod)
                                    tres -= mod;
                                newdp[(i+j)%d][0] = (int) tres;  
                            }
                        }
                    }
                }
            }
            dp = newdp;
        }
        long res = dp[0][0] + dp[0][1] - 1;
        if(res >= mod)
            res -= mod;
        if(res < 0)
            res += mod;
        System.out.println(res);
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
    public long scanLong()throws IOException
    {
        long integer=0;
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