import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x == w / 2 && y == h / 2) {
            System.out.print(h * w / 2 + " " + 1);
        } else {
            System.out.print(h * w / 2 + " " + 0);
        }
    }

}