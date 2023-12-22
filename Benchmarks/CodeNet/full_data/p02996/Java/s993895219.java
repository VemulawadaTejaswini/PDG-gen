import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "Yes";
        int n = sc.nextInt();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(map.containsKey(b)) map.get(b).add(a);
            else map.put(b, new ArrayList<>(Arrays.asList(a)));
        }
        long suma = 0;
        for(int b : map.keySet()) {
            List<Integer> list = map.get(b);
            Collections.sort(list);
            for(int a : list) {
                suma += a;
            }
            if(suma > b) {
                res = "No";
                break;
            }
        }
        System.out.println(res);
    }
}
