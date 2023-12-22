import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        char[] ch = sc.next().toCharArray();
        String ans = "";
        for (int i = 0; i < a; i++) {
            if (i == b - 1) {
                ans += Character.toLowerCase(ch[i]);
            } else {
                ans += ch[i];
            }
        }
        System.out.println(ans);
    }
}
