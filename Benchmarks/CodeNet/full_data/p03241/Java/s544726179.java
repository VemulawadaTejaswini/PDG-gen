import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for (int i = m / n;; i--) {
            if (m % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
