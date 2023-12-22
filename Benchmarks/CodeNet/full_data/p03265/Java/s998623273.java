import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            int y = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int dx = x2 - x;
            int dy = y2 - y;
            int x3 = x2 - dy;
            int y3 = y2 + dx;
            int x4 = x3 - dx;
            int y4 = y3 - dy;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }
}
