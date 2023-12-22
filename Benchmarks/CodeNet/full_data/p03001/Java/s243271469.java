import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextLong();
        long h = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.println(String.format("%f %d", w * h / 2.0, x * 2 == w && y * 2 == h ? 1 : 0));
    }
}
