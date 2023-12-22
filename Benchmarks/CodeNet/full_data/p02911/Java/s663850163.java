import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int Q = s.nextInt();

        int points[] = new int[N];
        for (int i = 0; i < N; i++) {
            points[i] = K;
        }

        for (int i = 0; i < Q; i++) {
            int w = s.nextInt();
            for (int j = 0; j < N; j++) {
                if (j != w - 1) points[j]--;
            }
        }

        for (int i = 0; i < N; i++) {
            if (points[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
