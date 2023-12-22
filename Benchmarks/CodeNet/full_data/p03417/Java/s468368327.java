import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long ans;

        if (n == 1 && m == 1) {
            ans = 1;
        } else if (n == 2 || m == 2) {
            ans = 0;
        } else {
            int tate = Math.max(1, n - 2);
            int yoko = Math.max(1, m - 2);

            ans = tate * yoko;
        }

        System.out.println(ans);
    }
}