import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int D = Integer.parseInt(arr[1]);

        String[][] arr2 = new String[N][D];
        for (int i = 0; i < N; i++) {
            arr2[i] = br.readLine().split(" ");       
        }

        for (int i = 0; i < N - 1; i++) {
            String[] y = arr2[i];
            for (int j = i + 1; j < N; j++) {
                String[] z = arr2[j];
                ans += check(D, y, z);
            }
        }

        out.println(ans);
        out.close();
    }

    private static int check(int D, String[] arr1, String[] arr2) {
        int sum = 0;
        for (int i = 0; i < D; i++) {
            int y = Integer.parseInt(arr1[i]);
            int z = Integer.parseInt(arr2[i]);
            sum += Math.pow(y - z, 2);
        }
        double sqrt = Math.sqrt(sum);
        return sqrt % 1 == 0 ? 1 : 0;
    }
}
