import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int xdiff = x1 - x2;
        int ydiff = y1 - y2;
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        if (xdiff > 0 && ydiff > 0) {
            x3 = x2 + ydiff;
            y3 = y2 - xdiff;
            x4 = x1 + ydiff;
            y4 = y1 - xdiff;
        } else if (xdiff <= 0 && ydiff > 0) {
            x3 = x2 + ydiff;
            y3 = y2 - xdiff;
            x4 = x1 + ydiff;
            y4 = y1 - xdiff;
        } else if (xdiff > 0 && ydiff <= 0) {
            x3 = x2 + ydiff;
            y3 = y2 - xdiff;
            x4 = x1 + ydiff;
            y4 = y1 - xdiff;
        } else {
            x3 = x2 + ydiff;
            y3 = y2 - xdiff;
            x4 = x1 + ydiff;
            y4 = y1 - xdiff;
        }

        System.out.print(x3);
        System.out.print(" ");
        System.out.print(y3);
        System.out.print(" ");
        System.out.print(x4);
        System.out.print(" ");
        System.out.print(y4);



    }

}