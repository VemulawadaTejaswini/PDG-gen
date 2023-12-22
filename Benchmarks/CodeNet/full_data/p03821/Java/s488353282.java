import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a <= b) {
                count += b - a;
            } else {
                int mod = b % a;
                if (mod != 0)  count += b - mod;
            }
        }
        System.out.println(count);
    }
}