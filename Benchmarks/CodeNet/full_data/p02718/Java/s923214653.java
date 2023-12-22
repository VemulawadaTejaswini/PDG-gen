import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int count = 0;

        for (int k: a) {
            if (k * 4 * M < sum) continue;
            else count++;
        }
        if (count >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}