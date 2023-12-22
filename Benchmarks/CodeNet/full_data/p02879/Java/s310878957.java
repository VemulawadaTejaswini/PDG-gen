import java.util.Scanner;

public class Main {
    /**
     * 9x9
     * @param 1 ≤ A ≤ 20
     * @param 1 ≤ B ≤ 20
     */
    public static void main(String...args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 10 && b < 10) {
                System.out.println(a * b);
            } else {
                System.out.println(-1);
            }
        }
    }
}