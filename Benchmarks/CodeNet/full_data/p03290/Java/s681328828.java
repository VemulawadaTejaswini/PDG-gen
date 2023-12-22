import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int g = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            p.add(sc.nextInt());
            c.add(sc.nextInt());
        }
        int min = 101;
        for (int i = 0; i < d; i++) {
            int sum = p.get(i) * (i + 1) * 100 + c.get(i);
            if (sum >= g) {
                min = Math.min(min, p.get(i));
            }
        }


        int max = 0;
        int cnt = 0;
        for (int i = 0; i < d; i++) {
            for (int j = 1; j <= p.get(d - i - 1); j++) {
                max += (d - i) * 100;
                if (max >= g) {
                    min = Math.min(min, cnt + j);
                }
            }
            max += c.get(d - i - 1);
            cnt += p.get(d - i - 1);
        }
        System.out.println(min);
    }
}
