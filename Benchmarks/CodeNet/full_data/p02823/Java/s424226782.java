import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long dist = B - A;
        long ans = (dist % 2 != 0 ? Math.min(A - 1, N - B) + 1 : 0) + dist / 2;
        System.out.println(ans);
    }
}