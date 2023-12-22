


import java.io.*;
import java.text.BreakIterator;
import java.util.*;


public class Main {
    static class pair implements Comparable<pair>{
        int x;
        int idx;
        pair(int x,int idx){
            this.x=x;
            this.idx=idx;
        }

        @Override
        public int compareTo(pair p) {
            if(p.x==x){
                return idx-p.idx;
            }
            return x-p.x;
        }
        }


    public static long ciel(long x,long y){
        long res=x/y;
        if(x%y!=0)res++;
        return res;
    }

    public static long gcd(long u,long v){
        if(v==0)return u;
        return gcd(v, u%v);
    }
    static int  mod= (int) (1e9+7);
    static long memo[][];
    static long inf= (long) 2e9;
    static int[]cost,weight;
    static ArrayList<Integer> primes;
    static ArrayList<Integer> primeFactors(int N)		// O(sqrt(N) / ln sqrt(N))
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();		//take abs(N) in case of -ve integers
        int idx = 0, p = primes.get(idx);

        while(p * p <= N)
        {
            while(N % p == 0) { factors.add(p); N /= p; }
            p = primes.get(++idx);
        }

        if(N != 1)						// last prime factor may be > sqrt(N)
            factors.add(N);				// for integers whose largest prime factor has a power of 1
        return factors;
    }
    static int[] isComposite;
    static void sieve(int N)	// O(N log log N)
    {
        isComposite = new int[N+1];
        isComposite[0] = isComposite[1] = 1;			// 0 indicates a prime number
        primes = new ArrayList<Integer>();

        for (int i = 2; i <= N; ++i) 					//can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))
            if (isComposite[i] == 0) 					//can loop in 2 and odd integers for slightly better performance
            {
                primes.add(i);
                if(1l * i * i <= N)
                    for (int j = i * i; j <= N; j += i)	// j = i * 2 will not affect performance too much, may alter in modified sieve
                        isComposite[j] = 1;
            }
    }

    /*
     * 2. Primality Test
     *
     *  Preprocessing: call sieve with sqrt(N), O(sqrt(N) log log sqrt(N))
     *  Query: best case O(1), worst case O(sqrt(N) / log sqrt(N))
     */
    static boolean isPrime(int N)
    {
        if(N < isComposite.length)
            return isComposite[N] == 0;
        for(int p: primes)					//may stop if p * p > N
            if(N%p==0)
                return false;
        return true;
    }
    static long modPow(long a, long e, long mod)	// O(log e)
    {
        a %= mod;
        long res = 1;
        while(e > 0)
        {
            if((e & 1) == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            e >>= 1;
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int k=sc.nextInt();
        double[]Arr=new double[n+1];
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            Arr[i]=a*(a+1)/2;
            Arr[i]/=a;
            Arr[i]+=Arr[i-1];
        }
        double ans=0;
        for(int i=1;i<=n;i++){
            int j=i+k-1;
            if(j>n)break;;
            ans=Math.max(ans, Arr[j]-Arr[i-1]);
        }
        pw.println(ans);
        pw.close();
    }

    public static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException, IOException {
            return br.ready();
        }

    }
}