import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] a = A.toCharArray();
        Arrays.sort(a);
        int c = 1;
        int ans = 0;
        int b = 1;
        for (int i = 1; i < A.length(); i++) {
            if (a[i] != a[i - 1]) {
                ans += (c * (c - 1)) / 2;
                c = 1;
                b++;
            } else {
                c++;
            }
        }
        ans+=(c * (c - 1)) / 2;
        System.out.println((A.length() * (A.length() - 1)) / 2 - ans+1);
    }
}