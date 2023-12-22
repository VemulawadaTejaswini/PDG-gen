import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int map[][] = new int[h + 2][w + 2];
        Queue<Pos> queue = new ArrayDeque<Pos>();
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                char c = s.charAt(j);
                if (c == '#') {
                    queue.add(new Pos(i + 1, j + 1));
                    map[i + 1][j + 1] = 1;
                }
            }
        }
        Arrays.fill(map[0], -1);
        Arrays.fill(map[h + 1], -1);
        for (int i = 0; i < h + 1; i++) {
            map[i][0] = -1;
            map[i][w + 1] = -1;
        }
        int max = 0;
        while (!queue.isEmpty()) {
            Pos p = queue.poll();
            int dx[] = { 0, 1, 0, -1 };
            int dy[] = { -1, 0, 1, 0 };
            for (int i = 0; i < 4; i++) {
                int ni = p.i + dx[i];
                int nj = p.j + dy[i];
                if (map[ni][nj] == 0) {
                    map[ni][nj] = map[p.i][p.j] + 1;
                    max = Math.max(max, map[ni][nj]);
                    queue.add((new Pos(ni, nj)));
                }
            }
        }

        System.out.println(max - 1);

        sc.close();
    }
}

class Pos {
    int i, j;

    Pos(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
