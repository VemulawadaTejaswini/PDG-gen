import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long ans = 0;
        ans = (x / 11) * 2;
        if (x % 11 != 0) {
            if (x % 11 <= 6) {
                ans++;
            } else {
                ans += 2;
            }
        }
        System.out.println(ans);
    }
}