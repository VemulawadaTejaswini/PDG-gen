import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            if (temp % 2 == 0) {
                a.add(temp);
            }
        }
        if (a.size() == 0) {
            System.out.println(0);
            return;
        }
        Collections.sort(a);
        int ans = 0;
        while (a.size() > 0) {
            ans++;
            for (int i = 0; i < a.size(); i++) {
                if (i == 0) {
                    a.set(i, a.get(i) / 2);
                } else {
                    a.set(i, a.get(i) * 3);
                }
            }
            if (a.get(0) % 2 != 0) {
                a.remove(0);
            }
        }
        System.out.println(ans);
    }
}