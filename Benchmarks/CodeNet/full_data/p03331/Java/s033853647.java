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
    
    
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        int n=sc.i();
        int min=1000000000;
        for(int i=1;i<n;i++)
        {
            int temp1=i;
            int temp2=n-i;
            int sum=0;
            while(temp1!=0)
            {
                sum+=temp1%10;
                temp1/=10;
            }
            while(temp2!=0)
            {
                sum+=temp2%10;
                temp2/=10;
            }
            min=Math.min(min,sum);
        }
        System.out.println(min);
    }
}