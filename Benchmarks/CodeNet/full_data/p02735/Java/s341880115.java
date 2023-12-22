import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] array = new char[h][];
        for (int i = 0; i < h; i++) {
            array[i] = sc.next().toCharArray();
        }

        // 上下左右（分岐先）の座標を配列に入れておくと、forループで回して処理できるので便利
        int[] dx = {0, 1};
        int[] dy = {1, 0};

        Deque<MyPoint> stack = new ArrayDeque<>();
        stack.addFirst(new MyPoint(0, 0,0));
        int ans = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            MyPoint p = stack.removeFirst(); // 先頭の座標を取得後、削除
            if (array[p.y][p.x] == '#') {
                p.count++;
            }
            if (p.x == w - 1 && p.y == h - 1) {
                ans = Math.min(ans, p.count);
                continue;
            }

            for (int k = 0; k < 2; k++) {
                int x = p.x + dx[k];
                int y = p.y + dy[k];
                // 分岐先の座標が、2つのif文の条件を満たすなら先頭に追加
                if (x < w && y < h) {
                    stack.addFirst(new MyPoint(x, y, p.count));
                }
            }
        }
        System.out.println(ans);
    }
    private static class MyPoint {
        private int x;
        private int y;
        private int count;

        public MyPoint(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}