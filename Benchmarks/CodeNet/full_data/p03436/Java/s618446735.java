import java.awt.*;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int H = nextInt();
        int W = nextInt();

        char[][] c = new char[H][W];
        int sum = 0;
        for(int i=0; i<H; i++){
            char[] list = next().toCharArray();
            for(int j=0; j<W; j++){
                c[i][j] = list[j];
                if(list[j] == '.') sum++;
            }
        }

        Deque<Point> deque = new ArrayDeque<>();
        deque.add(new Point(0, 0));

        Point goal = new Point(W-1, H-1);
        int count = 0;

        boolean reached = false;
        int[] dx = {-1, 0, 0, 1}, dy = {0, -1, 1, 0};
        outer:for(;!deque.isEmpty(); count++){
            for(int i=deque.size(); i>0; i--){
                Point poll = deque.poll();
                if(poll.equals(goal)){
                    reached = true;
                    break outer;
                }
                c[poll.y][poll.x] = '#';
                for(int j=0; j<4; j++){
                    int x = poll.x + dx[j];
                    int y = poll.y + dy[j];
                    if(x < 0 || x >= W || y < 0 || y >= H) continue;
                    if(c[y][x] == '.'){
                        c[y][x] = '#';
                        deque.add(new Point(x, y));
                    }
                }
            }
        }
        println(!reached ? -1 : sum-count-1);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}
