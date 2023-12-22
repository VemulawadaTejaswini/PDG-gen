import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] maze = new char[h][w];
        int[][] distance = new int[h][w];
        int countBlack = 0;
        for(int row = 0; row < h; row++) {
            String str = sc.next();
            for(int col = 0; col < w; col++) {
                char c = str.charAt(col);
                maze[row][col] = c;
                distance[row][col] = -1;
                if(c == '#') countBlack++;
            }
        }
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.addLast(new Pair(0, 0));
        maze[0][0] = '#';
        int counter = 1;
        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size != 0) {
                Pair p = queue.removeFirst();
                distance[p.y][p.x] = counter;
                for(int i = 0; i < 4; i++) {
                    int newRow = p.y + dy[i];
                    int newCol = p.x + dx[i];
                    if(newRow >= 0 && newCol >= 0 && newRow < h && newCol < w && maze[newRow][newCol] == '.') {
                        queue.addLast(new Pair(newCol, newRow));
                        maze[newRow][newCol] = '#';
                    }
                }
                size--;
            }
            counter++;
        }
        if (distance[h-1][w-1] == -1) {
            System.out.println(-1);
        } else {
            System.out.println((h * w) - countBlack - distance[h-1][w-1]);
        }
    }

    private static class Pair{
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
