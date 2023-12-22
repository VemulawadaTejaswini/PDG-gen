import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        // c-a-b > 2 sqr(ab)
        double right = 2.0 * Math.sqrt((double)a * (double)b);
        System.out.println((c-a-b>right) ? "Yes" : "No");
    }
}
