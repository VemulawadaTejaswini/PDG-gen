import java.util.*;
import java.io.*;

public class Main {
    static HashMap<Integer, Integer> dp = new HashMap<>();
    static int h;
    static int w;
    static int[][] field;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        h = Integer.parseInt(first[0]);
        w = Integer.parseInt(first[1]);
        field = new int[h][w];
        for (int i = 0; i < h; i++) {
            String[] line = br.readLine().split(" ", w);
            for (int j = 0; j < w; j++) {
                field[i][j] = Integer.parseInt(line[j]);
            }
        }
        System.out.println(dfw(h - 1, w - 1, h - 1, w - 1));
    }
    
    static int dfw(int h1, int w1, int h2, int w2) {
        if (h1 == 0 && w1 == 0 && h2 == 0 && w2 == 0) {
            return field[0][0];
        }
        if (h1 < 0 || w1 < 0 || h2 < 0 || w2 < 0) {
            return -1;
        }
        int first = h1 * w + w1;
        int second = h2 * w + w2;
        int key = Math.min(first, second) * h * w + Math.max(first, second);
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        int max = 0;
        int now;
        if (h1 == h - 1 && w1 == w - 1 && h2 == h - 1 && w2 == w - 1) {
            now = field[h - 1][w - 1];
        } else if (h1 == h2 && w1 == w2) {
            return -1;
        } else {
            now = field[h1][w1] + field[h2][w2];
        }
        max = Math.max(max, dfw(h1 - 1, w1, h2 - 1, w2));
        max = Math.max(max, dfw(h1 - 1, w1, h2, w2 - 1));
        max = Math.max(max, dfw(h1, w1 - 1, h2 - 1, w2));
        max = Math.max(max, dfw(h1, w1 - 1, h2, w2 - 1));
        dp.put(key, max + now);
        return max + now;
    }
}

