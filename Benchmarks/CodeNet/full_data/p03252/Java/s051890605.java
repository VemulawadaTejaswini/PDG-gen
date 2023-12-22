import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int n = S.length();
        if(T.length() != n) {
            System.out.println(n + ", " + T.length());
            System.out.println("No");
            System.exit(0);
        }
        int[] s = new int[n];
        int[] t = new int[n];
        HashMap<Character,Integer> hm
            = new HashMap<Character,Integer>();
        for(int i = 0; i < n; ++i) {
            char c = S.charAt(i);
            if(!hm.containsKey(c)) {
                hm.put(c, hm.size());
            }
            s[i] = hm.get(c);
        }
        hm.clear();
        for(int i = 0; i < n; ++i) {
            char c = T.charAt(i);
            if(!hm.containsKey(c)) {
                hm.put(c, hm.size());
            }
            t[i] = hm.get(c);
        }
        for(int i = 0; i < n; ++i) {
            if(s[i]!=t[i]) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
