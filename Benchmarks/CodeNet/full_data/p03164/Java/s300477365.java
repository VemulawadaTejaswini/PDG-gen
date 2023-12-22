
// LM10: The next Ballon d'Or
import java.util.*;
import java.io.*;
import java.math.*;
import static java.lang.Math.*;
public class Main
{
    static class FastReader
    {
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public FastReader() { this(System.in); }public FastReader(InputStream is) { mIs = is;}
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];}
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;}
        public String next(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();}
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;}
        public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;}
        public double d() throws IOException {return Double.parseDouble(next()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; }
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; }
        public void scanIntArr(int [] arr){ for(int li=0;li<arr.length;++li){ arr[li]=i();}}
        public void scanLongArr(long [] arr){for (int i=0;i<arr.length;++i){arr[i]=l();}}
        public void shuffle(int [] arr){ for(int i=arr.length;i>0;--i) { int r=(int)(Math.random()*i); int temp=arr[i-1]; arr[i-1]=arr[r]; arr[r]=temp; } }
    }
    public static void main(String[] args)throws IOException {
        /*
SAMPLE INPUT
3 8
3 30
4 50
5 60
SAMPLE OUTPUT
90
        */
        PrintWriter pw = new PrintWriter(System.out);
        FastReader fr = new FastReader();
        int t=1;
        for(int ti=0;ti<t;++ti)
        {
            int n=fr.i();
            int w=fr.i();
            int limit=(int)(1e5);
            int [] weights=new  int[n];
            int [] values=new int[n];
            long [][] dp=new long [n][limit+1];
            for(int ni=0;ni<n;++ni)
            {
                weights[ni]=fr.i();
                values[ni]=fr.i();
            }
            int ans=0;
            for(int ni=0;ni<n;++ni)
            {
                for(int vi=0;vi<=limit;++vi)
                {
                    if(vi==0)
                    {
                        dp[ni][vi]=0;
                        continue;
                    }
                    if(ni==0 && vi==values[ni])
                    {
                        dp[ni][vi]=weights[ni];
                        //pw.println("dp[ni][vi]="+dp[ni][vi]);
                        if(dp[ni][vi]<=w)
                        {
                            ans=Math.max(ans,vi);
                        }
                    }
                    else if(ni==0)
                    {
                        continue;
                    }
                    else if(vi==values[ni])
                    {
                        if(dp[ni-1][vi]==0)
                        {
                            dp[ni][vi]=weights[ni];
                        }
                        else
                        {
                            dp[ni][vi]=Math.min(dp[ni-1][vi],weights[ni]);
                        }
                    }
                    else
                    {
                        dp[ni][vi]=dp[ni-1][vi];
                        if(vi>=values[ni])
                        {
                            if(dp[ni-1][vi-values[ni]]!=0)
                            {
                               //pw.println("Here ni="+ni+" vi="+vi);
                                if(dp[ni-1][vi]!=0)
                                    dp[ni][vi]=Math.min(dp[ni-1][vi],dp[ni-1][vi-values[ni]]+weights[ni]);
                                else
                                    dp[ni][vi]=dp[ni-1][vi-values[ni]]+weights[ni];
                            }
                        }
                    }
                    if(dp[ni][vi]<=w && dp[ni][vi]!=0)
                    {
                        ans=Math.max(ans,vi);
                    }
                }
            }
            pw.println(ans);
        }
        pw.flush();
        pw.close();
    }
}