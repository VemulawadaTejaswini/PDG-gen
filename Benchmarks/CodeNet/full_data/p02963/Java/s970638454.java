import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long S = sc.nextLong();

            long x1 = 0;
            long y1 = 0;
            long x2 = 1000000000;
            long y2 = 1;

            long y3 = S / x2 + 1;
            long x3 = y3 * x2 - S;

            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
        }
    }

}
