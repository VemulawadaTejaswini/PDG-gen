package ABC121.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.next());
        int W = Integer.parseInt(scanner.next());
        int h = Integer.parseInt(scanner.next());
        int w = Integer.parseInt(scanner.next());

        final int result = H * W - (h * W) - (w * (H - h));
        System.out.println(result);
    }
}
