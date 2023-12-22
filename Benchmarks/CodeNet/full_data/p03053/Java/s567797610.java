import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    static Set<Integer> blackSet;
    static Set<Integer> whiteSet;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line0 = reader.readLine().split(" ");
        int h = Integer.parseInt(line0[0]);
        int w = Integer.parseInt(line0[1]);
        int hw = h * w;
        blackSet = new HashSet<>(hw);
        whiteSet = new HashSet<>(hw);
        for (int i = 0; i < h; i++) {
            String line = reader.readLine();
            for (int j = 0; j < w; j++) {
                if (line.charAt(j) == '#') {
                    blackSet.add(hash(i, j));
                } else {
                    whiteSet.add(hash(i, j));
                }
            }
        }
        int count = 0;
        while (whiteSet.size() > 0) {
            count++;
            Set<Integer> newBlackSet = new HashSet<>(hw);
            for (Iterator<Integer> iter = whiteSet.iterator(); iter.hasNext(); ) {
                int white = iter.next();
                int row = row(white);
                int column = column(white);
                if ((0 < row && blackSet.contains(hash(row - 1, column)))
                        || (row < (h - 1) && blackSet.contains(hash(row + 1, column)))
                        || (0 < column && blackSet.contains(hash(row, column - 1)))
                        || (column < (w - 1) && blackSet.contains(hash(row, column + 1)))) {
                    newBlackSet.add(hash(row, column));
                    iter.remove();
                }
            }
            blackSet.addAll(newBlackSet);
        }
        System.out.println(count);
    }

    static int hash(int row, int column) {
        return row * 1_000 + column;
    }

    static int row(int hash) {
        return hash / 1_000;
    }

    static int column(int hash) {
        return hash % 1_000;
    }
}
