import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0;
        if(scan.hasNext())
            n=scan.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            String str="";
            if(scan.hasNext())
                arr[i]=scan.nextLong();
        }
        long l=lcm(arr);
        //long l=Long.parseLong(String.valueOf(lcm));
        /*BigInteger p=new BigInteger("0");
        for(int i=0;i<n;i++){
            p= p.add((lcm.divide(arr[i])).mod(new BigInteger("1000000007")));
            p=p.mod(new BigInteger("1000000007"));
        }*/
        long p=0;
        for(int i=0;i<n;i++){
            p+=getFractionModulo(l,arr[i]);
            p=p%1000000007;
            //System.out.println(l);
        }
        System.out.println(p);
    }
    static long gcd(long a, long b)
    {
        if (b==0)
            return a;
        return gcd(b, a%(b));
    }

    static long lcm(long arr[])
    {
        long ans = arr[0];
        for (int i = 1; i < arr.length; i++)
            ans = (((arr[i]*(ans)))/(
                    (gcd(arr[i], ans))));

        return ans;
    }
    static long modexp(long x, long n)
    {
        long m  = 1000000007;
        if (n == 0) {
            return 1;
        }
        else if (n % 2 == 0) {
            return modexp((x * x) % m, n / 2);
        }
        else {
            return (x * modexp((x * x) % m, (n - 1) / 2) % m);
        }
    }

    // Function to return the fraction modulo mod
    static long getFractionModulo(long a, long b)
    {
        long m  = 1000000007;
        long c = gcd(a, b);

        a = a / c;
        b = b / c;

        // (b ^ m-2) % m
        long  d = modexp(b, m - 2);

        long ans = ((a % m) * (d % m)) % m;

        return ans;
    }
}
