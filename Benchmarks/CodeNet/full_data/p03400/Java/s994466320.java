import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = x + n;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 10; j++) {
                if (arr[i] * j < d) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}