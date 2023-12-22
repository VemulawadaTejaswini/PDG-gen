import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        int d = sc.scanInt();
        int a = sc.scanInt();
        
        Monster[] mons = new Monster[n];
        long[] dp = new long[n+1];
        
        for(int i= 0;i < n; ++i){
            mons[i] = new Monster(sc.scanInt(), sc.scanInt());
        }
        Arrays.sort(mons);
        
        long ans = 0;
        for(int i = 0; i < n; ++i){
            Monster curr = mons[i];
            long damage = dp[i];
            long rh = curr.h - damage;
            if(rh > 0){
                long need = (rh+a-1)/a;
                ans += need;
                // bsearch for monster index whose 'x' is > [curr.x + 2*d]
                int j = i;
                for(; j < n && mons[j].x <= (curr.x + 2*d); ++j);
                dp[i] += (need*a);
                dp[j] -= (need*a);
            }
            dp[i+1] += dp[i];
        }
        System.out.println(ans);
    }
}

class Monster implements Comparable<Monster>{
    int x, h;
    
    Monster(int x, int h){
        this.x = x;
        this.h = h;
    }
    
    public int compareTo(Monster other){
        if(this.x < other.x)
            return -1;
        if(this.x > other.x)
            return 1;
        return 0;
    }
    
    public String toString(){
        return x + " : " + h;
    }
}

class Scan
{
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