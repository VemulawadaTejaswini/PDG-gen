import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long s = in.nextLong();
        in.close();
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1_000_000_000;
        long x3 = s / y2;
        long y3 = s % y2;
        System.out.printf("%d %d %d %d %d %d\n", x1, y1, x2, y2, x3, y3);
    }
}