import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        for (int i = 0; i < M; i++) {
            L[i] = scanner.nextInt();
            R[i] = scanner.nextInt();
        }
        scanner.close();

        // check
        int[] count = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int l = L[i];
            int r = R[i];
            for (int j = l; j <= r; j++) {
                count[j]++;
            }
        }

        // result count
        int result = 0;

        for (int c : count) {
//            System.out.println("c:" + c);
            if (c == M) {
                result++;
            }
        }

        System.out.println(result);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
