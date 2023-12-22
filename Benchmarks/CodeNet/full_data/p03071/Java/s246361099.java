import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(helper(a, b));
        sc.close();
    }

    public static int helper(int a, int b) {
        if (a < b) return helper(b, a);
        if (a - b > 1) return 2 * a - 1;
        else return a + b;
    }
}