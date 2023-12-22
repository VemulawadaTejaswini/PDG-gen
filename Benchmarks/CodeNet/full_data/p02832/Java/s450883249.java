import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++)
            num.add(sc.nextInt());
        int cnt = num.indexOf(1);
        for (int i = 0; i < n - 1; i++) {
            int tmp = num.indexOf(i + 1);
            int tmp2 = num.indexOf(i + 2);
            if (tmp == -1 || tmp2 == -1)
                break;
            cnt += tmp2 - tmp;
        }
        System.out.println(cnt);
    }
}
