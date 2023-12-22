import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int bottomArea = a * a;
        int cube = a * a * a;
        int volume = bottomArea * b;
        double radian = 0.0;

        if (volume / 2 <= x) {
            radian = Math.atan((2.0 * volume - 2.0 * x) / cube);
        } else {
            radian = (Math.PI / 2.0) - Math.atan((2.0 * x) / (a * b * b));
        }
        double angle = radian * 180.0 / Math.PI;
        out.printf("%.10f\n", angle);
        out.flush();
    }
}
