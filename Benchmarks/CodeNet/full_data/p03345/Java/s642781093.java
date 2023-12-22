import java.util.Scanner;

public class Fairness{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a  = sc.nextDouble();
        double b  = sc.nextDouble();
        double c  = sc.nextDouble();

        double k  = sc.nextDouble();

        if(Math.abs(a - b) > Math.pow(10, 9) ){
            System.out.println("Unfair");
            return;
        }
        System.out.println((int)(k % 2 == 0 ? (a - b) : (b - a)));
    }
}