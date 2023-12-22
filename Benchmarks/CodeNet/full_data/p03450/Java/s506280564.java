import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n = in.nextInt(), m = in.nextInt();
        int[] pos = new int[n];

        Arrays.fill(pos, Integer.MAX_VALUE);

        HashMap<Integer, List<int[]>> hm = new HashMap<>();
        for (int i = 0 ; i < m; i++) {
            int l = in.nextInt() - 1, r = in.nextInt() - 1, d = in.nextInt();
            List<int[]> list = hm.getOrDefault(l, new ArrayList<>());
            list.add(new int[]{l, r, d});
            hm.put(l, list);
            List<int[]> list2 = hm.getOrDefault(r, new ArrayList<>());
            list2.add(new int[]{l, r, d});
            hm.put(r, list2);
            if (i == 0) {
                pos[l] = 0;
            }
        }
        boolean set = true;
        while (hm.size() > 0) {
            boolean update = false;
            
            for (int j = 0; j < n; j++) {
//                System.out.println(j);
                if (hm.containsKey(j) && set) {
                    pos[j] = 0;
                    set = false;
                }

                if (!hm.containsKey(j) || pos[j] == Integer.MAX_VALUE)
                    continue;
                List<int[]> todo = hm.get(j);
                for (int i = 0; i < todo.size(); i++) {
                    int[] aaa = todo.get(i);
                    int l = aaa[0], r = aaa[1], d = aaa[2];
                    if (pos[l] == Integer.MAX_VALUE) {
                        pos[l] = pos[r] - d;
                    } else if (pos[r] == Integer.MAX_VALUE) {
                        pos[r] = pos[l] + d;
                    } else {
                        if (pos[r] != pos[l] + d) {
                            System.out.println("No");
                            return;
                        }
                    }
                }
                update = true;
                hm.remove(j);
            }
            if (hm.size() != 0 && !update) {
                set = true;
            }
        }
        System.out.println("Yes");
    }
}