import java.io.*;
import java.util.*;

class Main {
    static int[] arr;
    static int targLen;
    static HashMap<State, Long> states;
    public static void main(String[] args) throws IOException {
        Scan sc= new Scan();
        int n = sc.scanInt();
        arr = new int[n];
        states = new HashMap<>();
        targLen = n/2;
        for(int i= 0; i < n; ++i)
            arr[i] = sc.scanInt();
        
        long globMax = Integer.MIN_VALUE;
        for(int i = n-1, end = (targLen-1)*2; i >= end; --i){
            long currRes = getRes(i, targLen);
            globMax = Math.max(globMax, currRes);
        }
        System.out.println(globMax);
        
    }
    
    static long getRes(int endPos, int len){
        State curr = new State(endPos, len);
        if(states.containsKey(curr))
            return states.get(curr);
        if(len == 1)
            return arr[endPos];
        long res = 0;
        for(int i = endPos-2, end = (len-2)*2; i >= end; --i){
            long tres = arr[endPos] + getRes(i, len-1);
            res = Math.max(tres, res);
        }
        states.put(curr, res);
        return res;
    }
}

class State {
    int endPos,len;
    State(int endPos, int len){
        this.endPos = endPos;
        this.len = len;
    }
    
    public boolean equals(State st){
        return this.endPos == st.endPos && this.len == st.len;
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