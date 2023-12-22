import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = func(h);
        System.out.println(ans);
    }

    private static long func(long h) {
        if (h == 1) return 1;
        
        return 2 * func(h/2) + 1;
    }
}