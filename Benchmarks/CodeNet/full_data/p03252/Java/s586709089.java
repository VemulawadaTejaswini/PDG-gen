import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();
        String t = sc.nextLine();

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            if (m1.containsKey(s.charAt(i))) {
                if (m1.get(s.charAt(i)) != t.charAt(i)) {
                    ok = false;
                    break;
                }
            }
            else {
                m1.put(s.charAt(i), t.charAt(i));
            }

            if (m2.containsKey(t.charAt(i))) {
                if (m2.get(t.charAt(i)) != s.charAt(i)) {
                    ok = false;
                    break;
                }
            }
            else {
                m2.put(t.charAt(i), s.charAt(i));
            }
        }

        System.out.println(ok ? "Yes" : "No");

        sc.close();
    }
}