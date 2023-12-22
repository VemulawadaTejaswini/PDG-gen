import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
//できなかった
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<HashMap<Character, Integer>> str= new ArrayList<>();
        HashMap<Integer, HashMap<Character, Integer>> string = new HashMap<Integer, HashMap<Character, Integer>>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int cnt = 0;
        for (int j = 0; j < N; j++) {
            String s = sc.next();
            boolean flg = true;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!map.containsKey(chars[i])) {
                    map.put(chars[i], 1);
                }
                map.put(chars[i], map.get(chars[i]) + 1);
            }
            for (int k = 0; k < j - 1; k++) {
                System.out.println(str);
                if (str.get(k).equals(map)) {
//                    System.out.print(k + "回");
                    if (k != 0) {
                        cnt++;
                    }
                    cnt++;
                    flg = false;
                    break;
                }
            }
            if (flg) {
                str.add(map);
            }
            map.clear();
        }
        System.out.println(cnt);

    }
}
