import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = scanner.nextInt();
        }

        int[] bests = new int[n];
        for (int i = 0; i < n; i++) {
            bests[i] = Integer.MAX_VALUE;
        }
        int i = 0;
        bests[0] = xs[0] - xs[0];
        bests[1] = xs[1] - xs[0];
        while (true) {
            bests[i + 2] = Math.max(bests[0] + bests[1] + Math.abs(xs[i + 2] - xs[i + 1]), bests[0] + Math.abs(xs[i + 2] - xs[i]));
            if (i + 2 == n - 1) {
                System.out.println(bests[i + 2]);
                return;
            }
            i++;
        }
    }
}

