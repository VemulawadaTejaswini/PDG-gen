import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double middle = Math.sqrt(a * b) * 2;
        System.out.println((a + b + middle) < c ? "Yes" : "No");
    }
}