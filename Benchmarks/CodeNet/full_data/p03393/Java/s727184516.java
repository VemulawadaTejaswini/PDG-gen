import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = -1;
        int m = -1;
        char[] ab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] flg = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == ab[j]) {
                    flg[j] = true;
                }
            }
        }
        
        if (s.length() == 26) {
            System.out.println(-1);
        } else {
            System.out.print(s);
            for (int i = 0; i < 26; i++) {
                if (flg[i] == false) {
                    System.out.println(ab[i]);
                    break;
                }
            }
        }
    }
}
