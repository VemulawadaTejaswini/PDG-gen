import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (map.containsKey(b[i])) {
                List<Integer> list = map.get(b[i]);
                list.add(a[i]);
                map.put(b[i], list);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(a[i]);
                map.put(b[i], list);
            }
        }

        long sum = 0;
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            List<Integer> list = e.getValue();
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if (sum > e.getKey()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");


    }

}
