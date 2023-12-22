import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            if (a - 3 >= 3) {
                a -= 3;
                cnt++;
            } else {
                cnt++;
                break;
            }
        }
        System.out.println(cnt);
    }
}
