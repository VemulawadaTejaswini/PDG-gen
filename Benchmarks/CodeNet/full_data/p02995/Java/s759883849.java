import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        long all = b - a + 1;
        long canDivC = (b - a + 1) / c;
        long canDivD = (b - a + 1) / d;
        long canDivCD = (b - a + 1) / (c * d);

        System.out.println(all - canDivC - canDivD + canDivCD);
    }
}