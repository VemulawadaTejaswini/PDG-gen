import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader in;
    static int max = 0;

    public static void solve() throws IOException {
        Integer[] mn = nextArray(2);
        int m = mn[0];
        int n = mn[1];

        char[][] maze = new char[m][n];

        for (int i = 0; i < m; i++) {
            maze[i] = in.readLine().toCharArray();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maze[i][j] == '#') continue;
                bfs(i, j, maze);
            }
        }

        System.out.println(max);


    }

    private static void bfs(int i, int j, char[][] maze) {
        Queue<List<Integer>> q = new LinkedList<>();
        q.add(Arrays.asList(i, j));
        Set<List<Integer>> visited = new HashSet<>();

        int moves = 0;
        while (!q.isEmpty()) {
            Queue<List<Integer>> next = new LinkedList<>();

            while (!q.isEmpty()) {
                List<Integer> curr = q.poll();
                int x = curr.get(0);
                int y = curr.get(1);



                visited.add(curr);
                List<Integer> t1 = (Arrays.asList(x+1,y));
                List<Integer> t2 =(Arrays.asList(x,y+1));
                List<Integer> t3 =(Arrays.asList(x-1,y));
                List<Integer> t4 =(Arrays.asList(x,y-1));

                if(valid(t1,maze,visited))next.add(t1);
                if(valid(t2,maze,visited))next.add(t2);
                if(valid(t3,maze,visited))next.add(t3);
                if(valid(t4,maze,visited))next.add(t4);


            }
            if(next.isEmpty())break;
            moves++;

            q = next;
        }

        max = Math.max(moves,max);

    }

    static boolean valid(List<Integer> curr, char[][] maze,Set<List<Integer>> visited){
        int x = curr.get(0);
        int y = curr.get(1);
        if (x < 0
                || y < 0
                || x >= maze.length
                || y >= maze[0].length
                || visited.contains(curr)
                || maze[x][y] == '#')
            return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        solve();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(in.readLine().trim());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(in.readLine().trim());
    }

    static Integer[] nextArray(int n) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        return tmp;
    }

}

