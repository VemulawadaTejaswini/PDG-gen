import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > m) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (n == 1) {
            if (m == 1)
                System.out.println(1);
            else
                System.out.println(m - 2);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
