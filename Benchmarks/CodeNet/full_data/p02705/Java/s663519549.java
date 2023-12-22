import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.valueOf(scan.nextInt()).doubleValue();
        System.out.println(2*x*Math.PI);
    }
}
