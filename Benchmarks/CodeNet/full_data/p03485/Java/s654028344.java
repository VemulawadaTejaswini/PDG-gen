import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = Math.ceil((a + b) / 2);

        System.out.println((int)c);
    }
}