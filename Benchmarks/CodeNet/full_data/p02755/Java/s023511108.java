import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        double A_min = A;
        double A_max = A + 0.999;
        double B_min = B;
        double B_max = B + 0.999;
        int x_min, x_max;
        int y_min, y_max;
        int ans;
        x_min = (int) Math.ceil(A_min / 0.08);
        x_max = (int) Math.floor(A_max / 0.08);
        y_min = (int) Math.ceil(B_min / 0.1);
        y_max = (int) Math.floor(B_max / 0.1);

        if (x_max < y_min || x_min > y_max) {
            ans = -1;
        } else {
            if (x_min > y_min) {
                ans = x_min;
            } else {
                ans = y_min;
            }
        }

        System.out.println(ans);
        s.close();
    }
}