import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        int upper = X + (K - 1);
        int lower = X - (K - 1);
        for (int i = lower; i <= upper; i++) {
            if (i == upper) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
