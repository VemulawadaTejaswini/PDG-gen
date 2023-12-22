import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);

    static long n = 0;
    static long[] a = new long[5];

    public static void main(String[] args)
    {
        n = scanner.nextLong();
        long minItem = Long.MAX_VALUE;
        for (int i = 0; i < 5; ++i)
        {
            a[i] = scanner.nextLong();
            minItem = Math.min(minItem, a[i]);
        }
        System.out.println(5 + n / minItem);
    }
}