import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        long b[] = new long[n];
        for (int i=0;i<n;++i)
        {
            a[i] = sc.nextInt();
            ++b[a[i]-1];
        }

        int sum = 0;
        for (int i=0;i<n;++i) sum += b[i] * (b[i]-1) / 2;
        for (int i=0;i<n;++i) System.out.println(sum - (b[a[i]-1] - 1));
        sc.close();
    }
}