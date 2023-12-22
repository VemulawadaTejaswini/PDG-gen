import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int h = sc.scanInt();
        int w = sc.scanInt();
        int[][] cost = new int[10][10];
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < 10; ++j){
                cost[i][j] = sc.scanInt();
            }
        }
        int[] best = new int[10];
        for(int i = 0; i < 10; ++i)
            best[i] = cost[i][1];
        for(int i = 1; i < 10; ++i){
            int[] newBest = new int[10];
            for(int j = 0; j < 10; ++j){
                newBest[j] = best[j];
                for(int k = 0; k < 10; ++k){
                    if(j==k)
                        continue;
                    int cst = cost[j][k];
                    newBest[j] = Math.min(newBest[j], cst + best[k]);
                }
            }
            best = newBest;
        }
        int res = 0;
        for(int i = 0; i < h; ++i){
            for(int j = 0; j < w; ++j){
                int curr = sc.scanInt();
                if(curr != -1){
                    res += best[curr];
                }
            }
        }
        System.out.println(res);
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