import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            String s = "" + i;
            if (s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3)) {
                ans++;    
            }    
        }
        System.out.println(ans);
    }
}
