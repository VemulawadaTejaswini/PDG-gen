import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i += 2) if (f(i) == 8) ans++;
        System.out.println(ans);
        sc.close();
    }

    public static int f(int n) {
        int sqrt = (int) Math.sqrt(n);
        int ans = 0;
        for (int i = 1; i <= sqrt; i++)
            if (n % i == 0) {
                ans++;
                if (i * i != n) ans++;
            }
        return ans;
    }

}
