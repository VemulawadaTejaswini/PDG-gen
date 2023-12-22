import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long W = in.nextLong();
            long H = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            System.out.println((W * H / 2.0) + " " + (W == H && x == y && x == W / 2 ? 1 : 0));
        }
    }
}
