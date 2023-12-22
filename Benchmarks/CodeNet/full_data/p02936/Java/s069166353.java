import java.util.*;

public class Main {

    private static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    private static long[] values;

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        values = new long[n];
        map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            int key = sc.nextInt();
            ArrayList<Integer> target = map.computeIfAbsent(key, k -> new ArrayList<>());
            target.add(sc.nextInt());
        }

        for (int i = 0; i < q; i++) {
            searchAndAdd(sc.nextInt(), sc.nextInt());
        }

        StringBuilder builder = new StringBuilder();
        for (Long v: values
             ) {
            builder.append(v).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }

    private static void searchAndAdd(int top, int value) {
        values[top - 1] += value;
        ArrayList<Integer> target = map.computeIfAbsent(top, k -> new ArrayList<>());
        for (Integer v : target
             ) {
            searchAndAdd(v, value);
        }
    }
}