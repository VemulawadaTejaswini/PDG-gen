import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        char[] c1 = str1.toCharArray();
        String str2 = sc.next();
        char[] c2 = str2.toCharArray();
        
        for (int offset = 0; offset < n; offset++) {
            boolean ok = true;
            for (int i = 0; i < n-offset; i++) {
                if (c1[i+offset] != c2[i]) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) {
                System.out.println(n*2 - (n-offset));
                return;
            }
        }
        
        System.out.println(n*2);
    }
}