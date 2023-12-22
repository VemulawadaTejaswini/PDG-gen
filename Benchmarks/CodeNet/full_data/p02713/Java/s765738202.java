import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        long ans = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {
                    ans += getGcd(i, getGcd(j, l));
                }
            }
        }
        System.out.println(ans);
    }

    private static int getGcd(int x, int y) {
        return y == 0 ? x : getGcd(y, x % y);
    }
}