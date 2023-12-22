
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = Long.parseLong(scan.next());

        scan.close();

        long n500 = a / 500;

        long amari500 = a % 500;
        long n5 = amari500 / 5;

        System.out.println(1000 * n500 + 5 * n5);
    }

}
