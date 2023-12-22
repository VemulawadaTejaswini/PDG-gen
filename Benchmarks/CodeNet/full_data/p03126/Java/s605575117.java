import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();

        int[] liked = new int[m];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            for (int j = 0; j < k; j++) {
                int food = sc.nextInt() - 1;

                liked[food]++;
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            if (liked[i] == n)
                count++;
        }

        System.out.println(count);
    }
}