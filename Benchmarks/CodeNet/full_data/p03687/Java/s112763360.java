import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] data = S.toCharArray();
        int[] cnt = new int[26];
        for (int i = 0; i < data.length; i++) {
            cnt[data[i]-'a'] += 1;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            ans = Math.min(ans, solve(data, (char)(i + 'a')));
        }
        System.out.println(ans);
    }
    private int solve(char[] data, char target) {
        int count = 0;
        while (true) {
            boolean found_other = false;
            for(int i = 1; i < data.length; i++) {
                if (data[0] != data[i]) {
                    found_other = true;
                    break;
                }
            }
            if (!found_other) {
                break;
            }
            char[] new_data = new char[data.length-1];
            for (int i = 0; i < data.length-1; i++) {
                if (data[i+1] == target) {
                    new_data[i] = target;
                    continue;
                }
                new_data[i] = data[i];
            }
            count += 1;
            data = new_data;
        }
        return count;
    }
}
