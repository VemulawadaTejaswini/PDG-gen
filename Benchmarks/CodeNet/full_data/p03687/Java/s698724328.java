
import java.util.*;

public class Main {
    static long MOD = 109+7;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = sc.nextLine().toCharArray();
        int n = chars.length;

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);

            int pos = -1;
            int maxLength = 0;
            for(int j = 0; j < n; j++) {
                if(chars[j] == ch) {
                    maxLength = Math.max(maxLength, j - pos - 1);
                    pos = j;
                }
            }
            maxLength = Math.max(maxLength, n - 1 - pos);
//            System.out.println(ch + ": " + maxLength);
            ans = Math.min(ans, maxLength);
        }

        System.out.println(ans);
    }
}