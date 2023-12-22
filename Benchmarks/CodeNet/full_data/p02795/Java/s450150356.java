import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int v = Math.max(h, w);
        int ans = (n % v == 0) ? n / v : n / v + 1;
        System.out.println(ans);
    }
}