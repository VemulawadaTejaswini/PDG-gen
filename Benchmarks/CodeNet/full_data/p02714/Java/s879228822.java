import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<Character, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            Set<Integer> set = new HashSet<>();
            if (map.containsKey(c)) {
                set = map.get(c);
            }
            set.add(i);
            map.put(c, set);
        }
        Set<Integer> rset = map.get('R');
        List<Integer> rlist = new ArrayList<>(rset);
        Set<Integer> gset = map.get('G');
        List<Integer> glist = new ArrayList<>(gset);
        Set<Integer> bset = map.get('B');
        long sum = 0;
        for (int i = 0; i < rset.size(); i++) {
            for (int j = 0; j < glist.size(); j++) {
                int r = rlist.get(i);
                int g = glist.get(j);
                sum += bset.size();
                if (bset.contains(Math.max(r, g) + Math.abs(r - g))) {
                    sum--;
                }
                if ((r + g) % 2 == 0 && bset.contains((r + g) / 2)) {
                    sum--;
                }
                if (bset.contains(Math.min(r, g) - Math.abs(r - g))) {
                    sum--;
                }
            }
        }
        System.out.println(sum);
    }

}
