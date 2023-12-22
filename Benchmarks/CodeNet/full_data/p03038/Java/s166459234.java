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
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] q = new int[M][2];
        for (int i = 0; i < M; i++) {
            q[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(q, Comparator.comparingInt(x -> -x[1]));

        Queue<Integer> que = new PriorityQueue();
        for (int i: n) {
            que.add(i);
        }

        for (int i = 0; i < M; i++) {
            int cnt = q[i][0];
            int num = q[i][1];
            if (que.peek() >= num) {
                break;
            }
            while (cnt-- > 0 && que.peek() < num) {
                que.poll();
                que.add(num);
            }
        }

        System.out.println(que.stream().mapToLong(x -> x).sum());

    }

}
