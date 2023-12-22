import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        char[] carr = sc.scanString().toCharArray();
        int first = carr[0];
        int second = carr[carr.length-1];
        long k  = sc.scanLong();
        if(carr.length==1){
           System.out.println(k/2);
           return;
        }
        long[] one = compute(carr, carr.length, false);
       
        String s2 = new String(carr);
        s2+=s2;
        carr = s2.toCharArray();
        
        long[] two = compute(carr, carr.length, true);
    
        long res = two[0]*(k/2);
        if(k%2==1){
            if(first==second && one[1]%2==1 && one[2]%2==1 && one[1]+one[2]!=carr.length)
                res++;
            res += one[0];
        }
        System.out.println(res);
    }
    
    static long[] compute(char[] carr, int n, boolean end){
         // single
        int curr = 0;
        long base=0;
        long begin = 1;
        boolean started = false;
        for(int i = 0; i < n-1; ++i){
            if(carr[i] == carr[i+1]){
                if(i==0)
                    started=true;
                if(started)
                    ++begin;
                ++curr;
            }
            else {
                curr+=1;
                started=false;
                base += (curr/2);
                curr = 0;
            }
        }
        long extra = 1;
        if(curr != 0){
            extra += curr;
            curr+=1;
            base += (curr/2);
            curr = 0;
        }
        return new long[]{base, begin, extra};
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
    public char scanChar() throws IOException {
        int n = scan();
        while(isWhiteSpace(n))
            n=scan();
        return (char)n;
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
    public long scanLong() throws IOException {
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
    public boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}
