
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int ans = 0;
        for (int i = 0;i<=n-3;i++) {
            String str = s.substring(i, i+3);
            if (str.equals("ABS")) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
