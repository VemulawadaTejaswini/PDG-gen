import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String S = reader.readLine();

            for (int n = N / 2; n > 0; n--) {
                for (int i = 0; i <= N - n - n; i++) {
                    for (int j = i + n; j <= N - n; j++) {
                        boolean same = true;
                        for (int k = 0; k < n; k++) {
                            if (S.charAt(i + k) != S.charAt(j + k)) {
                                same = false;
                                break;
                            }
                        }
                        if (same) {
                            System.out.println(n);
                            System.exit(0);
                        }
                    }
                }
            }

            System.out.println(0);
        }
    }

}
