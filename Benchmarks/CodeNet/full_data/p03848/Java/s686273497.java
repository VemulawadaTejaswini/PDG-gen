import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt[] = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++)
            cnt[sc.nextInt()]++;

        boolean flag = true;
        for (int i = 1; i < n && flag; i++)
            if (cnt[i] % 2 != 0)
                flag = false;

        if (flag)
        {
            for (int i = 1; i < n; i++)
                if (cnt[i] == 2)
                    ans++;
            System.out.println((int) Math.pow(2, ans));
        } else
            System.out.println(0);
    }
}
