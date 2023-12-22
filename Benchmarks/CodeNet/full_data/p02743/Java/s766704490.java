import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        double d1 = a*b;
        double d2 = c-a-b;
        d2 *= d2;

        System.out.println( d1 < d2/4 ? "Yes" : "No");
    }
}