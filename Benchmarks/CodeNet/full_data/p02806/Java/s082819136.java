import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            List<String> S = new ArrayList<>();
            int[] T = new int[N];
            for (int i = 0; i < N; i++) {
                S.add(sc.next());
                T[i] = sc.nextInt();
            }
            String X = sc.next();

            int pos = S.indexOf(X);

            int ans = 0;
            for (int i = pos + 1; i < N; i++) {
                ans += T[i];
            }

            System.out.println(ans);
        }
    }

}
