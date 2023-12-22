import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        //
        for (int i = 0; i < m; i++)
        {
            Arrays.sort(a);

            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = 0; j < b; j++)
            {
                if (a[j] < c) a[j] = c;
                else break;
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
