import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = stdIn.nextInt();
        }
        stdIn.close();

        Set<Integer> H = new HashSet<>();
        for (int i = 0; i < N; i++) {
            H.add(A[i]);
        }

        if (H.size() == A.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}