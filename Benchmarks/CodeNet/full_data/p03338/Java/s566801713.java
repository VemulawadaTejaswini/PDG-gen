import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        String s = in.nextLine();
        int[] l = new int[26], r = new int[26];
        for(char ch : s.toCharArray()) {
            r[ch - 'a']++;
        }
        int ans = 0;
        for(char ch : s.toCharArray()) {
            r[ch - 'a']--; l[ch - 'a']++;
            ans = Math.max(ans, findSameChars(l, r));
        }
        System.out.println(ans);
    }

    public static int findSameChars(int[] a, int[] b) {
        int ans = 0;
        for(int i = 0; i < 26; i++) {
            if(a[i] > 0 && b[i] > 0) ans++;
        }
        return ans;
    }
}