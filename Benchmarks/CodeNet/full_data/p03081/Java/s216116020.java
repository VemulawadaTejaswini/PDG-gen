import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int Q = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int[] monsters = new int[N];
        for (int i = 0; i < N; i++) {
            monsters[i] = 1;
        }

        char[] ts = new char[Q];
        char[] ds = new char[Q];

        for (int i = 0; i < Q; i++) {
            ts[i] = sc.next().toCharArray()[0];
            ds[i] = sc.next().toCharArray()[0];
        }

        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char)('A' + i), new ArrayList<>());
        }

        for (int i = 0; i < S.length; i++) {
            map.get(S[i]).add(i);
        }

        for (int i = 0; i < Q; i++) {
            List<Integer> indexes = map.get(ts[i]);
            if (ds[i] == 'L') {
                List<Integer> increment = new ArrayList<>();
                List<Integer> values = new ArrayList<>();
                for (Integer index : indexes) {
                    if (monsters[index] > 0) {
                        if (index != 0) {
                            increment.add(index - 1);
                            values.add(monsters[index]);
                        }
                        monsters[index] = 0;
                    }
                }
                int j = 0;
                for (Integer index : increment) {
                    if (index >= 0) monsters[index] += values.get(j);
                    j++;
                }
            }
            if (ds[i] == 'R') {
                List<Integer> increment = new ArrayList<>();
                List<Integer> values = new ArrayList<>();
                for (Integer index : indexes) {
                    if (monsters[index] > 0) {
                        if (index != (N - 1)) {
                            increment.add(index + 1);
                            values.add(monsters[index]);
                        }
                        monsters[index] = 0;
                    }
                }
                int j = 0;
                for (Integer index : increment) {
                    if (index < N) monsters[index] += values.get(j);
                    j++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += monsters[i];
        }
        System.out.println(ans);
    }
}