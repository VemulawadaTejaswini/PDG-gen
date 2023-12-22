
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++)
            A[i] = K;

        for (int j = 0; j < Q; j++) {
            int Ai = sc.nextInt();
            for (int i = 0; i < A.length; i++) {
                if (Ai == i + 1)
                    continue;

                A[i] -= 1;

            }
        }

        for (int point : A) {
            System.out.println(point > 0 ? "Yes" : "No");
        }

    }
}


