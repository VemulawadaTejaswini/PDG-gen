import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int ans = m * (m - 1) / 2 + n * (n - 1) / 2;
        System.out.println(ans);
    }
}