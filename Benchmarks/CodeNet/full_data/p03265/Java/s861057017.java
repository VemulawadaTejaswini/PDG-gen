import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;

        int xdelta = x2 - x1;
        int ydelta = y2 - y1;

        x3 = x2 - ydelta;
        y3 = y2 + xdelta;
        x4 = x3 - xdelta;
        y4 = y3 - ydelta;

        System.out.printf("%d %d %d %d",x3,y3,x4,y4);


    }
}