import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        scanner.nextLine();
        int[][] A = new int[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] B = new int[H][W];
        for (int i = 0; i < H; i++) {
            B[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }


        Queue<PosVal> curr = new ArrayDeque<>();
        HashSet<PosVal> set = new HashSet<>();
        curr.add(new PosVal(0, 0, 0));
        set.add(new PosVal(0, 0, 0));
        int min = Integer.MAX_VALUE;

        while (!curr.isEmpty()) {
            PosVal pv = curr.poll();
            set.remove(pv);
            int d = Math.abs(A[pv.y][pv.x] - B[pv.y][pv.x]);
            if (pv.x == W - 1 && pv.y == H - 1) {
                min = Math.min(min, Math.abs(pv.val - d));
                min = Math.min(min, Math.abs(pv.val + d));
                continue;
            }
            if (pv.x < W - 1) {
                if (pv.val + d < 100 * 100
                        && !set.contains(new PosVal(pv.x + 1, pv.y, pv.val + d)))
                    curr.add(new PosVal(pv.x + 1, pv.y, pv.val + d));
                if (pv.val - d > -100 * 100
                        && !set.contains(new PosVal(pv.x + 1, pv.y, pv.val - d)))
                    curr.add(new PosVal(pv.x + 1, pv.y, pv.val - d));
            }
            if (pv.y < H - 1) {
                if (pv.val + d < 100 * 100
                        && !set.contains(new PosVal(pv.x, pv.y + 1, pv.val + d)))
                    curr.add(new PosVal(pv.x, pv.y + 1, pv.val + d));
                if (pv.val - d > -100 * 100
                        && !set.contains(new PosVal(pv.x, pv.y + 1, pv.val - d)))
                    curr.add(new PosVal(pv.x, pv.y + 1, pv.val - d));
            }
        }

        System.out.println(min);
    }

    static class PosVal {
        int x;
        int y;
        int val;

        public PosVal(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PosVal posVal = (PosVal) o;
            return x == posVal.x &&
                    y == posVal.y &&
                    val == posVal.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, val);
        }
    }

}
