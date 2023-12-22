import java.util.*;

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
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), K = scanner.nextInt();
        scanner.nextLine();
        int[][] sushi = new int[N][2];
        for (int i = 0; i < N; i++) {
            sushi[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(sushi, Comparator.comparingInt(x -> -x[1]));
        Set<Integer> added = new HashSet<>();
        List<Integer> deletable = new ArrayList<>();
        long kind = 0;
        long delicious = 0;
        for (int i = 0; i < K; i++) {
            delicious += sushi[i][1];
            if (added.add(sushi[i][0])) {
                kind++;
            } else {
                deletable.add(sushi[i][1]);
            }
        }
        Collections.reverse(deletable);

        List<Integer> addable = new ArrayList<>();
        for (int i = K; i < N; i++) {
            if (added.add(sushi[i][0])) {
                addable.add(sushi[i][1]);
            }
        }

        long ans = delicious + kind * kind;
        int i1 = 0;
        int i2 = 0;
        while (i1 < deletable.size() && i2 < addable.size()) {
            delicious -= deletable.get(i1++);
            delicious += addable.get(i2++);
            kind++;
            ans = Math.max(ans, delicious + kind * kind);
        }

        System.out.println(ans);

    }

}
