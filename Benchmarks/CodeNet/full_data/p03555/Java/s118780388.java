import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        char[] c = str.toCharArray();
        char[] c2 = str2.toCharArray();
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            if (c[i] != c2[2-i]) ok = false;
        }
        if(ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}