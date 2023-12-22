import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            a[i] = i;
        }
        for(int i = 6; i <= n; i *= 6) {
            for(int j = i; j <=n ; j++) {
                a[j] = Math.min(a[j], a[j - i] + 1);
            }
        }
        for(int i = 9; i <= n; i *= 9) {
            for(int j = i; j <=n ; j++) {
                a[j] = Math.min(a[j], a[j - i] + 1);
            }
        }
        System.out.println(a[n]);
    }
}
