import  java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
import java.math.*;
import java.io.*;

public class hacker
{  

    /*Fatt Gyi Bhai*/
    //Dekh le mera code
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

   
    static int pow(int a,int b)
    {
        int res = 1;
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
 
   

    static void reverse(int[] a)
    {
        int start=0;
        int end = a.length-1;
        while(start<end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

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
       // in = new Scanner(new File("explicit.in"));
        //out = new PrintWriter("explicit.out");
        new hacker().run();
       
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

    

    
   



   
   
    
   
   static Scanner sc = new Scanner(System.in);
    static void run() throws IOException
    {
        int d = ni();
        int max = 100;
        int sum=0;
        for(int i=0;i<d;i++)
        {
            int p = ni();
            sum+=p;
            if(p>max)
            {
                max = p;
            }
        }

        System.out.println(sum-max/2);


    }



   

    static void print(long a)
    {
        System.out.println(a);
    }

    static int myabs(int n)
    {
        if(n>0)
        {
            return n;
        }
        else
        {
            return 1+abs(n);
        }
    }
   
   
    static void swap(char c,char p)
    {
        char t = c;
        c = p;
        p = t;
    }

    static int max(int n,int m)
    {
        return Math.max(n,m);
    }
    static long min(long n,long m)
    {
        return Math.min(n,m);
    }

    static double nd() throws IOException
    {
        return Double.parseDouble(sc.next());
    }
    static int ni() throws IOException
    {
        return Integer.parseInt(sc.next());
    }

    static long nl() throws IOException
    {
        return Long.parseLong(sc.next());
    }

    static String si() throws IOException
    {
        return sc.next();
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