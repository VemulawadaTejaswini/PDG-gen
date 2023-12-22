import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean bl = true;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            n -= a;
            if (n < 0) {
                bl = false;
                break;
            }
        }
        System.out.println(bl?n:-1);
    }
}
