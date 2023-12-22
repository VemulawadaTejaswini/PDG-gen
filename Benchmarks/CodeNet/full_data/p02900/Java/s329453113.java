import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        boolean[] isPrime = new boolean[100100];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < isPrime.length; i++)
        {
            if (!isPrime[i])
            {
                continue;
            }
            for (int j = i*2; j < isPrime.length; j += i)
            {
                isPrime[j] = false;
            }
        }
        int p = 0;
        int[] primes = new int[100000];
        for (int i = 0; i < isPrime.length; i++)
        {
            if (isPrime[i])
            {
                primes[p] = i;
                p++;
            }
        }

        ntok();
        long a = lpar();
        long b = lpar();
        long gcd = gcd(a, b);
        // out.println(gcd);
        long count = 0;
        HashSet<Integer> set = new HashSet<>();
        long[] freq = new long[100000];
        for (int i = 0; i < p; i++)
        {
            while (gcd % primes[i] == 0)
            {
                freq[i]++;
                count++;
                set.add(primes[i]);
                gcd /= primes[i];
            }
        }
        long sum = count * (count + 1) / 2;
        for (int i = 0; i < freq.length; i++)
        {
            sum -= freq[i] * (freq[i]-1) / 2;
        }
        out.println(set.size() + 1);

        out.flush();
        in.close();
    }

    public long gcd(long a, long b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a%b);
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public int[] iapar(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        return arr;
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public long[] lapar(int n)
    {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = lpar();
        }
        return arr;
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
