import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        int x = scn.nextInt();
        int c = n;
        for (int i = 0; i < n; i++)
        {
            a[i] = scn.nextInt();
            x -= a[i];
        }
        Arrays.sort(a);
        c = c + (x / a[0]);
        System.out.println(c);
    }
}
