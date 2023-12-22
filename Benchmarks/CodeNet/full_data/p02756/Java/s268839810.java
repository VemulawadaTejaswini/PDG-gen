import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        boolean order = true;
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                order ^= true;
            } else {
                int y = sc.nextInt();
                if (order ^ y == 1) {
                    sb.append(sc.next());
                } else {
                    sb.insert(0, sc.next());
                }
            }
        }
        if (!order) {
            sb.reverse();
        }
        System.out.println(sb);
    }
}
