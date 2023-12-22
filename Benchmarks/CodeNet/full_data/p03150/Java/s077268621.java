import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c1 = str.toCharArray();
        String s = "keyence";
        char[] c2 = s.toCharArray();
        
        int j = 0;
        boolean ok = true;
        int ngcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (j == 7 && ngcount <= 1) {
                System.out.println("YES");
                return;
            }
            if (c1[i] == c2[j]) {
                j++;
                ok = true;
            } else {
                if (ok) {
                    ngcount++;
                }
                ok = false;
            }
        }
            if (j == 7 && ngcount <= 1) {
                System.out.println("YES");
                return;
            }
        System.out.println("NO");
    }
}