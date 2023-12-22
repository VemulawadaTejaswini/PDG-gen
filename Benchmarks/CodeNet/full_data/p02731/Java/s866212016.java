import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        if(l % 3 == 0) {
            l /= 3.0;
            l = Math.pow(l, 3);
        }else if((l % 3) % 2 == 0) {
            double a = l % 3;
            double b = (l - a) / 2.0;
            l = a * b * b;
        }
        else {
            double a = Math.ceil(l / 3);
            double b = l - a;
            double c = Math.ceil(b / 2);
            double d = l - a - c;
            l = a * c * d;
        }
        BigDecimal ll = BigDecimal.valueOf(l);
        System.out.println(ll);
    }
}