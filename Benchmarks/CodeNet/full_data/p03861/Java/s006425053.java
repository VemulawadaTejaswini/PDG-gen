import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long A;
        long B;
        long x;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
            x = sc.nextLong();
        }

        long ax = ((A - 1) >= 0) ? ((A - 1) / x) + 1 : 0;
        long bx = (B / x) + 1;

        System.out.println(bx - ax);
    }

}
