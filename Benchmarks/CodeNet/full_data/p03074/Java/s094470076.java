import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        String S = scan.next();
        int answer = solve(N, K, S);
        System.out.println(answer);
    }
    public static int solve(int N, int K, String S) {
        char[] data = S.toCharArray();
        List<Integer> group = new ArrayList<>();
        List<Integer> kind = new ArrayList<>();
        int length = data.length;
        char prev = ' ';
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (prev != data[i]) {
                if (count != 0) {
                    group.add(count);
                    kind.add(prev == '0' ? 1 : 0);
                }
                prev = data[i];
                count = 1;
                continue;
            }
            count += 1;
        }
        if (0 < count) {
            group.add(count);
            kind.add(prev == '0' ? 1 : 0);
        }
        Integer[] group_array = group.toArray(new Integer[0]);
        Integer[] kind_array = kind.toArray(new Integer[0]);
        int len = group_array.length;
        int[] g = new int[len + 1];
        int[] k = new int[len + 1];
        Arrays.fill(g, 0);
        Arrays.fill(k, 0);
        for(int i = 0; i < len; i++) {
            g[i+1] += g[i] + group_array[i];
            k[i+1] += k[i] + kind_array[i];
        }
        int answer = 0;
        int j = 1;
        for(int i = 1; i <= len; i++) {
            if (j < i) {
                j = i;
            }
            for(; j <= len; j++) {
                if (k[j] - k[i-1] <= K) {
                    answer = Math.max(answer, g[j] - g[i - 1]);
                    continue;
                }
                break;

            }
        }
        return answer;
    }
}
