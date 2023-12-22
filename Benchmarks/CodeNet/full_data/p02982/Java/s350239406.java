import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int N = array[0];
            int D = array[1];
            int[][] X = new int[N][];
            for (int i = 0; i < N; i++) {
                X[i] = readIntArray(reader);
            }

            int ret = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    int sum = 0;
                    for (int d = 0; d < D; d++) {
                        sum += (X[i][d] - X[j][d]) * (X[i][d] - X[j][d]);
                    }

                    double dist = Math.sqrt(sum);
                    if (Math.abs(dist - Math.round(dist)) < 0.00000001) {
                        ret++;
                    }
                }
            }

            System.out.println(ret);
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
