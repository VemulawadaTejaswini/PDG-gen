import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());

            String[] array = reader.readLine().split(" ");
            int diff = 0;
            for (int i = 0; i < N; i++) {
                int p = Integer.parseInt(array[i]);
                if (p != (i + 1)) {
                    diff++;
                }
            }

            if (diff <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
