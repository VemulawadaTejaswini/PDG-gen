import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        if (a + b <= k) {
            System.out.println(0 + " " + 0);
            return;
        }
        long sub = a - k;
        if (sub <= 0) {
            long sub2 = b + sub < 0 ? 0 : b + sub;
            System.out.println(0 + " " + sub2);
        } else {
            System.out.println(sub + " " + b);
        }
    }
}