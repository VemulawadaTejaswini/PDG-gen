import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        if (h == 1 || w == 1) {
            System.out.println("1");
            System.exit(0);
        } else if ((h % 2 == 0) || (h % 2 == 0)) {
            System.out.println(h * w / 2);
            System.exit(0);
        } else if (h % 2 == 1 && h % 2 == 1) {
            long lineHigh = h / 2 + 1;
            long lineLow = h / 2;
            System.out.println(lineHigh * (w / 2 + 1) + lineLow * (w / 2));
        }
    }
}