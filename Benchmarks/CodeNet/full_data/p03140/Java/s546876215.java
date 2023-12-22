import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int ans = 0;
        for (int i = 0; i < x; i++) {
            Set<String> set = new HashSet<String>();
            set.add(a.substring(i, i + 1));
            set.add(b.substring(i, i + 1));
            set.add(c.substring(i, i + 1));
            ans += (set.size() - 1);
        }
        System.out.println(ans);
    }

}
