import java.util.*;
public class Main {
    public static long MIN(long a,long b,long c)
    {
        if (a < b && a<c)
            return a;
        else if (b < a && b < c)
            return b;
        else
            return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int[] x = new int[n];

        for (int i=0;i<n;i++)
            x[i] = sc.nextInt();
        Arrays.sort(x);
        int p = x[n-1]- x[n-2];
        long ans1=0;
        for (int q:x)
        {
            ans1+=(p-q)*(p-q);
        }
        long ans2 = 0;
        for (int q:x)
            ans2+=(p+1-q)*(p+1-q);

        long ans3 = 0;
        for (int q:x)
            ans3+=(p-1-q)*(p-1-q);

        System.out.println(MIN(ans1,ans2,ans3));
    }
}
