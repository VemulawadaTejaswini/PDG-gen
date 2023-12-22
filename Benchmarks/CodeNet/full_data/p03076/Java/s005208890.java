import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double e = sc.nextInt();
        double min = 9;
        double a1 = a / 10;
        a1 = Math.ceil(a1);
        double b1 = b / 10;
        b1 = Math.ceil(b1);
        double c1 = c / 10;
        c1 = Math.ceil(c1);
        double d1 = d / 10;
        d1 = Math.ceil(d1);
        double e1 = e / 10;
        e1 = Math.ceil(e1);
        double sum = a1 + b1 + c1 + d1 + e1;
        if (min > a % 10 && a % 10 != 0) {
            min = a % 10;
        }
        if (min > b % 10 && b % 10 != 0) {
            min = b % 10;
        }
        if (min > c % 10 && c % 10 != 0) {
            min = c % 10;
        }
        if (min > d % 10 && d % 10 != 0) {
            min = d % 10;
        }
        if (min > e % 10 && e % 10 != 0) {
            min = e % 10;
        }
        sum = (sum * 10) - 10 + min;
        System.out.println((int) sum);
    }

}
