import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        int l = s.length();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < l - 2; i++) {
            int num = Integer.parseInt(s.substring(i, i + 3));
            ans = Math.min(ans, Math.abs(753 - num));
        }

        System.out.print(ans);
    }
}