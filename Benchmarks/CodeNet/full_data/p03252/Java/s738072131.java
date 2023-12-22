import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        String T = scan.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        boolean answer = true;
        for (int i = 0; i < s.length; i++) {
            if (map1.containsKey(s[i])) {
                if (map1.get(s[i]) != t[i]) {
                    answer = false;
                    break;
                }
            }
            if (map2.containsKey(t[i])) {
                if (map2.get(t[i]) != s[i]) {
                    answer = false;
                    break;
                }
            }
            map1.put(s[i],t[i]);
            map2.put(t[i],s[i]);
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
