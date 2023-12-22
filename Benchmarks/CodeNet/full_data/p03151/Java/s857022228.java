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
        public int[] arr(int n){int[] ret = new int[n];for (int i = 0; i < n; i++) {ret[i] = i();}return ret;}
    }
    
    

    //       |----|       /\      |    |   -----   |
    //       |   /       /  \     |    |     |     |
    //       |--/       /----\    |----|     |     |
    //       |   \     /      \   |    |     |     |
    //       |    \   /        \  |    |   -----   -------
    
    static class B implements Comparable<B>
    {
        int x;int y;
        public B(int a,int b) 
        {
            x=a;
            y=b;
        }
        public int compareTo(B num) 
        {
            return (x-y)-(num.x-num.y);
        }
    }
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        int n=sc.i();
        B arr[]=new B[n];
        int brr[]=sc.arr(n);
        int crr[]=sc.arr(n);
        for(int i=0;i<n;i++)
        arr[i]=new B(brr[i],crr[i]);
        Arrays.sort(arr);
        long debt=0;
        int counter=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].x<arr[i].y)
            {
                debt+=(long)(arr[i].y-arr[i].x);
                arr[i].x=arr[i].y;
                counter++;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            if(debt<=0)
            break;
            if(arr[i].x>arr[i].y)
            {
                debt-=(long)(arr[i].x-arr[i].y-1);
                counter++;
            }
        }
        if(debt>0)
        out.println(-1);
        else
        out.println(counter);
        out.flush();
    }
}