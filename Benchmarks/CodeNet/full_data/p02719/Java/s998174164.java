import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b;
        a = scanner.nextLong();
        b = scanner.nextLong();
        if (b == 1) {
            System.out.println(0);
            return;
        }
        if (a < Math.abs(a - b)) {
            System.out.println(a);
            return;
        }
        long temp;
        while (true) {
            temp = Math.abs(a - b);
            if (temp >= a) {
                System.out.println(a);
                return;
            }
            a = temp;
        }
    }

}