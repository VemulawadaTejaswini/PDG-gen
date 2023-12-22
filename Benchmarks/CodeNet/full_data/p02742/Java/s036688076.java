import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        long evCount;
        long odCount;
        if (w % 2 == 0) {
            odCount = w / 2;
            evCount = w / 2;
        } else {
            odCount = w / 2 + 1;
            evCount = w / 2;
        }
        long ans = 0;
        if (h % 2 == 0) {
            ans = (odCount + evCount) * (h / 2);
        } else {
            ans += odCount * (h / 2 + 1);
            ans += evCount * (h / 2);
        }
        System.out.println(ans);
    }
}
