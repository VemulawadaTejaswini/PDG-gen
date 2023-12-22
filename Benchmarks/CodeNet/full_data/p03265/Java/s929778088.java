import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xyxy = scanner.nextLine().split(" ", 4);
        int x1 = Integer.parseInt(xyxy[0]);
        int y1 = Integer.parseInt(xyxy[1]);
        int x2 = Integer.parseInt(xyxy[2]);
        int y2 = Integer.parseInt(xyxy[3]);

        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        if (x1 == x2) {
            if (y1 < y2) {
                x3 = x1 - (y2 - y1);
                y3 = y2;
                x4 = x1 - (y2 - y1);
                y4 = y1;
            } else {
                x3 = x1 + (y1 - y2);
                y3 = y2;
                x4 = x1 + (y1 - y2);
                y4 = y1;
            }
        } else {
            if (x1 < x2) {
                x3 = x2;
                y3 = y1 + x2 - x1;
                x4 = x1;
                y4 = y1 + x2 - x1;
            } else {
                x3 = x2;
                y3 = y1 - (x1 - x2);
                x4 = x1;
                y4 = y1 - (x1 - x2);
            }
        }
        System.out.printf("%d %d %d %d\n", x3, y3, x4, y4);
    }
}
