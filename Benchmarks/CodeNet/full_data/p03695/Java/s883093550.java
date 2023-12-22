import java.io.*;
import java.util.*;

class Main {
    static int[] dirX = {-1,-1,-1,0,0,1,1,1};
    static int[] dirY = {0,1,-1,1,-1,0,1,-1};
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int n= sc.scanInt();
        int[] colors = new int[9];
        int base = 400;
        for(int i = 0; i < n ;++i){
            int rating = sc.scanInt();
            if(rating < base)
                colors[0]++;
            else if(rating < base*2)
                colors[1]++;
            else if(rating < base*3)
                colors[2]++;
            else if(rating < base*4)
                colors[3]++;
            else if(rating < base*5)
                colors[4]++;
            else if(rating < base*6)
                colors[5]++;
            else if(rating < base*7)
                colors[6]++;
            else if(rating < base*8)
                colors[7]++;
            else
                colors[8]++;
        }
        int min = 0;
        int max = 0;
        for(int i = 0; i < 9; ++i){
            int val = colors[i];
            if(i < 8 && val > 0){
                ++min;
                ++max;
            }
            else if(i == 8){
                max += val;
            }
        }
        System.out.println(Math.max(min, 1) + " "+ max);
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
    
    public char scanCharacter() throws IOException {
        int n=scan();
        while(isWhiteSpace(n))
        n=scan();
        return (char)n;
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
        return true;
        return false;
    }
}