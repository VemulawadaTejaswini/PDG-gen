import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        int queue = 0;
        while (n > queue) {
            if (queue + a >= n) {
                System.out.println(ans + (n - queue));
                return;
            }
            if (queue + a+b >= n) {
                System.out.println(ans + a);
                return;
            }
            queue += (a+b);
            ans += a;
        }
        System.out.println(ans);
    }
}