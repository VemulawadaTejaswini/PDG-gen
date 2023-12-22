import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        int br = b + r;
        int ans = n / br * b;
        int rem = n % br;
        ans += Math.min(rem, b);

        System.out.println(ans);
    }
}