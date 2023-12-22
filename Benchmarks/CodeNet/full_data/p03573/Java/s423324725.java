import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 2017/10/20 7:02.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A == B) {
                System.out.println(C);
            } else if (A == C) {
                System.out.println(B);
            } else {
                System.out.println(A);
            }
        }
    }
}