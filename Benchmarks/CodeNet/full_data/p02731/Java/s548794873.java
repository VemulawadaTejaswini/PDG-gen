import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int L = sc.nextInt();

        System.out.printf("%12f\n", Math.pow(L, 3) / 27);
    }
}
