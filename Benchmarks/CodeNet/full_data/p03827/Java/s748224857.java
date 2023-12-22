import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String b = sc.next();
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < a; i++) {
            if (b.charAt(i) == 'I') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt > max) max = cnt;
        }
        System.out.println(max);
    }
}
