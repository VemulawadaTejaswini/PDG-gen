import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        scanner.nextLine();

        final List<List<Integer>> coordsByRow = new ArrayList<>();
        final List<List<Integer>> coordsByCol = new ArrayList<>();

        final String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            List<Integer> rlist = new ArrayList<>();
            final String row = scanner.nextLine();
            lines[i] = row;
            rlist.add(-1);
            for (int j = 0; j < w; j++) {
                if (row.charAt(j) == '#') {
                    rlist.add(j);
                }
            }
            rlist.add(w);
            coordsByRow.add(rlist);
        }

        for (int i = 0; i < w; i++) {
            List<Integer> clist = new ArrayList<>();
            clist.add(-1);
            for (int j = 0; j < h; j++) {
                if (lines[j].charAt(i) == '#') {
                    clist.add(j);
                }
            }
            clist.add(h);
            coordsByCol.add(clist);
        }

        final int[][] countByRow = new int[h][w];
        for (int i = 0; i < h; i++) {
            final List<Integer> coords = coordsByRow.get(i);
            int currentIdx = 0;

            for (int j = 0; j < w; j++) {
                if (lines[i].charAt(j) == '#') {
                    countByRow[i][j] = 0;
                    continue;
                }

                if (coords.get(currentIdx + 1) < j) currentIdx++;
                final int size = coords.get(currentIdx + 1) - coords.get(currentIdx) - 1;

                countByRow[i][j] = size;
            }
        }

        final int[][] countByCol = new int[h][w];
        for (int i = 0; i < w; i++) {
            final List<Integer> coords = coordsByCol.get(i);
            int currentIdx = 0;

            for (int j = 0; j < h; j++) {
                if (lines[j].charAt(i) == '#') {
                    countByCol[j][i] = 0;
                    continue;
                }

                if (coords.get(currentIdx + 1) < j) currentIdx++;
                final int size = coords.get(currentIdx + 1) - coords.get(currentIdx) - 1;

                countByCol[j][i] = size;
            }
        }

        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                max = Math.max(countByRow[i][j] + countByCol[i][j] - 1, max);
            }
        }

        System.out.println(max);
    }
}