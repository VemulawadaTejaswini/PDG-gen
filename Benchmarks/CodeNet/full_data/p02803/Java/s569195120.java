import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int nRows = Integer.parseInt(st.nextToken());
        int nCols = Integer.parseInt(st.nextToken());
        char[][] maze = new char[nRows][nCols];
        for (int i = 0; i < nRows; i++) {
            maze[i] = in.readLine().toCharArray();
        }

        int ans = 0;
        ArrayList<Coor> points = new ArrayList<>();
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nCols; j++) {
                if (maze[i][j] == '#') continue;
                points.add(new Coor(i, j));
            }
        }

        for(Coor src : points) {
            int d = dist(maze, src);
            ans = Math.max(ans, d);
        }

        out.println(ans);

    }

    static class Coor {
        int r, c;

        public Coor(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coor coor = (Coor) o;
            return r == coor.r &&
                    c == coor.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(r, c);
        }

        @Override
        public String toString() {
            return "Coor{" +
                    "r=" + r +
                    ", c=" + c +
                    '}';
        }
    }

    static  int DX[] = {1,0,-1,0};
    static  int DY[] = {0,1,0,-1};


    static int dist(char[][] maze, Coor src) {
        int nRows = maze.length;
        int nCols = maze[0].length;
        LinkedList<Coor> queue = new LinkedList<>();
        queue.offer(src);
        HashSet<Coor> visited = new HashSet<>();
        LinkedList<Integer> S = new LinkedList<>();
        S.offer(0);
        int ans = 0;
        while (!queue.isEmpty()) {
            Coor curr = queue.poll();
            int r = curr.r;
            int c = curr.c;
            int steps = S.poll();
            if (visited.contains(curr)) continue;
            if (r < 0 || r >= nRows || c < 0 || c >= nCols) continue;
            if (maze[r][c] == '#') continue;
            visited.add(curr);
            ans = Math.max(ans, steps);
            for (int m = 0; m < 4; m++) {
                int nr = r + DX[m];
                int nc = c + DY[m];
                queue.offer(new Coor(nr, nc));
                S.offer(steps+1);
            }
        }
        return ans;
    }

}
