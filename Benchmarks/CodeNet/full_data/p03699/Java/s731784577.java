import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int ps[] = new int[n];
        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt();
        }
        Arrays.sort(ps);
        int ans = Arrays.stream(ps).sum();
        for (int i = 0; i < n && ans % 10 == 0; i++) {
            ans -= ps[i];
        }
        System.out.println(ans);
    }
}
