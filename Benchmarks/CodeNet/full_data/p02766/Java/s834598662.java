import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 1;
        int num = k;

        for (int i = 0; i < 1000000; i++) {
            if (num > n) {
                System.out.println(ans);
                break;
            } else {
                num *= k;
                ans++;
            }
        }
    }


}
