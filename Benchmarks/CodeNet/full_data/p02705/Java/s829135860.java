import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        //scanner.nextLine();
        System.out.println(2 * pi * x);
    }
}