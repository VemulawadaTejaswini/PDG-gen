import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N - 1; i++) {
            A[sc.nextInt()]++;
        }

        for (int i = 1; i < N; i++) {
            System.out.println(A[i]);
        }

    }
}
