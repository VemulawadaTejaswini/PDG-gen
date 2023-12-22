import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while (m-- > 0) {
            n -= sc.nextInt();
        }
        if (n < 0) {
            System.out.println(-1);
        } else {
            System.out.println(n);
        }
    }
}
