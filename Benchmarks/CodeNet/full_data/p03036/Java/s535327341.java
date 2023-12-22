import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int r = sc.nextInt();
        final int D = sc.nextInt();
        final int[] x = new int[11];
        x[0] = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            x[i] = (r * x[i-1]) - D;
            System.out.println(x[i]);
        }
    }
}
