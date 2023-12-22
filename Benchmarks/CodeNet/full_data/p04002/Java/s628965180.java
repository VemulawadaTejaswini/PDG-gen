import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        int n = sc.nextInt();
        
        Map<Long, Map<Long, Integer>> row = new HashMap<Long, Map<Long, Integer>>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong() - 1;
            long b = sc.nextLong() - 1;
            for (int j = 0; j < 3; j++) {
                if (a - j < 0) break;
                else if (a - j > h - 3) continue;
                for (int k = 0; k < 3; k++) {
                    if (b - k < 0) break;
                    else if (b - k > w - 3) continue;
                    else {
                        if (row.containsKey(a - j)) {
                            if (row.get(a - j).containsKey(b - k)) {
                                row.get(a - j).put(b - k, row.get(a - j).get(b - k) + 1);
                            } else {
                                row.get(a - j).put(b - k, 1);
                            }
                        } else {
                            Map<Long, Integer> column = new HashMap<Long, Integer>();
                            column.put(b - k, 1);
                            row.put(a - j, column);
                        }
                    }
                }
            }
        }
        sc.close();

        long count[] = new long[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        count[0] += (h - 2 - row.size()) * (w - 2);
        for (Map<Long, Integer> map: row.values()) {
            count[0] += (w - 2 - map.size());
            for (int val: map.values()) {
                count[val]++;
            }
        }

        // count[0] = (h - 2) * (w - 2);
        // for (int i = 1; i < 10; i++) {
        //     count[0] -= count[i];
        // }

        // for (int i = 0; i < h - 2; i++) {
        //     if (row.containsKey(i)) {
        //         for (int j = 0; j < w - 2; j++) {
        //             if (row.get(i).containsKey(j)) {
        //                 count[row.get(i).get(j)]++;
        //             } else count[0]++;
        //         }
        //     } else {
        //         count[0] += (w - 2);
        //         continue;
        //     }
        // }

        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
