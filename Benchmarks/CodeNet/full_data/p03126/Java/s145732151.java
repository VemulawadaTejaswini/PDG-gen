import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N, M;
        N = scanner.nextInt();
        M = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= M; i++) map.put(i, 0);

        for (int n = 0; n < N; n++) {
            int max = scanner.nextInt();

            for (int i = 0; i < max; i++) {
                int value = scanner.nextInt();
                map.put(value, map.get(value) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i <= M; i++) count += map.get(i) == N ? 1 : 0;

        System.out.println(count);
    }

}
