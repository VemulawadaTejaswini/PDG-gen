import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main
{
    static int n;
    static int h[],a[];
    static long tree[];
    static void update(int node,int start,int end,int idx,long val)
    {
        //System.out.println(start+" "+end+" "+idx);
        if(idx<start||idx>end)
            return;
        if(start==end)
        {
            tree[node]=val;
            return;
        }
        int mid=(start+end)/2;
        update(2*node,start,mid,idx,val);
        update(2*node+1,mid+1,end,idx,val);
        tree[node]=Math.max(tree[2*node],tree[2*node+1]);
    }
    static long query(int node,int start,int end,int l,int r)
    {
        if(end<l||r<start)
            return -1;
        if(start>=l&&end<=r)
        {
            return tree[node];
        }
        int mid=(start+end)/2;
        long x=query(2*node,start,mid,l,r);
        long y=query(2*node+1,mid+1,end,l,r);
        return Math.max(x,y);
    }
    public static void main(String args[])throws Exception
    {
        try
        {
            InputReader in = new InputReader(System.in);
            PrintWriter out = new PrintWriter(System.out);
            n=in.ni();
            h=new int[n+1];
            a=new int[n+1];
            tree=new long[4*n+1];
            for(int i=1;i<=n;i++)
                h[i]=in.ni();
            for(int i=1;i<=n;i++)
                a[i]=in.ni();
            for(int i=1;i<=n;i++)
            {
                long x=query(1,1,n,1,h[i]);
                update(1,1,n,h[i],x+a[i]);
            }
            out.println(tree[1]);
            out.close();
        }
        catch(Exception e){
            return;
        }
    }
    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int ni() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nl() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

    }
}
