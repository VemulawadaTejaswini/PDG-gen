import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a  = sc.nextDouble();
        double b  = sc.nextDouble();
        double c  = sc.nextDouble();

        double k  = sc.nextDouble();

        System.out.println((int)((a - b) * Math.pow(-1, k)));
    }
}
