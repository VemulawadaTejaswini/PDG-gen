import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] values = new long[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            int parent = sc.nextInt();
            int child = sc.nextInt();
            map.put(child, parent);
        }

        for (int i = 0; i < q; i++) {
            values[sc.nextInt() - 1] += sc.nextInt();
        }

        for (Integer key: map.keySet()
             ) {
            values[key - 1] += values[map.get(key) - 1];
        }

        StringBuilder builder = new StringBuilder();
        for (Long v: values
             ) {
            builder.append(v).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }
}