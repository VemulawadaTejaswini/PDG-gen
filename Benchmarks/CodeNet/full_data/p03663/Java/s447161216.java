import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dig = -1;
        for (int i = 0, x = 9; i < 9; i++, x = x * 10 + 9) {
            System.out.println(String.format("? %d", x));
            System.out.flush();
            if (sc.next().charAt(0) == 'Y') {
                dig = i;
                break;
            }
        }
        if (dig == -1) {
            System.out.println(String.format("! %d", 1000000000));
            sc.close();
            return;
        }
        if (dig == 0) {
            for (int i = 0, x = 1; i < 9; i++, x *= 10) {
                System.out.println(String.format("? %d", x));
                if (sc.next().charAt(0) == 'N' && i > 0) {
                    System.out.println(String.format("! %d", x - 1));
                    sc.close();
                    return;
                }
            }
            for (int x = 10; x < 100; x += 10) {
                System.out.println(String.format("? %d", x));
                if (sc.next().charAt(0) == 'Y') {
                    System.out.println(String.format("! %d", x / 10));
                    sc.close();
                    return;
                }
            }
            sc.close();
            throw new Exception();
        }
        long l = 1;
        for (int i = 0; i < dig; i++) {
            l *= 10;
        }
        long r = l * 10;
        while (r - l > 1) {
            long m = (l + r) >> 1;
            System.out.println(String.format("? %d", m * 10));
            System.out.flush();
            if (sc.next().charAt(0) == 'N') {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(String.format("! %d", r));
        sc.close();
    }
}
