import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double  c = sc.nextInt();
        double right = c - a - b;
        double left = Math.sqrt(4 * a * b);
        if (left < right)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}