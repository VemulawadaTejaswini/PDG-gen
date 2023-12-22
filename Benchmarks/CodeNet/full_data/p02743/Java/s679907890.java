import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = Long.parseLong(scan.next());
        long b = Long.parseLong(scan.next());
        long c = Long.parseLong(scan.next());

        scan.close();

        if (a + b >= c) {
            System.out.println("No");
        } else if (4 * a * b >= (c - a - b) * (c - a - b)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

}