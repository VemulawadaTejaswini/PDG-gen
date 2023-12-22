import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
    static class Reader 
    { 
        private InputStream mIs;private byte[] buf = new byte[1024];private int curChar,numChars;public Reader() { this(System.in); }public Reader(InputStream is) { mIs = is;} 
        public int read() {if (numChars == -1) throw new InputMismatchException();if (curChar >= numChars) {curChar = 0;try { numChars = mIs.read(buf);} catch (IOException e) { throw new InputMismatchException();}if (numChars <= 0) return -1; }return buf[curChar++];} 
        public String nextLine(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isEndOfLine(c));return res.toString() ;} 
        public String s(){int c = read();while (isSpaceChar(c)) c = read();StringBuilder res = new StringBuilder();do {res.appendCodePoint(c);c = read();}while (!isSpaceChar(c));return res.toString();} 
        public long l(){int c = read();while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }long res = 0; do{ if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read();}while(!isSpaceChar(c));return res * sgn;} 
        public int i(){int c = read() ;while (isSpaceChar(c)) c = read();int sgn = 1;if (c == '-') { sgn = -1 ; c = read() ; }int res = 0;do{if (c < '0' || c > '9') throw new InputMismatchException();res *= 10 ; res += c - '0' ; c = read() ;}while(!isSpaceChar(c));return res * sgn;} 
        public double d() throws IOException {return Double.parseDouble(s()) ;}
        public boolean isSpaceChar(int c) { return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; } 
        public boolean isEndOfLine(int c) { return c == '\n' || c == '\r' || c == -1; } 
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    //    RRRRRRRRR            AAA             HHH     HHH     IIIIIIIIIIIII   LLL           //
    //    RR    RRR           AAAAA            HHH     HHH      IIIIIIIIIII    LLL           //
    //    RR   RRR           AAAAAAA           HHH     HHH          III        LLL           //
    //    RR  RRR           AAA   AAA          HHHHHHHHHHH          III        LLL           //
    //    RRRRRR           AAA     AAA         HHHHHHHHHHH          III        LLL           //
    //    RR  RRR         AAAAAAAAAAAAA        HHH     HHH          III        LLL           //
    //    RR    RRR      AAA         AAA       HHH     HHH      IIIIIIIIIII    LLLLLLLLLLLL  //
    //    RR     RRR    AAA           AAA      HHH     HHH     IIIIIIIIIIIII   LLLLLLLLLLLL  //
    ///////////////////////////////////////////////////////////////////////////////////////////
    static int n;
    static int arr[]=new int[16];
    static int cache[];
    public static int dp(int store)
    {
        if(store==0)
        return cache[0]=0;
        if(store<0)
        return 19999999;
        if(cache[store]!=-1)
        return cache[store];
        int min=1000000000;
        for(int i=0;i<16;i++)
            min=Math.min(min,1+dp(store-arr[i]));
        return cache[store]=min;
    }
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        n=sc.i();
        arr[0]=1;
        int counter=1;
        int six=1;
        for(int i=1;i<=8;i++)
        {
            six*=6;
            arr[i]=six;
        }
        int nine=1;
        for(int i=9;i<=15;i++)
        {
            nine*=9;
            arr[i]=nine;
        }
        Arrays.sort(arr);
        cache=new int[n+2];
        Arrays.fill(cache,-1);
        System.out.println(dp(n));
    }
}
    