import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hi = new int[n];
        for (int i = 0; i < n; i++) {
            hi[i] = sc.nextInt();
        }
        int ans = 1;
        int high = 0;
        for (int i = 1; i < n; i++) {
            if (hi[i] >= hi[i - 1] && hi[i] >= hi[0] && hi[i] >= high) {
                ans++;
                high = hi[i];
            }
        }
        System.out.println(ans);
    }
}