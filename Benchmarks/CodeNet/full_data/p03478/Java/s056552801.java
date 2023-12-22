import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int s = 0;
            int n = i;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            if (A <= s && s <= B) ans += i;
        }
        System.out.println(ans);
    }
}