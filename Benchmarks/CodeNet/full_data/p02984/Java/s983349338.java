import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = readInt(reader);
            int[] A = readIntArray(reader);

            StringBuilder sb = new StringBuilder();
            int s = 0;
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    for (int j = 0; j < N; j++) {
                        if (j % 2 == 0) {
                            s += A[j];
                        } else {
                            s -= A[j];
                        }
                    }
                } else {
                    s = -s + A[(i - 1 + N) % N] * 2;
                }

                sb.append(s).append(" ");
            }

            sb.delete(sb.length() - 1, sb.length());
            System.out.println(sb.toString());
        }
    }

    public static int readInt(BufferedReader reader) throws Exception {
        return Integer.parseInt(reader.readLine());
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
