import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p, q, r, ans = 0;
        while (n-- > 0) {
            p = sc.nextInt();
            q = sc.nextInt();
            r = q - p + 1;
            ans += r;
        }
        System.out.println(ans);
    }

}
