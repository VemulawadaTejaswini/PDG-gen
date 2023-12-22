import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        int cnt = 0;
        while (true) {
            if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
                System.out.println(cnt);
                return;
            }
            if (a == b && b == c) {
                System.out.println(-1);
                return;
            }
            long tmpa = (b + c) / 2;
            long tmpb = (c + a) / 2;
            long tmpc = (a + b) / 2;
            a = tmpa;
            b = tmpb;
            c = tmpc;
            cnt++;
        }
    }

}
