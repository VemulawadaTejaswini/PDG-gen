import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int M = array[1];

            int[] A = new int[M];
            int[] B = new int[M];
            int[][] C = new int[M][];
            for (int i = 0; i < M; i++) {
                array = readIntArray(reader);
                A[i] = array[0];
                B[i] = array[1];
                C[i] = readIntArray(reader);
            }

            int S = 0;
            int[] Z = new int[N + 1];
            for (int i = 0; i < M; i++) {
                S += A[i];
                for (int c : C[i]) {
                    Z[c]++;
                }
            }

            for (int i = 1; i <= N; i++) {
                if (Z[i] == 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }

            int min = min(S, Z, A, C, 0);
            System.out.println(min);
        }
    }

    public static int min(int S, int[] Z, int[] A, int[][] C, int index) {
        if (index == A.length) {
            return S;
        }

        boolean removable = true;
        for (int i = 0; i < C[index].length; i++) {
            if (Z[C[index][i]] == 1) {
                removable = false;
                break;
            }
        }

        if (!removable) {
            return min(S, Z, A, C, index + 1);
        }

        int S1 = min(S, Z, A, C, index + 1);

        int[] Z2 = Arrays.copyOf(Z, Z.length);
        for (int i = 0; i < C[index].length; i++) {
            Z2[C[index][i]]--;
        }
        int S2 = min(S - A[index], Z2, A, C, index + 1);

        return Math.min(S1, S2);
    }

    public static int[] readIntArray(BufferedReader reader) throws Exception {
        String[] str = reader.readLine().split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        return array;
    }

}
