import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt = new int[100_001];
        for (int n: a) {
            cnt[n]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] < 2) {
                continue;
            }
            if (cnt[i] % 2 == 1) {
                cnt[i] = 1;
            } else {
                cnt[i] = -1;
            }
        }

        long total = Arrays.stream(cnt).filter(x -> x > 0).sum();
        long even = Arrays.stream(cnt).filter(x -> x < 0).count();
        total += even;
        if (even % 2 == 1) {
            total--;
        }
        System.out.println(total);
    }

}
