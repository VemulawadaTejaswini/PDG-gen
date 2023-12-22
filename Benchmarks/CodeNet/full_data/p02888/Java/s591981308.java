import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs =  new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }
        Arrays.sort(xs);

        int count = 0;
        for (int a = 0; a < n - 2; a++) {
            for (int b = a + 1; b < n - 1; b++) {
                for (int c = b + 1; c < n; c++) {
                    if (xs[c] >= xs[a] + xs[b]) {
                        break;
                    }
                    if (xs[a] < xs[b] + xs[c] && xs[b] < xs[a] + xs[c]) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
