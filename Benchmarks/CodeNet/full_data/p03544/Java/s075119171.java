import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if (n == 0) {
            System.out.println(2);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        long l0 = 2;
        long l1 = 1;
        long ln = 0;
        for (int i = 2; i <= n; i++) {
            ln = l0 + l1;
            l0 = l1;
            l1 = ln;
        }
        System.out.println(ln);
    }

}