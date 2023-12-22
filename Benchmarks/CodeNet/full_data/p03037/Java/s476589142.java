import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] l = new int[m];
        int[] r = new int[m];
        int lMax = 1; int rMin = n;
        for (int i = 0; i < m; i++)
        {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            if (l[i] > lMax) lMax = l[i];
            if (r[i] < rMin) rMin = r[i];
        }

        int count = 0;
        loop:
        for (int j = lMax; j <= rMin; j++)
        {
            for (int i = 0; i < m; i++)
            {
                if (j < l[i] || r[i] < j)
                    continue loop;
            }
            count++;
        }

        System.out.println(count);
    }
}
