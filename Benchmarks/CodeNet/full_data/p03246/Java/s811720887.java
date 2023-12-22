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

    static int n;
    static class pair 
    {
       int x;
       int y;
       public pair (int k, int p) 
       {
           x = k;
           y = p;
       }
       @Override
       public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pair pair = (pair) o;
            return x == pair.x && y == pair.y;
        }
    
       @Override
       public int hashCode() {
            return Objects.hash(x, y);
       }
    }
    static class PriorityComparator implements Comparator<pair>
    {
        public int compare(pair first, pair second) 
        {
            return second.y-first.y;
        }
    }
    public static void main(String[] args)throws IOException
    {
        PrintWriter out= new PrintWriter(System.out);
        Reader sc=new Reader();
        n=sc.i();
        int arr[]=sc.arr(n);
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        PriorityComparator pc = new PriorityComparator();
        PriorityQueue<pair> pq1 = new PriorityQueue<pair>(pc);
        PriorityQueue<pair> pq2 = new PriorityQueue<pair>(pc);
        int freq1[]=new int[100001];
        int freq2[]=new int[100001];
        int c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                freq1[arr[i]]++;
                c1++;
            }
            else
            {
                freq2[arr[i]]++;
                c2++;
            }
        }
        for(int i=1;i<100001;i++)
        pq1.add(new pair(i,freq1[i]));
        for(int i=1;i<100001;i++)
        pq2.add(new pair(i,freq2[i]));
        
        pair p1=pq1.remove();
        pair p2=pq1.remove();
        pair p3=pq2.remove();
        pair p4=pq2.remove();
        if(p1.x!=p3.x)
        out.println((c1-p1.y)+(c2-p3.y));
        else
        out.println(Math.min((c1-p2.y)+(c2-p3.y),(c1-p1.y)+(c2-p4.y)));
        out.flush();
    }
}