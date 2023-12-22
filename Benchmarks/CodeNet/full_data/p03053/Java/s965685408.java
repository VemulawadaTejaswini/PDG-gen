import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] dx = new int[] {1, 0, -1, 0};
    static int[] dy = new int[] {0, -1, 0, 1};
    static int H;
    static int W;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        H = scanner.nextInt();
        W = scanner.nextInt();
        int all = H*W;
        int xblack = 0; int yblack = 0;
        int currentNrofBlacks = 0;

        char[][] blocks = new char[H][W];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            String line = scanner.next();
            for (int j = 0; j < W; j++) {
                char c = line.charAt(j);
                if (c == '#') {
                    currentNrofBlacks++;
                    xblack = i; yblack = j;
                    queue.add(new int[] {i, j, 0});
                }
                blocks[i][j] = c;
            }
        }

        visited = new boolean[H][W];
        int operations = 0;

        queue.add(new int[]{xblack,yblack,0});

        while (!queue.isEmpty()) {
            int[] current = queue.remove();

            int x = current[0]; int y = current[1]; int tmpOps = current[2] + 1;

            if (returns(x,y)) {
                continue;
            }

            if (currentNrofBlacks == all) {
                operations = tmpOps;
                break;
            }

            char c = blocks[x][y];

            if (c == '#') { // black
                for (int i = 0; i <4; i++) {
                    int nextX = x + dx[i];
                    int nextY = y + dy[i];
                    if (!returns(nextX,nextY) && blocks[nextX][nextY] == '.') {
                        blocks[nextX][nextY] = '#';
                        currentNrofBlacks++;
                        queue.add(new int[]{nextX, nextY, new Integer(tmpOps)});
                    }
                }
            }

            visited[x][y] = true;

        }

        System.out.println(operations);
    }

    static boolean returns(int x, int y) {
       return (x < 0 || x >= H || y < 0 || y >= W || visited[x][y]);
    }
}