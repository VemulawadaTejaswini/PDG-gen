import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int ans = 0;
        int[] l = new int[s.length + 1];
        int[] r = new int[s.length + 1];
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("<")) {
                l[i + 1] = l[i] + 1;
            }
        }
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].equals(">")) {
                r[i] = r[i + 1] + 1;
            }
        }
        for (int i = 0; i <= s.length; i++) {
            ans += Math.max(l[i], r[i]);
        }
        
        System.out.println(ans);
    }
}