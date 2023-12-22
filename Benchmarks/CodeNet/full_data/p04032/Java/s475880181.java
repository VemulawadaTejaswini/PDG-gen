import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            int l = -1;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    if (l == -1) l = j;
                    else if (j - l <= 2) {
                        System.out.println((l + 1) + " " + (j + 1));
                        return;
                    }
                    else l = j;
                }
            }
        }
        System.out.println(-1 + " " + -1);
    }
}