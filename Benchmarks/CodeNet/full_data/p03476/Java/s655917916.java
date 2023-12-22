import java.io.*;
import java.math.*;
import java.util.*;
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scan sn=new Scan();
        Print p=new Print();
        int[]arr=new int[100001];
        boolean[]prime=new boolean[100001];
        prime[1]=true;
        for(int i=2;i<100001;i++)
        {
            if(prime[i]==false)
            {
                for(int j=2*i;j<100001;j+=i)
                prime[j]=true;
            }
        }
        for(int i=1;i<100001;i++)
        {
            if(i%2==1)
            {if(prime[i]==false && prime[((i+1)/2)]==false)
            {
                arr[i]=arr[i-1]+1;
            }
            else
            {
                arr[i]=arr[i-1];
            }}
            else
            arr[i]=arr[i-1];
        }
        //System.out.println(Arrays.toString(arr));
        int q=sn.scanInt();
        while(q>0)
        {
            int ans=-arr[sn.scanInt()-1]+arr[sn.scanInt()];
            p.printLine(Integer.toString(ans));
            q--;
        }
        p.close();
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

class Print
{
    private final BufferedWriter bw;
    public Print()
    {
        bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(String str)throws IOException
    {
        bw.append(str);
    }
    public void printLine(String str)throws IOException
    {
        print(str);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }}