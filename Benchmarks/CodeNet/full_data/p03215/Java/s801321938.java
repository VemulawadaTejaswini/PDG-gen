import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            long[] cumsum = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                cumsum[i] = a[i - 1] + (i - 1 >= 0 ? cumsum[i - 1] : 0);
            }
//            Utils.debug(cumsum);

            ArrayList<Long> beauty = new ArrayList<>();
            for (int l = 0; l < N + 1; l++) {
                for (int r = l + 1; r < N + 1; r++) {
                    beauty.add(cumsum[r] - cumsum[l]);
                }
            }
            Collections.sort(beauty);
//            Utils.debug(beauty);

            long max = 0;
            for (int shift = 60; shift >= 0; shift--) {
                long mask = 1L << shift;
                int count = 0;
                for (int i = beauty.size() - 1; i >= 0; i--) {
                    if ((beauty.get(i).longValue() & mask) == 0) {
                        continue;
                    }
                    count++;
                }
                if (count >= K) {
                    max |= mask;
                    ArrayList<Long> tmp = new ArrayList<>();
                    for (int i = beauty.size() - 1; i >= 0; i--) {
                        if ((beauty.get(i).longValue() & mask) == 0) {
                            continue;
                        }
                        tmp.add(beauty.get(i).longValue());
                    }
                    beauty.clear();
                    beauty.addAll(tmp);
                }
            }

            System.out.println(max);
        }
    }
}
