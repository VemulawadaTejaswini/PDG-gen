import java.util.Scanner;

public class Main
{
    private static int f(int[] xs, int pos, int max, int count) {
        if (pos >= xs.length) {
            return count;
        }

        if (xs[pos] < max) {
            return Math.max(
                    f(xs, pos + 1, xs[pos], count + 1),
                    f(xs, pos + 1, max, count));
        }
        else {
            return f(xs, pos + 1, max, count);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }

        System.out.println(f(xs, 0, Integer.MAX_VALUE, 0));
   }
}
