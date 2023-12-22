import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sum += xs[i] * xs[j];
            }
        }

        System.out.println(sum);
    }
}
