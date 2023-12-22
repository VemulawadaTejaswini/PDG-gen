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
            if(scan.hasNext())
                arr[i]=scan.nextLong();
        }
        long lcm=lcm(arr);

        long p=0;
        for(int i=0;i<n;i++){
            p+= ((lcm/arr[i])%(1000000007));
            p%=1000000007;
        }
        System.out.println(p);
    }
    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long lcm(long arr[])
    {
        long ans = arr[0];
        for (int i = 1; i < arr.length; i++)
            ans = (((arr[i] * ans)) /
                    (gcd(arr[i], ans)));

        return ans;
    }
}
