import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int count = 1;
        int total = 0;
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            if (x == prev) {
                count++;
            } else {
                total += count / 2;
                prev = x;
                count = 1;
            }
        }
        total += count / 2;
       System.out.println(total);
    }
}
