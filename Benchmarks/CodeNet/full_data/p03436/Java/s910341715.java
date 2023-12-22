import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] b = new boolean[h][w];
        int[][] d = new int[h][w];
        int MAX = 10000;
        int bw = 0;
        for(int i=0; i<h; i++) {
            String line = sc.next();
            for(int j=0; j<w; j++) {
                b[i][j] = line.charAt(j) == '.';
                if(b[i][j]) bw++;
                d[i][j] = 10000;
            }
        }

        d[0][0] = 1;
        LinkedList<P> q = new LinkedList<>();
        q.push(new P(0, 0));

        int[] dx = {1, 0, -1 ,0};
        int[] dy = {0, 1, 0, -1};

        while(!q.isEmpty()){
            P p = q.poll();
            for(int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
                if(d[nx][ny] < MAX) continue;
                d[nx][ny] = d[p.x][p.y] + 1;
                q.offer(new P(nx, ny));
            }
        }
        System.out.println( d[h-1][w-1] < MAX ? bw -  d[h-1][w-1] : -1);
    }

    static class P {
        public int x;
        public int y;
        public P(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
