import java.util.*;

public class Main {

    static int[] memo = new int[10];
    static int[][] c = new int[10][10];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                c[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            memo[i] = djikstra(i);
        }
        int sum = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int num = scan.nextInt();
                if(num == -1 || num == 1) {
                    continue;
                }
                sum += memo[num];
            }
        }
        System.out.println(sum);
    }

    static int djikstra(int from) {
        if (from == 1) {
            return 0;
        }
        PriorityQueue<Path> deque = new PriorityQueue<>((x, y) -> x.score - y.score);
        Set<Integer> itta = new HashSet<>();
        itta.add(from);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            if(min == from) {
                continue;
            }
            deque.add(new Path(i, c[from][i]));
        }
        while(!itta.contains(1)) {
            Path next = deque.poll();
            if(next.currentnode == 1) {
                return next.score;
            }
            itta.add(next.currentnode);
            for (int i = 0; i < 10; i++) {
                if(itta.contains(i)) {
                    continue;
                }
                deque.add(new Path(i, next.score + c[next.currentnode][i]));
            }
        }
        throw new RuntimeException();
    }

    static class Path {
        int score = 0;
        int currentnode;
        public Path(int currentnode, int score) {
            this.currentnode = currentnode;
            this.score = score;
        }
    }
}
