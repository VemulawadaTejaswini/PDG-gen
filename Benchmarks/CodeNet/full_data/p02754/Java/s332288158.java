import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == 0) {
            System.out.println(a);
            return;
        }
        if (n - (a + b) > 0) {
            // 数える数がボール投入数より多い場合
            int c = n / (a + b);
            int d = n % (a + b);
            if (d - a >= 0) {
                System.out.println((c * a) + a);
            } else {
                System.out.println((c * a) + d);
            }
        } else {
            // 数える数がボール投入数より少ない場合
            if (n - a >= 0) {
                System.out.println(a);
            } else {
                System.out.println(n);
            }

        }
        sc.close();
    }
}
