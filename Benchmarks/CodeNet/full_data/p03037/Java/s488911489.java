import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

/* abhi2601 */

public class Main implements Runnable{

    final static long mod = (long)1e9 + 7;
    static class Pair{
        int i,q;
        Pair(int a, int b){
            i=a;
            q=b;
        }
    }

    static class comp implements Comparator<Pair>{
        public int compare(Pair a,Pair b){
            if(a.i<b.i) return -1;
            else if(a.i>b.i) return 1;
            else{
                if(a.q<b.q) return -1;
                else if(a.q>b.q) return 1;
                return 0;
            }
        }
    }
    public void run(){
        InputReader sc = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Pair>al=new ArrayList<>();
        for(int i=0;i<m;i++){
            al.add(new Pair(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(al,new comp());
        int p1=al.get(0).i,p2=al.get(0).q,ans=1,c=0;
        for(int i=1;i<m;i++){
            int q1=al.get(i).i,q2=al.get(i).q;
            if(q1>p2){
                c++;
                break;
            }
            p1=q1;
            p2=Math.min(p2,q2);
        }
        w.println(p2-p1+1);
        w.close();
    }
    //static PrintWriter w;
    /*File in=new File("input.txt");
        File out=new File("output.txt");
        Scanner sc= null;
        try {
            sc = new Scanner(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            w=new PrintWriter(out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    static class InputReader {

        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars)
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine()
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt()
        {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-')
            {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do
            {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.')
            {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.')
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
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

        public String readString()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do
            {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next()
        {
            return readString();
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception
    {
        new Thread(null, new Main(),"q1",1<<26).start();
    }
}