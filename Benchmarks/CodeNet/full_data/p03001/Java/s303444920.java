import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        double ans = 0.5 * w * h;

        StringBuilder builder = new StringBuilder(String.valueOf(ans));
        int flag = 0.5 * w == x && 0.5 * h == y ? 1 : 0;
        builder.append(" " + flag);

        System.out.println(builder);
    }
}