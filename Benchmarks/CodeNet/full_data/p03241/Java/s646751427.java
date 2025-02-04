/*input
1 1000000000
*/

import java.util.*;
import java.io.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) throws Exception
	{
		StringBuffer sb = new StringBuffer();
		Bolt sc = new Bolt(System.in);	
		int n=sc.nextInt();
        int m=sc.nextInt();
        int spf=1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(n==1)
        {
            System.out.print(m);
            // break;
            // return;
            System.exit(0);
        }
        for(int i=2;i<=Math.min(m/2,(m/n)+1);i++)
        {
            if(m%i==0)
            {
                al.add(i);
            }
        }
        
        int ans=1;
        int len=al.size();
        for(int i=0;i<len;i++)
        {
            int x=al.get(i);
            // System.out.println(x);
            if((n-1)*x<m)
            {
                int rem=m-(n-1)*x;
                if(rem%x==0)
                {
                    ans=Math.max(ans,x);
                }
                // else
                // {
                //     ans=Math.max(ans,rem);
                // }
            }
        }
        // if((n-1)*spf<m)
        // {
        //     int rem=m-(n-1)*spf;
        //     if(rem%spf==0)
        //     {
        //         ans=spf;
        //     }
        // }
        // // int ans=spf;
        // else
        // {
        //     for(int i=1;i*spf<=m;i++)
        //     {
        //         int j=i*spf;
        //         if((n-1)*j<m)
        //         {
        //             int rem=m-(n-1)*j;
        //             if(rem%spf==0)
        //             {
        //                 if(rem<j)
        //                 {
        //                     if(j%rem==0)
        //                         ans=Math.max(ans,rem);
        //                     else
        //                         ans=Math.max(ans,spf);
        //                 }
        //             }
        //         }
        //         else
        //             break;
        //     }
        // }
        System.out.print(ans);

    }
}

class Bolt
{
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
 
        public Bolt(InputStream stream) {
            this.stream = stream;
        }
 
        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public int peek() {
            if (numChars == -1)
                return -1;
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    return -1;
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar];
        }
 
        public void skip(int x) {
            while (x-- > 0)
                read();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
        public long nextLong() {
            return Long.parseLong(next());
        }
 
        public String nextString() {
            return next();
        }
 
        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
 
            return res.toString();
        }
 
        public String nextLine() {
            StringBuffer buf = new StringBuffer();
            int c = read();
            while (c != '\n' && c != -1) {
                if (c != '\r')
                    buf.appendCodePoint(c);
                c = read();
            }
            return buf.toString();
        }
 
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
 
        public boolean hasNext() {
            int value;
            while (isSpaceChar(value = peek()) && value != -1)
                read();
            return value != -1;
        }
 
        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
}
