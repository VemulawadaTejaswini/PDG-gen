import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt();
        scanner.nextLine();
        List<Integer> pos = new ArrayList<>() ;
        for (int i = 0; i < H; i++) {
            int[] row = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < W; j++) {
                if (row[j] % 2 == 1) {
                    pos.add((i << 10) + j);
                }
            }
        }
        long cnt = 0;
        StringBuilder sb = new StringBuilder();
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < pos.size(); i++) {
            if (used.contains(pos.get(i))) {
                continue;
            }
            used.add(pos.get(i));
            int y1 = pos.get(i) >> 10;
            int x1 = pos.get(i) & ((1 << 10) - 1);

            int min = -1;
            int minDiff = Integer.MAX_VALUE;
            for (int j = i + 1; j < pos.size(); j++) {
                while (used.contains(pos.get(j))) {
                    continue;
                }
                int y2 = pos.get(j) >> 10;
                int x2 = pos.get(j) & ((1 << 10) - 1);
                int diff = Math.abs(y1 - y2) + Math.abs(x1 - x2);
                if (minDiff > diff) {
                    minDiff = diff;
                    min = j;
                }
            }

            if (min == -1) {
                break;
            }

            used.add(pos.get(min));
            int y2 = pos.get(min) >> 10;
            int x2 = pos.get(min) & ((1 << 10) - 1);
            while (y1 != y2) {
                cnt++;
                if (y1 < y2) {
                    sb.append(String.format("%d %d %d %d\n", y1 + 1, x1 + 1, y1 + 2, x1 + 1));
                    y1++;
                } else {
                    sb.append(String.format("%d %d %d %d\n", y1 + 1, x1 + 1, y1, x1 + 1));
                    y1--;
                }
            }
            while (x1 != x2) {
                cnt++;
                if (x1 < x2) {
                    sb.append(String.format("%d %d %d %d\n", y1 + 1, x1 + 1, y1 + 1, x1 + 2));
                    x1++;
                } else {
                    sb.append(String.format("%d %d %d %d\n", y1 + 1, x1 + 1, y1 + 1, x1));
                    x1--;
                }
            }
        }

        System.out.println(cnt);
        System.out.println(sb.toString());
    }

}
