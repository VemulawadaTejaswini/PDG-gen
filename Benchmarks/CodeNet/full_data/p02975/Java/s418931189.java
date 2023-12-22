import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        if (n % 3 != 0) {
            System.out.println("NO");
            return;
        }
        for (int value : a) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        for (int value : counts.values()) {
            if (value != n / 3 && value != 2 * n / 3 && value != n) {
                System.out.println("NO");
            }
        }
        Integer[] keys = counts.keySet().toArray(new Integer[0]);
        var possible = false;
        if (keys.length == 3) {
            if ((keys[0] ^ keys[1]) == keys[2]) {
                possible = true;
            }
        } else if (keys.length == 2) {
            if (counts.get(keys[0]) == 1) {
                if (keys[0] == 0) {
                    possible = true;
                }
            } else {
                if (keys[1] == 0) {
                    possible = true;
                }
            }
        } else if (keys.length == 1) {
            if (keys[0] == 0) {
                possible = true;
            }
        }
        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
