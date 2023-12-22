import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scan sc = new Scan();
        int x = sc.scanInt();
        int y = sc.scanInt();
        int a = sc.scanInt();
        int b = sc.scanInt();
        int c = sc.scanInt();
        int[] red = new int[a];
        int[] green = new int[b];
        int[] blank = new int[c];
        for(int i= 0; i < a; ++i)
            red[i] = sc.scanInt();
        for(int i= 0; i < b; ++i)
            green[i] = sc.scanInt();
        for(int i= 0; i < c; ++i)
            blank[i] = sc.scanInt();
        Arrays.sort(red);
        Arrays.sort(green);
        Arrays.sort(blank);
        
        int r = a-x;
        int g = b-y;
        int i = c-1;
        
        long ans = 0;
        boolean explore = true;
        while(r < a && g < b && i >= 0){
            int val_blank = blank[i];
            int val_red = red[r];
            int val_green = green[g];
            int diff_r = val_blank - val_red;
            int diff_g = val_blank - val_green;
            if(diff_r > 0 && diff_r >= diff_g){
                ans += val_blank;
                ++r;
                --i;
            }
            else if(diff_g > 0 && diff_r < diff_g){
                ans += val_blank;
                ++g;
                --i;
            }
            else {
                explore = false;
                break;
            }
        }
        
        if(explore && i >= 0){
            while(r < a){
                int val_blank = blank[i];
                int val_red = red[r];
                if(val_blank > val_red){
                    ans += val_blank;
                    ++r;
                    --i;
                }
                else {
                    break;
                }
            }
            
            while(g<b){
                int val_blank = blank[i];
                int val_green = green[g];
                if(val_blank > val_green){
                    ans += val_blank;
                    ++g;
                    --i;
                }
                else {
                    break;
                }
            }
        }
        
        while(r < a){
            ans += red[r];
            ++r;
        }
        
        while(g < b){
            ans += green[g];
            ++g;
        }
        
        System.out.println(ans);
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