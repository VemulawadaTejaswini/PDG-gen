import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        double a = Math.sqrt(sc.nextInt());
        double b = Math.sqrt(sc.nextInt());
        double c = Math.sqrt(sc.nextInt());
        System.out.println(a + b < c ? "Yes" : "No");
    }
}