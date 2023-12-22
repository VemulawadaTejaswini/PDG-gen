import java.io.*;
import java.util.*;

class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int n = sc.scanInt();
        int[] arr = new int[n];
        int[] factors = new int[1000000];
        int cnt = 0;
        for(int k = 0; k < n; ++k){
            int val = sc.scanInt();
            arr[k] = val;
            // compute factors
            for(long i = 2; i*i <= val; ++i){
                cnt = 0;
                while(val%i==0){
                    val/=i;
                    ++cnt;
                }
                if(cnt > factors[(int)i])
                    factors[(int)i] = cnt;
            }
            if(val > 1)
                factors[val] = Math.max(factors[val], 1);
        }
        // get lcm
        int lcm = 1;
        for(int i = 0; i < 1000000; ++i){
            cnt = factors[i];
            if(cnt > 0)
                lcm = modMul(lcm, modPow(i,cnt));
        }
        long res = 0;
        for(int i = 0; i < n; ++i){
            int val = arr[i];
            res += modMul(lcm, modPow(val,mod-2));
            if(res >= mod)
                res-=mod;
        }
        System.out.println(res);
    }
    
    static int modMul(int a, int b){
        return (int)(((long)a*b)%mod);
    }
    
    static int modPow(int base, int exp){
        int res = 1;
        while(exp > 0){
            if(exp%2==1){
                res = modMul(res, base);
            }
            base = modMul(base, base);
            exp >>= 1;
        }
        return res;
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