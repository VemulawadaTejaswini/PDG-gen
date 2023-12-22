import java.util.Scanner;

public class Main {

    private static int fiveCount = 0;
    private static int sevenCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        scanner.close();

        check(A);
        check(B);
        check(C);

        boolean isFiveSevenFive = fiveCount == 2 && sevenCount == 1;

        System.out.println(isFiveSevenFive ? "YES" : "NO");
    }

    static void check(int target) {
        if (target == 5) {
            fiveCount++;
        }
        if (target == 7) {
            sevenCount++;
        }
    }


}
