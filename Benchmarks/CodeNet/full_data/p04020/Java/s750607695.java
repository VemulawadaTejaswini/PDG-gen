import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count += (x + prev) / 2;
            if (x == 0) {
                prev = 0;
            } else {
                prev = (x + prev) % 2;
            }
        }
        System.out.println(count);
    }
}