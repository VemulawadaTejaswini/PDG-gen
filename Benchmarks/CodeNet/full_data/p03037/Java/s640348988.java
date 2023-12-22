import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        execute();
    }

    private static void execute() {

        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        int[] imos = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int start = Integer.parseInt(sc.next());
            int end = Integer.parseInt(sc.next());
            for (; start <= end; start++) {
                imos[start]++;
            }
        }

        int max = Arrays.stream(imos).max().orElse(0);

        int ans = 0;
        for (int i : imos) {
            if (i == max) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
