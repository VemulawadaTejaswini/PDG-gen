import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double area = w / 2 * h;
        System.out.print(area + " ");

        int n = (w / 2 == x && h / 2 == y) ? 1 : 0;
        System.out.print(n);
    }
}