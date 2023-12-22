import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        ArrayList<TreeMap<Character, Integer>> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            String tmp = s[i];
            TreeMap<Character, Integer> map = new TreeMap<>();
            for (int j = 0; j < tmp.length(); j++) {
                char key = tmp.charAt(j);
                if(map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                }else {
                    map.put(key, 1);
                }
            }
            list.add(map);
        }
        long ans = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            TreeMap<Character, Integer> map = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                TreeMap<Character, Integer> map2 = list.get(j);
                if(map.equals(map2)) ans++;
            }
        }
        System.out.println(ans);
    }
}