import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1;; i++) {
            if (i * i <= n)
                ans = i * i;
            else
                break;
        }
        System.out.println(ans);
    }
}
