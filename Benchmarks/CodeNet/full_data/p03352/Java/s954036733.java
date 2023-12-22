import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = n; i >= 1; i--) {
            int sqrt = (int)Math.sqrt(i);
            if (i == (sqrt * sqrt)) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
