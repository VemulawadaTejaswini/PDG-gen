import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double h = x/(a*a);
        double v = 90;
        double h1 = b-h;
        double h2 = x/(a*b);
        double opt = (v*h1)/(h1+h2);
        System.out.println(opt);
    }
}