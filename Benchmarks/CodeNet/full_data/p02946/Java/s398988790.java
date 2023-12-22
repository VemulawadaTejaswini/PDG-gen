import java.util.Scanner;

public class Main {
    static final int MIN = -1000000;
    static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();

        for (int i = Math.max(MIN, X - K + 1); i <= Math.min(MAX, X + K - 1); i++) {
            System.out.print(i + " ");
        }
    }
}
