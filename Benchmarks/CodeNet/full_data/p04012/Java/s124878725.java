import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();

        Map<Integer, String> w_parts = new HashMap<>();

        for (int i = 0; i < w.length(); i++) {
            w_parts.put(i, String.valueOf(w.charAt(i)));
        }

        Map<Integer, String> w_parts2 = sort(w_parts);

        boolean judgement = false;

        for (int i = 0; i < w_parts2.size();) {
            String s = w_parts2.get(i);
            if (i != w_parts2.size() - 1) {
                int judge = 0;
                for (int j = i; s.equals(w_parts2.get(j)); j++) {
                    judge++;
                }

                if (judge % 2 == 1) {
                    judgement = false;
                    break;
                } else if (judge % 2 == 0 && judge != 0) {
                    i += judge;
                    judgement = true;
                }
            }

        }

        if (judgement) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static Map<Integer, String> sort(Map<Integer, String> map) {
        String[] character = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        boolean flag = true;

        for (int q = 0; flag; q++) {
            flag = false;

            for (int i = map.size() - 1; i >= q + 1; i--) {
                String s1 = map.get(i);
                String s2 = map.get(i - 1);

                int index1 = 0;
                int index2 = 0;

                loop1:
                for (int j = 0; j < character.length; j++) {
                    int p = 0;
                    if (s1.equals(character[j])) {
                        index1 = j;
                        p++;
                    }

                    if (s2.equals(character[j])) {
                        index2 = j;
                        p++;
                    }

                    if (p == 2) {
                        break loop1;
                    }
                }

                if (index1 < index2) {
                    map.put(i, s2);
                    map.put(i - 1, s1);
                }

                flag = true;


            }
        }

        return map;
    }
}