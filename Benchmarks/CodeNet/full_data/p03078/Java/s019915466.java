import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();

        long[] A = new long[X];
        long[] B = new long[Y];
        long[] C = new long[Z];
        for (int i = 0; i < X; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < Y; i++) {
            B[i] = sc.nextLong();
        }
        for (int i = 0; i < Z; i++) {
            C[i] = sc.nextLong();
        }

        List<Long> AB = new ArrayList<Long>();
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                AB.add(A[i] + B[j]);
            }
        }
        Collections.sort(AB, Collections.reverseOrder());

        List<Long> ABC = new ArrayList<Long>();
        for (int i = 0; i < Math.min(K, AB.size()); i++) {
            for (int j = 0; j < Z; j++) {
                ABC.add(AB.get(i) + C[j]);
            }
        }
        Collections.sort(ABC, Collections.reverseOrder());
        for (int i = 0; i < K; i++) {
            System.out.println(ABC.get(i));
        }

    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
