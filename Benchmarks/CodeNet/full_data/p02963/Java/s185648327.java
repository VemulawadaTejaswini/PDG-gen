import java.util.Scanner;

public class Main {

    static long max = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        long x1 = 0;
        long y1 = 0;

        long x2 = max;
        long y2 = 1;


        long x3 = (max - (s % max));
        long y3 = (s + x3) / max;

        System.out.format("%d %d %d %d %d %d\n", x1, y1, x2, y2, x3, y3);
    }
}
