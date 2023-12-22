import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ans += (d - 1) / m + 1;
        }
        System.out.println(ans);
    }
}
