
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 1000000000;
        for (int i = 0 ; i < s.length() - 2 ; i++) {
            int n = Integer.valueOf(s.substring(i, i+ 3));
            ans = Math.min(ans, Math.abs(n - 753));
        }
        System.out.println(ans);
    }

}