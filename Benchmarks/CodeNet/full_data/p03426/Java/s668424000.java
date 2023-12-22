import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static int[] q;
    static int [][] a;
    static Map<Integer, Tuple> aMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int d = scan.nextInt();
        a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int num = scan.nextInt();
                a[i][j] = num;
                aMap.put(num,new Tuple(i, j));
            }
        }
        int maxNum = h *w;
        q = new int[maxNum + 1];
        for (int s = 1; s <= d; s++) {
            q[s] = 0;
            for (int i = 1; i * d + s <= maxNum; i++) {
                Tuple from = aMap.get(s+d*i);
                Tuple to = aMap.get(s+d*(i-1));
                q[s+d*i] = q[s+d*(i-1)] + Math.abs(from.x - to .x) + Math.abs(from.y - to.y);
            }
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int l =scan.nextInt();
            int r =scan.nextInt();
            System.out.println(q[r] - q[l]);
        }
    }

    static class Tuple{
        int x;
        int y;
        Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

