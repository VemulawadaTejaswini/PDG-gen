import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] array = readIntArray(reader);
            int L = array[0];
            int R = array[1];

            if (L + 2019 <= R) {
                System.out.println(0);
                System.exit(0);
            }

            L %= 2019;
            R %= 2019;
            if (R <= L) {
                System.out.println(0);
                System.exit(0);
            }

            int mod = 2019;
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    int m = (i * j) % 2019;
                    if (m < mod) {
                        mod = m;
                    }
                }
            }

            System.out.println(mod);
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
