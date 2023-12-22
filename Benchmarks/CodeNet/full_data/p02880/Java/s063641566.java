import java.util.Scanner;

public class Main {

    /**
     * 81
     * @param 1 ≤ N ≤ 100
     */
    public static void main(String...args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (check(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean check(int n) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == n) {
                    return true;
                }
            }
        }
        return false;
    }
}