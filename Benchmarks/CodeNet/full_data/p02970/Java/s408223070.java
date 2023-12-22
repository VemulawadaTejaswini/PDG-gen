import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int d = sc.nextInt();
        System.out.println((int) (Math.ceil(n / (1 + 2 * d))));
    }
}
