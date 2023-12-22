import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scan sc= new Scan();
        
        int n = sc.scanInt();
        int[] arr = new int[n];
        long[] dp1 = new long[n];
        // for odd length extra info
        long[] dp2 = new long[n];
        
        for(int i= 0; i < n; ++i){
            arr[i] = sc.scanInt();
            if(i%2 == 0){
                dp2[i] = arr[i] + (i >= 2 ? dp2[i-2] : 0);
            }
        }
        
        if(n <= 1)
            System.out.println(0);
        else {
            long globMax = Integer.MIN_VALUE;
            dp1[1] = Math.max(arr[0], arr[1]);
            for(int i = 2; i < n; ++i){
                if(i%2==0){
                    // odd case
                    dp1[i] = Math.max(dp1[i-1], arr[i] + dp1[i-2]);
                }
                else {
                    // even case
                    dp1[i] = Math.max(arr[i] + dp1[i-2], arr[i-1] + dp2[i-3]);
                }
            }
            System.out.println(dp1[n-1]);
        }
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