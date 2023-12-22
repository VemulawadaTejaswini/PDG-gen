import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        Map<Character, Integer> sAlphaCnt = new HashMap<>();
        Map<Character, Integer> tAlphaCnt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            sAlphaCnt.put(cs, sAlphaCnt.getOrDefault(cs, 0) + 1);
            tAlphaCnt.put(ct, tAlphaCnt.getOrDefault(ct, 0) + 1);
        }
        Map<Integer, Integer> sPatternCnt = new HashMap<>();
        Map<Integer, Integer> tPatternCnt = new HashMap<>();
        for (Map.Entry<Character, Integer> e : sAlphaCnt.entrySet()) {
            sPatternCnt.put(e.getValue(), sPatternCnt.getOrDefault(e.getValue(), 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : tAlphaCnt.entrySet()) {
            tPatternCnt.put(e.getValue(), tPatternCnt.getOrDefault(e.getValue(), 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : sPatternCnt.entrySet()) {
            Integer key = e.getKey();
            if (!tPatternCnt.containsKey(key)
                    || !e.getValue().equals(tPatternCnt.get(key))) {
                System.out.println("No");
                return;
            }
        }
        for (Map.Entry<Integer, Integer> e : tPatternCnt.entrySet()) {
            Integer key = e.getKey();
            if (!sPatternCnt.containsKey(key)
                    || !e.getValue().equals(sPatternCnt.get(key))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
