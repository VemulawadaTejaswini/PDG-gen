import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        String t = sc.next();
        Map<Character, Integer> point = new HashMap<Character, Integer>() {
            {
                put('r', r);
                put('s', s);
                put('p', p);
            }
        };
        StringBuilder win = new StringBuilder();
        int num = 0;
        for (int i = 0; i < t.length(); i++) {
            win.append(winChar(t.charAt(i)));
            num += point.get(winChar(t.charAt(i)));
        }
        for (int i = t.length() - 1 - k; i >= 0; i--) {
            if (win.charAt(i) == win.charAt(i + k)) {
                num -= point.get(win.charAt(i));
                int bb = i - k;
                if (bb >= 0) {
                    char before = win.charAt(bb);
                    if (before != win.charAt(i + k)) {
                        win.setCharAt(i, other(before, win.charAt(i + k)));
                    } else {
                        win.setCharAt(i, loseChar(before));
                    }
                } else {
                    win.setCharAt(i, loseChar(win.charAt(i)));
                }
            }
        }
        System.out.println(num);
    }

    private static char other(char c1, char c2) {
        Set<Character> rsp = new HashSet<>(Arrays.asList('r', 's', 'p'));
        rsp.remove(c1);
        rsp.remove(c2);
        char ans = 'r';
        for (char c : rsp) {
            ans = c;
        }
        return ans;
    }

    private static char winChar(char c) {
        if (c == 'r') {
            return 'p';
        } else if (c == 's') {
            return 'r';
        } else {
            return 's';
        }
    }

    private static char loseChar(char c) {
        if (c == 'r') {
            return 's';
        } else if (c == 's') {
            return 'p';
        } else {
            return 'r';
        }
    }
}