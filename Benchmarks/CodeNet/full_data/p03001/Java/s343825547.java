import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long W = in.nextLong();
            long H = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            System.out.println((W * H / 2.0) + " " + ((W % 2 == 0 && x == W / 2 && H % 2 == 0 && y == H / 2) ? 1 : 0));
        }
    }
}
