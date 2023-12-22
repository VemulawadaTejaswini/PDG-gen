import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            int tmp = i;
            if(s.length() > 1) {
                int x1 = Integer.parseInt(s.substring(0, 1));
                int x2 = Integer.parseInt(s.substring(1, 2));
                tmp = x1 + x2;
            }
            if(tmp >= a && tmp <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}