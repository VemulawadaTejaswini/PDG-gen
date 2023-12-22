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
        }
        boolean set = true;
        int noupdate = 0;
        while (hm.size() > 0) {
            boolean update = false;
            List<Integer> toremove = new ArrayList<>();
            for (int j : hm.keySet()) {
//                System.out.println(j);
                if (set) {
                    pos[j] = 0;
                    set = false;
                }

                if (pos[j] == Integer.MAX_VALUE)
                    continue;
                for (int[] aaa : hm.get(j)) {
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
                toremove.add(j);
            }
            for (int j : toremove)
                hm.remove(j);
            if (hm.size() != 0 && !update) {
                set = true;
            }
        }
        System.out.println("Yes");
    }
}