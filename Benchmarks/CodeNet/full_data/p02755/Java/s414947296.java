import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        int ans = (int) (B/0.10);

        for (Double i = 0.00; i < 1.00; i += 0.001) {
            for (Double j = 0.00; j < 1.00; j += 0.001) {
                int x = (int) ((A + i) / 0.08);
                int y = (int) ((B + j) / 0.10);
                if (x == y && ans >= y) {
                    ans = x;
                    System.out.println(ans);
                    System.exit(0);
                    break;
                }
            }
        }

        System.out.println(-1);
        sc.nextLine();
    }
}