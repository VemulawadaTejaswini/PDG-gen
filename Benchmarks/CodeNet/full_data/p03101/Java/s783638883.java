import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int H = in.nextInt();
            int W = in.nextInt();
            int h = in.nextInt();
            int w = in.nextInt();
            System.out.println((H - h) * (W - w));
        }
    }
}
