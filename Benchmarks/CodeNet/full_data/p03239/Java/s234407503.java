import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int tmp = sc.nextInt();
            if (tmp <= t) {
                min = Math.min(min, c);
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("TLE");
        } else {
            System.out.println(min);
        }
    }
}
