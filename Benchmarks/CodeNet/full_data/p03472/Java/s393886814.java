import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static class Period {
        int s;
        int e;

        public Period(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), H = scanner.nextInt();
        scanner.nextLine();
        int[][] attack = new int[N][2];
        int max = 0;
        for (int i = 0; i < N; i++) {
            attack[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            max = Math.max(max, attack[i][0]);
        }

        Arrays.sort(attack, Comparator.comparingInt(x -> -x[1]));
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (attack[i][1] < max) {
                break;
            }
            cnt++;
            H -= attack[i][1];
            if (H <= 0) {
                break;
            }
        }

        if (H > 0) {
            cnt += H % max == 0 ? H / max : H / max + 1;
        }

        System.out.println(cnt);
    }

}