import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            char cc = c.charAt(i);
            if (ac == bc) {
                if (ac == cc) {

                } else {
                    cnt = 1;
                }
            } else if (ac == cc) {
                cnt = 1;
            } else if (bc == cc) {
                cnt = 1;
            } else {
                cnt = 2;
            }
            ans += cnt;
        }
        System.out.println(ans);

    }

}
