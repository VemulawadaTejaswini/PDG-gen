import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(solve(s, t));
    }

    static String solve(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            smap.put((char) ('a' + i), 0);
            tmap.put((char) ('a' + i), 0);
        }

        // 文字をアルファベット毎に何個あるかを保持って比較する
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            smap.put(sc, smap.get(sc) + 1);
            tmap.put(tc, tmap.get(tc) + 1);
        }

        List<Integer> stype = new ArrayList<>();
        List<Integer> ttype = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int snum = smap.get((char) ('a' + i));
            int tnum = tmap.get((char) ('a' + i));

            if (snum != 0) {
                stype.add(snum);
            }
            if (tnum != 0) {
                ttype.add(tnum);
            }
        }
        Collections.sort(stype);
        Collections.sort(ttype);

        return stype.equals(ttype) ? "Yes" : "No";
    }
}

