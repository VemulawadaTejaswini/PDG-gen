import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int y = Math.abs(x1 - x2);
        int x = Math.abs(y1 - y2);
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        if (x1 < x2 && y1 <= y2) {
            x3 = x2 - x;
            y3 = y2 + y;
            x4 = x1 - x;
            y4 = y1 + y;
        }
        if (x1 >= x2 && y1 <= y2) {
            x3 = x2 - x;
            y3 = y2 - y;
            x4 = x1 - x;
            y4 = y1 - y;
        }
        if (x1 >= x2 && y1 > y2) {
            x3 = x2 + x;
            y3 = y2 - y;
            x4 = x1 + x;
            y4 = y1 - y;
        }
        if (x1 < x2 && y1 > y2) {
            x3 = x2 + x;
            y3 = y2 + y;
            x4 = x1 + x;
            y4 = y1 + y;
        }
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);

    }

}