import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        while (a >= 1) {
            if (k == 0) {
                break;
            }
            a--;
            k--;
        }
        while (b >= 1) {
            if (k == 0) {
                break;
            }
            b--;
            k--;
        }
        System.out.println(String.format("%s %s", a, b));
        sc.close();
    }
}
