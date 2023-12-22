import java.util.Scanner;

public class Main {

    static double circumference(double r){
        double PI = 3.1415;
        double cir = 2*PI*r;
        return cir;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double result = Math.round(circumference(r) * 1000) / 1000.0;
        System.out.println("Circumference = "+ result);
    }

}



