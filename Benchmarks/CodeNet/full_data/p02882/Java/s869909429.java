import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();

        double ans = 0;

        double h = 0;

        if (a*a*b*Math.pow(2, -1)<=x){
            h = 2*b - 2*x*Math.pow(a, -2);
            ans = h*Math.pow(a, -1);
            System.out.print(Math.toDegrees(Math.atan(ans)));
        }else {
            ans = a*b*b*Math.pow((2*x), -1);
            System.out.print(Math.toDegrees(Math.atan(ans)));

        }


    }
}