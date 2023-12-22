import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long h = Long.parseLong(sc.next());
            list.add(h);
        }
        Collections.sort(list, Comparator.reverseOrder());
        long ans = 0;
        long l = 0;
        long r = list.get(0) / b;
        while (l < r) {
            long temp = (l + r) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                long h = list.get(i);
                if (h > b * temp) {
                    cnt += Math.ceil((h - b * temp) * 1.0 / (a - b));
                }
            }
            if (temp >= cnt) {
                r = temp;
            } else {
                l = temp + 1;
            }
        }
        System.out.println(l);
    }
}