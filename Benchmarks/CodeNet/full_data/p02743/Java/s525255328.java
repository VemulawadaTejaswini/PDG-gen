import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = Long.parseLong(scan.next());
        long b = Long.parseLong(scan.next());
        long c = Long.parseLong(scan.next());

        scan.close();

        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}