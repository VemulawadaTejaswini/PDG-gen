import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        long K = scan.nextLong();
        char[] data = S.toCharArray();
        char current = ' ';
        int count = 0;
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (current != data[i]) {
                if (0 < count) {
                    Pair p = new Pair();
                    p.x = current;
                    p.count = count;
                    list.add(p);
                }
                current = data[i];
                count = 0;
            }
            count += 1;
            if (i == data.length - 1) {
                Pair p = new Pair();
                p.x = current;
                p.count = count;
                list.add(p);
            }
        }
        if (list.get(0).x != list.get(list.size()-1).x) {
            long ans = 0;
            for (int i = 0; i < list.size(); i++) {
                int cnt = list.get(i).count;
                ans += cnt / 2;
            }
            System.out.println(ans * K);
            return;
        }
        if (list.size() == 1) {
            int first = list.get(0).count;
            long ans = (first*K) / 2;
            System.out.println(ans);
            return;
        }
        long ans = 0;
        for (int i = 1; i < list.size()-1; i++) {
            int cnt = list.get(i).count;
            ans += cnt / 2;
        }
        ans *= K;
        int first = list.get(0).count;
        int last = list.get(list.size()-1).count;
        ans += first/2;
        ans += last/2;
        ans += ((first+last)/2) * (K - 1);
        System.out.println(ans);
    }

    class Pair {
        char x;
        int count;
    }
}
