import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, List<Integer>> groupMap = new HashMap<>();

    public static void main(String args[]) {
        groupMap.put(1, Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        groupMap.put(2, Arrays.asList(4, 6, 9, 11));
        groupMap.put(3, Arrays.asList(2));

        Scanner sc = new Scanner(System.in);

        // 入力(X Y)
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println((findGroup(x) == findGroup(y)) ? "Yes" : "No");
        sc.close();
    }    

    private static int findGroup(final int value) {
        int group = 0;
        for (int k : groupMap.keySet()) {
            List<Integer> v = groupMap.get(k);
            if (v.contains(value)) {
                group = k;
                break;
            }
        }
        return group;
    }
}