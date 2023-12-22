import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        int b = sc.nextInt();
        double x = sc.nextInt();

        double res;
        if(x >= a * a * b / 2) {
            double y = (a * a * b - x) / a / a * 2;
            res = Math.atan2(y, a);
        } else {
            double y = (x / a / b) * 2;
            res = Math.atan2(b, y);
        }
        System.out.println(res / Math.PI / 2 * 360);
    }
}
