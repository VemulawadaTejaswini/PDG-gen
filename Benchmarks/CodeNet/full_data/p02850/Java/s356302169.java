import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N + 2];
        int[] b = new int[N + 2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            List<Integer> m = new ArrayList<>();
            if (map.containsKey(a[i])) {
                m = map.get(a[i]);
                m.add(b[i]);
                map.put(a[i], m);
            } else {
                m.add(b[i]);
                map.put(a[i], m);
            }
            if (map.containsKey(b[i])) {
                m = map.get(a[i]);
                m.add(a[i]);
                map.put(b[i], m);
            } else {
                m.add(a[i]);
                map.put(b[i], m);
            }
        }
        int count = 0;
        int[][] col = new int[N + 1][N + 1];
        List<Integer> colors = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        List<Integer> used = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            used.clear();
            p.clear();
//            System.out.println("i = " + i);
//            System.out.println("count = " + count);
            p = map.get(i);
            for (Integer j : p) {
//                System.out.println(j);
                if (col[i][j] > 0) {
//                    System.out.println("already.");
                    used.add(col[i][j]);
                }
            }
            for (Integer j : p) {
//                System.out.println("j = " + j);
                if (col[i][j] > 0) {
//                    System.out.println("already.break.");
                    continue;
                }
                for (int k = 1; k <= count; k++) {
                    if (!used.contains(k)) {
//                        System.out.println("used color for " + j);
                        col[i][j] = k;
                        col[j][i] = k;
//                        count++;
                        break;
                    }
                }
                if (col[i][j] == 0) {
//                    System.out.println("new color for " + j);
                    col[i][j] = count + 1;
                    col[j][i] = count + 1;
                    count++;
                    used.add(col[i][j]);
//                    System.out.println("count : " + count);
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < N - 1; i++) {
            System.out.println(col[a[i]][b[i]]);
        }

    }
}
