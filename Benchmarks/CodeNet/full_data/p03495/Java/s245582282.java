import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // TreeMap or HashMap
        Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (!map1.containsKey(tmp)) {
                map1.put(tmp, 1);
            } else {
                map1.put(tmp, map1.get(tmp) + 1);
            }
        }
        // size で種類数がわかる
        int size = map1.size();
        // sort するために map -> Lst -> Array
        int[] a = new int[size];
        List<Integer> aa = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            aa.add(entry.getValue());
        }
        for (int i = 0; i < size; i++) {
            a[i] = aa.indexOf(i);
        }
        Arrays.sort(a);
        int cnt = 0;
        int change = size - k;
        for (int i = 0; i < size; i++) {
            if (cnt < change) {
                cnt += a[i];
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}