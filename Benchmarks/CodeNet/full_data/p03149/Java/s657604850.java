import  java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.math.*;
import java.io.*;
import java.text.*;

class Main
{  

    // YO fUCK PUSSY MAN
    // Believe yourself you gonna get it
    // Oh!love, oh mine ,gonna fuck you
    public static boolean[] sieve(long n)
    {
        boolean[] prime = new boolean[(int)n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        long m = (long)Math.sqrt(n);
        for(int i=2;i<=m;i++)
        {
            if(prime[i])
            {
                for(int k=i*i;k<=n;k+=i)
                {
                    prime[k] = false;
                }
            }
        }
        return prime;
    } 

    
    static long GCD(long a,long b)
    {
        if(a==0 || b==0)
        {
            return 0;
        }
        if(a==b)
        {
            return a;
        }
        if(a>b)
        {
            return GCD(a-b,b);
        }
        return GCD(a,b-a);
    }

    static long CountCoPrimes(long n)
    {
        long res = n;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n/=i;
                }
                res-=res/i;
            }
        }
        if(n>1)
        {
            res-=res/n;
        }
        return res;
    }


    //fastest way to find x**n
    static long modularExponentiation(long x,long n,long m)
    {
        long res = 1;
        while(n>0)
        {
            if(n%2==1)
            {
                res = (res*x)%m;
            }
            x =(x*x)%m;
            n/=2;
        }
        return res;
    }

    static long lcm(long a,long b)
    {
        return (a*b)/GCD(a,b);
    }

   
    static long pow(long a,long b)
    {
        long res = 1;
        while(b>0)
        {
            if((b&1)==1)
            {
                res *= a;
            }

            b >>= 1;
            a *=a;
        }
        return res;
    }

   static long modInverse(long A,long M)
   {
    return modularExponentiation(A,M-2,M);
   }
 
   

    

    static boolean prime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(i%2==0 ||i%3==0)
            {
                return false;
            }
        }
        return true;
    }




   
   
  
    public static void main(String[] args) throws IOException
    {
      // = new PrintWriter("explicit.out");
        new Main().run();
       
    }


    static int rev(int n)
    {
        int x=0;
        int num = 0;
        while(n>0)
        {
            x = n%10;
            num = num*10+x;
            n/=10;

        }
        return num;
    }

    
    
   

   
   
    
    
    static Scanner in = new Scanner(System.in);
    static void run() throws IOException
    {
       int one=0;int  nine = 0;
       int seven = 0;
       int four = 0;
       for(int i=0;i<4;i++)
       {
            int pp = ni();
            if(pp==1)
            {
                one++;
            }
            else if(pp==9)
            {
                nine++;
            }
            else if(pp==7) seven++;
            else if(pp==4) four++;
       }

       if(seven>0 && four>0 && nine>0 && one>0)
       {
            printS("YES");
            return;
       }
       printS("NO");



    
    }

   

   
    

    
       
    

    
   
  



   

    static void printL(long a)
    {
        System.out.println(a);
    }
    static void printS(String s)
    {
        System.out.println(s);
    }


  
   
   
    static void swap(char c,char p)
    {
        char t = c;
        c = p;
        p = t;
    }

    static long max(long n,long m)
    {
        return Math.max(n,m);
    }
    static long min(long n,long m)
    {
        return Math.min(n,m);
    }

    static double nd() throws IOException
    {
        return Double.parseDouble(in.next());
    }
    static int ni() throws IOException
    {
        return Integer.parseInt(in.next());
    }

    static long nl() throws IOException
    {
        return Long.parseLong(in.next());
    }

    static String si() throws IOException
    {
        return in.next();
    }


  
   
    static int abs(int n)
    {
        return Math.abs(n);
    }

    static class Scanner 
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException 
        {
            while (st == null || !st.hasMoreTokens()) 
            {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}
        
        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public boolean ready() throws IOException {return br.ready();}


    }

    
}

class pair implements Comparable<pair>
{
    int value;
    int index;
    public pair(int v,int i)
    {
        value = v;
        index = i;
    }

   
    public int compareTo(pair a)
    {
        return this.value-a.value;
    }

}