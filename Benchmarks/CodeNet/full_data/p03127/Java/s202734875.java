import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp;
            if (min > temp) {
                min = temp;
                idx = i;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (i == idx) {
                continue;
            }
            ans = Math.min(ans, getGcd(a[i], min));
        }
        System.out.println(ans);
    }

    private static int getGcd(int x, int y) {
        return y == 0 ? x : getGcd(y, x % y);
    }
}