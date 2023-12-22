
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long W = scan.nextLong();
        int[] w = new int[N];
        long[] v = new long[N];
        List<Long>[] list = new List[4];
        for (int i = 0; i < 4; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            w[i] = scan.nextInt();
            v[i] = scan.nextLong();
            list[w[i]-w[0]].add(v[i]);
        }
        for (int i = 0; i < 4; i++) {
            Collections.sort(list[i], Comparator.reverseOrder());
        }
        List<Long>[] sum = new List[4];
        for (int i = 0; i < 4; i++) {
            sum[i] = new ArrayList<>();
            sum[i].add(0L);
            for (int j = 1; j <= list[i].size(); j++) {
                sum[i].add(sum[i].get(j - 1) + list[i].get(j-1));
            }
        }
        long ans = 0;
        for (int i = 0; i <= list[0].size(); i++) {
            for (int j = 0; j <= list[1].size(); j++) {
                for (int k = 0; k <= list[2].size(); k++) {
                    for (int l = 0; l <= list[3].size(); l++) {
                        long sumW = (i + j + k + l) * w[0];
                        sumW += j;
                        sumW += k * 2;
                        sumW += l * 3;
                        if (W < sumW) {
                            continue;
                        }
                        long sumV = sum[0].get(i)+sum[1].get(j)+sum[2].get(k)+sum[3].get(l);
                        ans = Math.max(ans, sumV);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
