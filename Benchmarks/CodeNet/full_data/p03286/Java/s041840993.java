import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        String ans = "";
        while (n != 0) {
            if (n % 2 != 0) {
                n--;
                ans = "1" + ans;
            } else {
                ans = "0" + ans;
            }
            n /= -2;
        }
        System.out.println(ans);
    }
}
