import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            a[i] = temp;
        }
        int ans = getGcd(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            ans = getGcd(a[i], ans);
        }
        System.out.println(ans);
    }

    private static int getGcd(int x, int y) {
        return y == 0 ? x : getGcd(y, x % y);
    }
}