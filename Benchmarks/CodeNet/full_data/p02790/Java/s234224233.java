import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String ans = "";
        if (a < b) {
            for (int i = 0; i < b; i++) {
                ans += a;
            }
        } else {
            for (int i = 0; i < a; i++) {
                ans += b;
            }
        }

        System.out.println(ans);
    }
}