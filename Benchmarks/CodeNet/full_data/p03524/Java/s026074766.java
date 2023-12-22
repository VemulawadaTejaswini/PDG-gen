import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a') {
                a++;
            } else if (ch[i] == 'b') {
                b++;
            } else {
                c++;
            }
        }
        
        
        boolean ok = true;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        if (max - min > 1) {
            ok = false;
        }
        
        if (ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // return;
        // 2文字以上の回文を持たない
        // -> abc, acb, bac, bca, cab, cba
        // -> abcabcabcab
    }
}
