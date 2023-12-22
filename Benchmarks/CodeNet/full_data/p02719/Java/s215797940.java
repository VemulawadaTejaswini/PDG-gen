

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = Long.parseLong(scan.next());
        long k = Long.parseLong(scan.next());

        scan.close();

        long a = n % k;
        long b = k - a;

        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

}
