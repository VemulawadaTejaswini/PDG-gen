import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();

        int threshold = a * a * b / 2;
        double degree;
        if (x <= threshold) {
            double z = ((double) x) * 2 / a / b;
            degree = 90 - Math.toDegrees(Math.atan(z / b));
        }
        else {
            int space = a * a * b - x;
            double z = (double) space * 2 / a / a;
            degree = Math.toDegrees(Math.atan(z / a));
        }
        System.out.println(degree);
    }
}
