import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;
import java.lang.*;
import static java.lang.Math.*;
public class Main implements Runnable {

    static ArrayList<pair> adj[];

    static void Check2(int n) {
        adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

    }
    /*static void add(int i, int j) {
        adj[i].add(j);
    }
*/


    public static void main(String[] args) {
        new Thread(null, new Main(), "Check2", 1 << 26).start();// to increse stack size in java
    }
    static long mod = (long) (1e9 + 7);
    public void run() {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        char c[]=in.next().toCharArray();

        long ans=(long)(c.length)*(c.length+1l)/2l;
        int f[][]=new int[c.length][26];
        f[c.length-1][c[c.length-1]-97]++;
        for(int i=c.length-2;i>=0;i--)
        {
            for(int j=0;j<26;j++){
                f[i][j]=f[i+1][j];
            }
            f[i][c[i]-97]++;
        }
        long tp=0;
        long s=0;
        for(int i=0;i<c.length;i++){

            long val=odd(i,c)+even(i,c);
        //    w.println(i+" "+val+" "+bfr);
            s+=val;

            if(i>0&&i<c.length-1){
      //          w.println("lol "+f[i+1][c[i]-97]);
                tp+=f[i+1][c[i-1]-97];
            }

        }
    //    w.println(ans+" "+s+" "+tp+" "+bfr);
        ans=ans-s;
        ans=ans-tp;
        ans=ans+bfr;
        ans++;
        w.println(ans);


        w.close();
    }
    static long bfr=0;

    static long odd(int i,char c[]){

        int l=i-1;
        int r=i+1;
        long co=0;
        char tp=65;
        if(l>=0)tp=c[l];
        while (l>=0&&r<c.length)
        {
            if(c[l]!=c[r])break;
            if(c[l]==tp)bfr++;
            l--;
            r++;
            co++;
        }

        return co+1l;

    }
    static long even(int i,char c[]){
        int l=i;
        int r=i+1;
        long co=0;
        char tp=65;
        if(l-1>=0){
            tp=c[l-1];
        }
        while (l>=0&&r<c.length)
        {
            if(c[l]!=c[r])break;
            if(c[l]==tp&&l!=i)bfr++;
            l--;

            r++;
            co++;
        }

        return co;

    }
    static void brute(char c[]){

        HashSet <String> set=new HashSet<>();
        String ans=String.valueOf(c);
        set.add(ans);
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++){
                String p="";
                for(int k=j;k>=i;k--)p=p+c[k];

                String b=ans.substring(0,i)+p+ans.substring(j+1,c.length);
                if(!set.contains(b)){
                    System.out.println(i+" "+j+" "+b);
                    set.add(b);
                }
                else{
                    System.out.println("Not in set=="+i+" "+j+" "+b);
                }
            }
        }
        System.out.println(set.size());



    }
    static class pair {
        int a;
        long b;
        pair(int a,long b){
            this.a=a;
            this.b=b;
        }
    }

    static long modinv(long a,long b)
    {
        long p=power(b,mod-2);

        p=a%mod*p%mod;
        p%=mod;

        return p;

    }

    static long power(long x,long y){
        if(y==0)return 1%mod;
        if(y==1)return x%mod;


        long res=1;
        x=x%mod;
        while(y>0){


            if((y%2)!=0){
                res=(res*x)%mod;
            }


            y=y/2;
            x=(x*x)%mod;
        }


        return res;

    }
    static  int gcd(int a,int b){

        if(b==0)return a;
        return gcd(b,a%b);
    }

    static  void sev(int a[],int n){

        for(int i=2;i<=n;i++)a[i]=i;
        for(int i=2;i<=n;i++){

            if(a[i]!=0){
                for(int j=2*i;j<=n;){

                    a[j]=0;
                    j=j+i;
                }
            }

        }

    }



    static class node{

        int y;
        int val;

        node(int a,int b){

            y=a;
            val=b;

        }


    }

    static class InputReader
    {
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







}