import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double D = sc.nextDouble();
        double N = sc.nextInt();
        
        final double n = 100.0;
        
        System.out.println((int)(Math.pow(n, D)*N));
        
    }
}