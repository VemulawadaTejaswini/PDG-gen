import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static int h;
    static int w;
    static int[][] diff; // 各マスの赤・青の差分の絶対値 = | a - b |

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        int[][] a = new int[h][];
        int[][] b = new int[h][];
        diff = new int[h][];
        for (int i = 0; i < h; i++) {
            a[i] = new int[w];
            b[i] = new int[w];
            diff[i] = new int[w];
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                diff[i][j] = Math.abs(a[i][j] - b[i][j]);
//                System.out.print(diff[i][j] + " ");
            }
        }

        Map<List<Integer>, Set<Integer>> map = new HashMap<>();

        for (int j = w - 1; j >= 0; j--) {
            for (int i = h - 1; i >= 0; i--) {
//                System.out.println("(" + i + "," + j + ")");
                Set<Integer> set = calcSet(i, j, map);
                map.put(Arrays.asList(i, j), set);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int candidate : map.get(Arrays.asList(0, 0))) {
            if (candidate >= 0 && candidate < ans) {
                ans = candidate;
            }
        }
//        System.out.println(map.get(Arrays.asList(0, 0)));
        System.out.println(ans);

        sc.close();
    }

    static Set<Integer> calcSet(int i, int j, Map<List<Integer>, Set<Integer>> map) {
        Set<Integer> set = new HashSet<>();
        if (i == h - 1 && j == w - 1) {
            set.add(diff[i][j]);
            set.add(-diff[i][j]);
        } else {
            // 最右列以外
            if (j != w - 1) {
                for (int a : map.get(Arrays.asList(i, j + 1))) {
                    set.add(a + diff[i][j]);
                    set.add(a - diff[i][j]);
                }
            }
            // 最下行以外
            if (i != h - 1) {
                for (int a : map.get(Arrays.asList(i + 1, j))) {
                    set.add(a + diff[i][j]);
                    set.add(a - diff[i][j]);
                }
            }
        }
        return set;
    }

}
