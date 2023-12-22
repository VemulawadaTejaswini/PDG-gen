
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        ArrayList<ArrayDeque<Integer>> qul = new ArrayList<ArrayDeque<Integer>>(N);

        for (int i = 0; i < N; i++) {
            ArrayDeque<Integer> q = new ArrayDeque<Integer>();
            for (int j = 1; j < N; j++) {
                q.add(sc.nextInt() - 1);
            }
            qul.add(q);
        }

        // ArrayDeque<Integer>[] qul;
        // qull.toArray(qul);

        int ans = 1;
        int cnt = 0;
        while (true) {
            // HashSet<Integer> lef = new HashSet<Integer>();
            // HashSet<Integer> rif = new HashSet<Integer>();
            // ArrayList<SimpleEntry<Integer, Integer>> pairs = new
            // ArrayList<SimpleEntry<Integer, Integer>>();
            int cp = 0;
            HashSet<Integer> con = new HashSet<Integer>();
            for (int i = 0; i < N; i++) {
                if(con.contains(i))continue;
                ArrayDeque<Integer> q = qul.get(i);
                if (q.isEmpty()) {
                    continue;
                }
                int tar = q.peek();
                
                ArrayDeque<Integer> t = qul.get(tar);
                if(t.isEmpty()){
                    continue;
                }
                int pme = t.peek();

                if (i == pme && i < tar) {
                    q.poll();
                    qul.get(tar).poll();
                    con.add(tar);
                    cp++;
                    // System.out.println(i + " : "+one);
                    // lef.add(i);
                    // rif.add(one);
                    // pairs.add(new SimpleEntry<Integer, Integer>(one, two));
                }
            }
            if (cp == 0) {
                System.out.println(-1);
                return;
            }
            cnt+=cp;
            // SimpleEntry<Integer, Integer>[] list = pairs.toArray(new SimpleEntry<Integer,
            // Integer>[pairs.size()]);
            // int[] lefarr =
            // cnt += lef.size();
            // System.out.println();
            // lef.forEach((num) -> System.out.print(num + " "));
            // System.out.println();
            // rif.forEach((num) -> System.out.print(num + " "));
            // System.out.println();
            // lef.forEach((num) -> qul.get(num).poll());
            // rif.forEach((num) -> qul.get(num).poll());
            // int[] lefarr = new int[lef.size()];
            // int[] rifarr = new int[rif.size()];
            // // lifarr = rif.toArray();
            // // rifarr = rif.toArray();
            // lef.toArray(lefarr);
            // rif.toArray(rifarr);
            // for (int i = 0; i < lef.size(); i++) {
            // // SimpleEntry<Integer, Integer> se = pairs.get(i);
            // // // System.out.println(se);
            // // if (qul.get(se.getKey()).peek() == se.getValue()) {
            // // qul.get(se.getKey()).poll();
            // // qul.get(se.getValue()).poll();
            // // cnt++;
            // // }
            // qul.get(lefarr[i]).poll();
            // qul.get(rifarr[i]).poll();
            // cnt++;
            // }
            ans++;
            if (cnt == N * (N - 1) / 2) {
                System.out.println(ans);
                return;
            }
        }
    }
}