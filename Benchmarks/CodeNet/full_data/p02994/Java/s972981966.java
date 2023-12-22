import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int L = array[1];

            int S = 0;
            for (int i = 1; i <= N; i++) {
                S += L + i - 1;
            }

            if (L <= 0 && 0 <= L + N - 1) {
                System.out.println(S);
            } else if (Math.abs(L) <= Math.abs(L + N - 1)) {
                System.out.println(S - L);
            } else {
                System.out.println(S - L - N + 1);
            }
        }
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
