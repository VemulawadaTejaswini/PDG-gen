import java.util.Scanner;

/**
 * 81
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            boolean ans = false;
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    if (i * j == N) {
                        ans = true;
                        break;
                    }
                }
            }

            System.out.println(ans ? "Yes" : "No");
        }
    }

}
