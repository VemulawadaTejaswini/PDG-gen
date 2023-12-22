import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int[][] grid = new int[3][3];
        for(int i = 0; i < 3; ++i){
            for(int j = 0; j < 3; ++j){
                grid[i][j] = sc.scanInt();
            }
        }
        
        boolean good = true;
        // row
        for(int i = 2; i < 3; ++i){
            int diff1 = grid[i][0] - grid[i-1][0];
            int diff2 = grid[i][1] - grid[i-1][1];
            int diff3 = grid[i][2] - grid[i-1][2];
            if(diff1 != diff2 || diff2 != diff3){
                good = false;
                break;
            }
        }
        if(!good)
            System.out.println("No");
        else {
            // row
            for(int i = 2; i < 3; ++i){
                int diff1 = grid[0][i] - grid[0][i-1];
                int diff2 = grid[1][i] - grid[1][i-1];
                int diff3 = grid[2][i] - grid[2][i-1];
                if(diff1 != diff2 || diff2 != diff3){
                    good = false;
                    break;
                }
            }
            if(good)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

class Pair implements Comparable <Pair>{
    int val, mod;
    Pair(int val, int mod){
        this.val = val;
        this.mod = mod;
    }
    public int compareTo(Pair other){
        if(this.val < other.val)
            return -1;
        if(this.val > other.val)
            return 1;
        return 0;
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