import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.next().toCharArray();

        Arrays.sort(s);
        
        int cnt = 0;
        char c = s[0];
        for (int i = 1; i < s.length; i++) {
            if (c != s[i]) {
                if (cnt < 1) {
                    System.out.println("No");
                    System.exit(0);
                }
                cnt = 0;
                c = s[i];
            } else {
                cnt++;
            }
        }
        
        System.out.println("Yes");
    }
}
