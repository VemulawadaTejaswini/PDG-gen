import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = readInt(reader);
            int[] P = readIntArray(reader);

            long sum = 0;

            for (int i = 0; i < N - 1; i++) {
                int first = P[i];
                int second = -1;

                int p;
                for (int j = i + 1; j < N; j++) {
                    p = P[j];
                    if (first < p) {
                        second = first;
                        first = p;
                    } else if (second < p) {
                        second = p;
                    }

                    sum += second;
                }
            }

            System.out.println(sum);
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
