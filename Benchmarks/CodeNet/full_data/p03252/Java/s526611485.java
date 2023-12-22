import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
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
        int[] hs = new int[26];
        int[] ht = new int[26];
        HashSet<Character> cs = new HashSet<>();
        for(char x : s) {
            hs[x - 'a'] += 1;
            cs.add(x);
        }
        Arrays.sort(hs);
        for(char x : t) {
            ht[x - 'a'] += 1;
            cs.remove(x);
        }
        Arrays.sort(ht);
        boolean answer = true;
        for (int i = 0; i < 26; i++) {
            if (hs[i] != ht[i]) {
                answer = false;
                break;
            }
        }
        if (cs.size() != 0) {
            answer = false;
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
